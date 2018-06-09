(defproject org.zeromq/cljzmq "0.1.5"
  :description "Clojure binding for ØMQ"
  :url "https://github.com/zeromq/cljzmq"
  :license {:name "LGPLv3+"
            :url "http://www.gnu.org/licenses/lgpl.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
;;; Uncomment the next line when not using jeromq pure java zeromq.                  
               #_[org.zeromq/jzmq "3.1.0"]]
  :codox {:src-dir-uri "http://github.com/zeromq/cljzmq/blob/master"
          :src-linenum-anchor-prefix "L"}
  :profiles
  {:1.7.0 {:dependencies [[org.clojure/clojure "1.7.0"]]}
   :1.8.0 {:dependencies [[org.clojure/clojure "1.8.0"]]}}
  :aliases {"all" ["with-profile" "dev:1.5.1:1.6.0:1.7.0"]}
  :repositories [["releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2/"
                              :username [:gpg :env/NEXUS_USERNAME]
                              :password [:gpg :env/NEXUS_PASSWORD]}]
                 ["snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                               :username [:gpg :env/NEXUS_USERNAME]
                               :password [:gpg :env/NEXUS_PASSWORD]
                               :update :always}]]
;;; Uncomment next line (to use /usr/local/lib/libjzmq.a) when not using jeromq. 
;;;:jvm-opts ^:replace ["-Djava.library.path=/usr/lib:/usr/local/lib"]
  :pom-addition [:developers
                 [:developer
                  [:name "Trevor Bernard"]
                  [:email "trevor.bernard@gmail.com"]]
                 [:developer
                  [:name "Josh Comer"]
                  [:email "jcomer@liveops.com"]]
                 [:developer
                  [:name "Ian Bishop"]
                  [:email "ibishop@liveops.com"]]]
  :min-lein-version "2.0.0")
