(defproject kt-clj-http "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :plugins [[lein-ring "0.12.5"]
            [compojure "1.6.2"]]
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring "1.9.2"]
                 [compojure "1.6.2"]
                 [metosin/compojure-api "1.1.13"]
                 [org.clojure/tools.logging "1.1.0"]
                 [ring/ring-json "0.5.1"]
                 [ring/ring-core "1.7.1"]
                 [metosin/ring-http-response "0.9.2"]
                 [com.stuartsierra/component "1.0.0"]
                 [org.clojure/java.jdbc "0.7.12"]
                 [mysql/mysql-connector-java "5.1.25"]]
  :ring {:handler kt-clj-http.handler/wrapped-app
         :auto-reload? true
         :auto-refresh false}
  :repl-options {:init-ns kt-clj-http.core}
  :main kt-clj-http.core/main)
