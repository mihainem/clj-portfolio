(ns ui.state
  (:require
   [reagent.core :as r]))

(def app-state (r/atom {:title "Clojure Portfolio"
                        :login-visible false}))

