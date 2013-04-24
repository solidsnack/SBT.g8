# SBT.g8
A [giter8](http://github.com/n8han/giter8) template for [SBT](http://scala-sbt.org) multi-project builds.

## Usage

With `giter8` installed:

    $ g8 GenslerAppsPod/SBT

## SBT Plugins

Projects created using this template automatically get:

### [SCCT](http://mtkopone.github.io/scct/)
A test coverage tool.  To use it, run the SBT task `scct:test`.

### [Scalastyle](http://www.scalastyle.org)
A code smell tool.  To use it, run the SBT task `scalastyle`.  The options are set in `scalastyle-config.xml`.

### [Scalariform](https://github.com/sbt/sbt-scalariform)
A style enforcer.  To use it, run the SBT task `scalariform-format`.  This may __rewrite the contents__ of your source files!  Check the diffs before committing any auto-formatted code.

