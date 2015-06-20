# [Fregexample][]

An example [Frege][] ("free-guh") project.

The easiest way to get started is with [Leiningen][] ("line-ing-en"). Once you
have it installed, you can run this project with:

``` sh
$ lein run
```

You can also create a redistributable uberjar with:

``` sh
$ lein uberjar
$ java -jar target/fregexample-0.0.0-SNAPSHOT-standalone.jar
```

You can also start a Clojure REPL:

``` sh
$ lein repl
```

It would be nice to have a [Frege REPL][], but I don't know how to make that
happen. I opened [an issue][] for adding the Frege REPL to Leiningen.

There is a rudimentary test suite. You can run it with:

``` sh
$ lein with-profile test run
```

It would be nice to use [FrUnit][], but I haven't figured out how to do that
yet.

This project borrows liberally from [frege-lein-template][].

[fregexample]: https://github.com/tfausak/fregexample
[frege]: https://github.com/Frege/frege
[leiningen]: http://leiningen.org
[frege repl]: https://github.com/Frege/frege-repl
[an issue]: https://github.com/Frege/frege-lein-plugin/issues/3
[frunit]: https://github.com/melrief/FrUnit
[frege-lein-template]: https://github.com/Frege/frege-lein-template
