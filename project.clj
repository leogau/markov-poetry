(defproject markov-elear "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [overtone/at-at "1.2.0"]
                 [twitter-api "1.8.0"]
                 [environ "1.1.0"]]
  :plugins [[lein-environ "1.1.0"]]
  :repl-options {:init-ns markov-elear.generator}
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.24.1"]]}}
  :main markov-elear.generator
  :min-lein-version "2.0.0")