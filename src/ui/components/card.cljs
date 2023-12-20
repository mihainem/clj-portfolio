(ns ui.components.card
  (:require [ui.state :refer [app-state]]))

(defn card [game]
  (let [{:keys [title description tags url]} game]
    [:div
     {:key (random-uuid)
      ;;on-click open new browser window to url
      :on-click (fn [e] (js/window.open url "_blank"))
      :class "cursor-pointer rounded overflow-hidden shadow-lg"}
     [:img {:class "w-full", :src "https://source.unsplash.com/random/photos?topics=game", :alt "game"}] ;;/assets/images/img_avatar2.png
     [:div
      {:class "px-6 py-4"}
      [:div {:class "font-bold text-xl mb-2"} title]
      [:p
       {:class "text-gray-700 text-base"}
       description]]
     [:div
      {:class "px-6 pt-4 pb-2"}
      (map
       (fn [tag] [:span
                  {:class
                   "inline-block bg-gray-200 rounded-full px-3 py-1 text-sm font-semibold text-gray-700 mr-2 mb-2"}
                  (str "#" tag)]) tags)]]))
