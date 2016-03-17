(ns paypal-clj.config
  (:require [cprop.core :refer [load-config cursor]]))

(def config (load-config))

(def credentials (cursor config :credentials))
(def client-id (credentials :client-id))
(def client-secret (credentials :client-secret))
