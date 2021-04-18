(ns kt-clj-http.core
  (:use compojure.core)
  (:require [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "Healthy")
  (GET "/sayhi" [] "Hi!")
  (route/resources "/")
  (route/resources "/sayhi")
  (route/not-found {}))