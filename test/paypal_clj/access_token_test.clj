(ns paypal-clj.access-token-test
  (:require [clojure.test :refer :all]
            [paypal-clj.access-token :refer :all]))

(deftest access-token-string
  (testing "Access token Oauth string"
    (is (.startsWith
         (str (access-token))
         "com.paypal.base.rest.OAuthTokenCredential@"))))

