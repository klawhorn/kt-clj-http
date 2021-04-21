(ns kt-clj-http.core
  (:require [clojure.tools.logging :as log]
            [environ.core :refer [env]]
            [clojure.java.jdbc :as jdbc]))

;; define main
; (defn -main [& args]
;   (try
;     (let [system (component/start (new-system config))]
;       ;(util.app/add-shutdown-hook! system)
;       )
;     (catch Throwable e
;       (log/error e "Error during application startup"))))
