(ns paypal-clj.access-token
  (:require [paypal-clj.config :as config]))

(defn access-token []
  (doto (com.paypal.base.rest.OAuthTokenCredential.
         config/client-id
         config/client-secret
         (java.util.HashMap. {"mode" "sandbox"}))
    (.getAccessToken)))

