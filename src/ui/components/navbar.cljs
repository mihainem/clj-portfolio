(ns ui.components.navbar
  (:require
   [ui.components.login :refer [login-button]]
   [reagent.core :as r]))

(defn navbar []
  (let [page-y-offset (. js/window -pageYOffset)
        sticky (r/atom 10)]

    [:div
     {:id "navbar"
      :className (if (>= page-y-offset @sticky) "sticky" "")
      :on-scroll #(reset! sticky (.offsetTop %))}
     [:a {:class "active", :href "javascript:void(0)"} "Home"]
     [:a {:href "javascript:void(0)"} "News"]
     [:a {:href "javascript:void(0)"} "Contact"]
     [login-button]]))

 ;;if (window.pageYOffset >= sticky) 
 ;; {navbar.classList.add ("sticky")} 
 ;;else 
 ;; {navbar.classList.remove ("sticky")});
                                                                          
