(ns ui.components.header
  (:require [ui.state :refer [app-state]]))

(defn header []
  (let [{:keys [title]} @app-state]
    [:header
     [:h1 title]]))
   
   
