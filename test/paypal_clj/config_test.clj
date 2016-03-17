(ns paypal-clj.config-test
  (:require [clojure.test :refer :all]
            [paypal-clj.config :refer :all]))

(deftest load-config
  (testing "Loading edn config from /resources"
    (is (= client-id "AYSq3RDGsmBLJE-otTkBtM-jBRd1TCQwFf9RGfwddNXWz0uFU9ztymylOhRS"))))
