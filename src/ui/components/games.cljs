(ns ui.components.games
  (:require
   [ui.components.card :refer [card]]))

(def games-map {:infinitexo {:title "Infinitexo"
                             :description "A game of infinite tic-tac-toe"
                             :tags ["leiningen" "clojurescript" "figwheel" "game"]
                             :url "https://mihainem.github.io/infinite-xo/"}
                :tennis {:title "Tennis"
                         :description "A score keeper in a tennis game"
                         :tags ["Clojure CLI " "clojure" "kaocha" "repo"]
                         :url "https://github.com/mihainem/tennis"}})


(defn games []
  [:div.p-10.grid.grid-cols-1.sm:grid-cols-1.md:grid-cols-2.lg:grid-cols-3.xl:grid-cols-3.gap-5
   (map
    #(card (val %)) games-map)])
   
