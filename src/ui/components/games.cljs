(ns ui.components.games
  (:require
   [ui.games.infinitexo :as infinitexo]
   [ui.components.card :refer [card]]))



(defn games []
  [:div.p-10.grid.grid-cols-1.sm:grid-cols-1.md:grid-cols-2.lg:grid-cols-3.xl:grid-cols-3.gap-5
   [card 0]
   [card 1]
   [card 2]])

