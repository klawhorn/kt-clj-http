(defproject kt-clj-http "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :plugins [[lein-ring "0.12.5"]
            [compojure "1.6.2"]]
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring "1.9.2"]
                 [compojure "1.6.2"]]
  :ring {:handler kt-clj-http.core/app-routes
         :auto-reload? true
         :auto-refresh false}
  :repl-options {:init-ns kt-clj-http.core})