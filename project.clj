(defproject hello-world "0.2.0-SNAPSHOT"
  :description "A hello, world application for atom-shell"
  :url "http://github.com/frankhale/hello-atom-shell"
    :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2740"]]
  :plugins [[lein-cljsbuild "1.0.4"]]
  :cljsbuild
	{:builds
		[{:source-paths ["src"],
		  :id "dev",
		  :compiler
			{:output-to "main.js",
			 :optimizations :simple
			 :pretty-print true}}]})
