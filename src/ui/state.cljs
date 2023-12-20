(ns ui.state
  (:require
   [reagent.core :as r]))

(def app-state (r/atom {:title "Clojure Portfolio"
                        :content nil
                        :login-visible false}))

