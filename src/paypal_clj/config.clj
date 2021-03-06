(ns paypal-clj.config
  (:require [cprop.core :refer [load-config cursor]]
            [clojure.java.io :as io]
            [clojure.edn :as edn]))

(def config (load-config))

(def credentials (cursor config :credentials))
(def client-id (credentials :client-id))
(def client-secret (credentials :client-secret))
