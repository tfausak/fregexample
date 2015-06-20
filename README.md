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
happen.

There is a test suite. Like the REPL, it is also in Clojure. You can run it
with:

``` sh
$ lein test
```

It would be nice to use something like [FrUnit][] to run the tests in Frege,
but I don't know how to do that either.

This project borrows liberally from [frege-lein-template][].

[fregexample]: https://github.com/tfausak/fregexample
[frege]: https://github.com/Frege/frege
[leiningen]: http://leiningen.org
[frege repl]: https://github.com/Frege/frege-repl
[frunit]: https://github.com/melrief/FrUnit
[frege-lein-template]: https://github.com/Frege/frege-lein-template
