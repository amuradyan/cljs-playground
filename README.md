# A ClojureScript playground

## Usage

To run the tests with a watcher, do

    lein with-profile dev test-refresh

To get a JS file to run on node do

    clj -M -m cljs.main -t node -O simple -o js/main.js -c cljs-first.js

Then try it out like so

    node js/main.js Ruzik

The code above should print `Ruzikant`
