(ns ui.components.login
  (:require [ui.state :refer [app-state]]))

(defn- set-login [visible]
  (swap! app-state assoc :login-visible visible))

(defn login-button []
  (let [visible (:login-visible @app-state)]
    [:<>
     [:button.login
      {:on-click #(set-login true) ;;getElementById('id01').style.display='none'
       :style {:width "auto"}}

      "Login"]
     [:div.modal
      {:id "id01"
       :style {:display (if visible "block" "none")}}
      [:form.modal-content.animate
       {:action "/action_page.php"
        :method "post"}
       [:div.imgcontainer
        [:span.close
         {:on-click #(set-login false)
          :title "Close Modal"}
         "×"]]
       ;; [:img.avatar {:src "/assets/images/img_avatar2.png" :alt "Avatar"}]]
       [:div.container
        [:label {:for "uname"} [:b "Username"]]
        [:input
         {:type "text"
          :placeholder "Enter Username"
          :name "uname"
          :required ""}]
        [:label {:for "psw"} [:b "Password"]]
        [:input
         {:type "password"
          :placeholder "Enter Password"
          :name "psw"
          :required ""}]
        [:button {:type "submit"} "Login"]
        [:label
         [:input {:type "checkbox" :name "remember" :on-change #(println "changing value")}]
         "Remember me"]]
       [:div.container
        {:style {:background-color "#f1f1f1"}}
        [:button.cancelbtn
         {:type "button"
          :on-click #(set-login false)}
         "Cancel"]
        [:span.psw [:a {:href "#"} "Forgot password?"]]]]]]))
