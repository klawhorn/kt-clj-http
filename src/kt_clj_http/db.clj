(ns kt-clj-http.db)

;; Add values to spec before using.
(def db-spec
  {:dbtype "mysql"
   :user "db_user"
   :password "db_password"
   :host "localhost"
   :port "3306"
   :classname "com.mysql.jdbc.Driver"
   :subprotocol "mysql"
   :subname "//localhost:3306/test1"})