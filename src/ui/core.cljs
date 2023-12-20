(ns ui.core
  (:require
   [reagent.dom :as rd]
   [ui.components.header :refer [header]]
   [ui.components.games :refer [games]]
   [ui.components.footer :refer [footer]]
   [ui.components.navbar :refer [navbar]]
   [ui.components.gameplay :refer [gameplay]]
   [ui.state :as state]))



(enable-console-print!)



(defn root []
  (let [content (:content @state/app-state)]
    [:div.container
     [header]
     [navbar]
     [games]
     [gameplay]
    ;; (or content [games])
     [footer]]))


(defn init
  []
  (rd/render [root]
             (. js/document (getElementById "app"))))

(defn on-js-reload [])

