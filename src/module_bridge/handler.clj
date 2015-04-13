(ns module-bridge.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [module-bridge.views.layout :as layout]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] (layout/layout "Ok. Do"))
  (route/not-found "Not Found"))

(def app (wrap-defaults app-routes site-defaults))

