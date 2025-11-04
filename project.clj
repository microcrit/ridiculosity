(defproject ridiculosity "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.3"]
                 [http-kit "2.8.1"]
                 [compojure "1.7.2"]
                 [ring/ring-core "1.15.3"]
                 [ring/ring-jetty-adapter "1.15.3"]]
  :main ^:skip-aot ridiculosity.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]},
             :antq {:dependencies [[com.github.liquidz/antq "RELEASE"]]}}
  :aliases {"outdated" ["with-profile" "antq" "run" "-m" "antq.core"]})