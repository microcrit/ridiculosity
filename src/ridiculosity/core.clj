(ns ridiculosity.core
  (:gen-class)
  (:require [org.httpkit.server :as http] [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]))

(defroutes app
  (GET "/" [] "<h1>Hello World</h1>")
  (route/not-found "<h1>Page not found</h1>"))

(defn -main
  [& args]
  (http/run-server app {:port 8080}))