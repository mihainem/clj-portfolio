(ns ui.components.card)

(defn card [n]
  [:div ;;https://api.unsplash.com/photos/?client_id=YOUR_ACCESS_KEY
   {:key n
    :class "rounded overflow-hidden shadow-lg"}
   [:img {:class "w-full", :src "https://source.unsplash.com/random/photos?query=game&topics=game", :alt "Mountain"}] ;;/assets/images/img_avatar2.png
   [:div
    {:class "px-6 py-4"}
    [:div {:class "font-bold text-xl mb-2"} "Mountain"]
    [:p
     {:class "text-gray-700 text-base"}
     "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus quia, Nonea! Maiores et perferendis eaque, exercitationem praesentium nihil."]]
   [:div
    {:class "px-6 pt-4 pb-2"}
    [:span
     {:class
      "inline-block bg-gray-200 rounded-full px-3 py-1 text-sm font-semibold text-gray-700 mr-2 mb-2"}
     "#photography"]
    [:span
     {:class
      "inline-block bg-gray-200 rounded-full px-3 py-1 text-sm font-semibold text-gray-700 mr-2 mb-2"}
     "#travel"]
    [:span
     {:class
      "inline-block bg-gray-200 rounded-full px-3 py-1 text-sm font-semibold text-gray-700 mr-2 mb-2"}
     "#winter"]]])
