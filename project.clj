(defproject hello-world "0.1.0-SNAPSHOT"
  :description "A hello, world application for atom-shell"
  :url "http://github.com/frankhale/hello-atom-shell"
    :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2202"]]
  :plugins [[lein-cljsbuild "1.0.3"]]
  :cljsbuild
	{:builds
		[{:source-paths ["src"],
		  :id "dev",
		  :compiler
			{:output-to "main.js",
			 :optimizations :whitespace
			 :pretty-print true}}]})
