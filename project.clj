(defproject module-bridge "0.1.0-SNAPSHOT"
  :description "Module Bridge"
  :url "http://modulebridge.heroku.com"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [hiccup "1.0.5"]

                 [ring "1.3.2"]
                 [ring/ring-defaults "0.1.2"]]
  :plugins [[lein-ring "0.9.2"]]
  :ring {:handler module-bridge.handler/app
         :auto-reload? true
         :auto-refresh? true
         :reload-paths ["src" "resources"]}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]]}})
