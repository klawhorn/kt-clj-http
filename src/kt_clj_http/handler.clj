(ns kt-clj-http.handler
  (:require [clojure.tools.logging :as log]
            [compojure.api.sweet :refer
              [api POST GET PUT DELETE PATCH context defroutes]]
            [compojure.core :as compojure]
            [compojure.route :as route]
            [ring.middleware.cookies :as mid.cookies]
            [ring.middleware.json :as mid.json]
            [ring.middleware.params :as mid.params]
            [ring.util.http-response :as response]))

(defn handle-put [request]
  (println "----------------------- processing put --------------------------")
  (let [params (:params request)
        cookies (:cookies request)
        headers (:headers request)]
    (response/ok {:request-params params
                  :request-cookies cookies
                  :request-headers headers})))

(defn handle-post [request]
  (println "----------------------- processing post --------------------------")
  (let [params (:params request)
        cookies (:cookies request)
        headers (:headers request)]
    (response/ok {:request-params params
                  :request-cookies cookies
                  :request-headers headers})))

;; add context for high level routing
(defroutes app-routes
  (GET "/" request "Healthy")
  (route/resources "/")
  (POST "/users/:path-param" request
    (handle-post request))
  (route/resources "/post-handler")
  (PUT "/put-handler/:path-param" request
    (handle-put request))
  (route/resources "/put-handler")
  (route/not-found {}))

(def wrapped-app
  (-> app-routes
      (api {})
      ;; wraps all request cookies onto the :cookies key
      mid.cookies/wrap-cookies
      ;; wraps all query params, path params, and form params onto the :params key
      mid.params/wrap-params
      ;; translates map provided to response calls into json
      mid.json/wrap-json-response))