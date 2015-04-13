(ns module-bridge.views.layout
  (:use [hiccup.page :refer [html5 include-css]]
        [hiccup.form :refer [form-to text-field password-field submit-button]]))


(def fira-sans "http://fonts.googleapis.com/css?family=Fira+Sans:300,400,500,700")

(defn head [title]
  [:head
   [:title title]
   [:link {:href fira-sans :rel "stylesheet" :type "text/css"}]
   (include-css "/css/screen.css")])

(defn universal-container [body]
  [:section {:id "universal"} body])

(defn layout [body]
  (html5
   (head "ModuleBridge")
   (universal-container [:body body])))

