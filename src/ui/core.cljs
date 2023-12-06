(ns ui.core
  (:require
   [reagent.dom :as rd]
   [ui.components.header :refer [header]]
   [ui.components.games :refer [games]]
   [ui.components.footer :refer [footer]]
   [ui.components.navbar :refer [navbar]]))



(enable-console-print!)


(defn root []
  [:div.container
   [header]
   [navbar]
   [games]
   [footer]])


(defn init []
  (rd/render [root]
             (. js/document (getElementById "app"))))

(defn on-js-reload [])

