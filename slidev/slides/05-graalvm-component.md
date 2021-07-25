# GraalVM Components

&nbsp;

**Available Distributions**

- 社区版: GraalVM CE Base on OpenJDK
- 企业版: GraalVM EE Base on Oracle JDK
- Support JDK Version: 8/11/16

**Components List**

- Core Components
  - Runtimes: Java HotSpot VM, JavaScript runtime, LLVM runtime
  - Libraries: GraalVM compiler, Polyglot API
  - Utilites: GraalVM Updater
- Additional Components
  - Tools/Utilites: Native Image, Java on Truffle
  - Others Runtimes: Node.js, Python, Ruby and so on

<!--

核心组件与可选组件

* java -version
* js -version
* lli -version (platform only)

Polyglot API (跨语言上下文)
- [maven dependency](https://search.maven.org/artifact/org.graalvm.sdk/graal-sdk/21.1.0/jar)
- [online javadoc](https://www.graalvm.org/sdk/javadoc/org/graalvm/polyglot/package-summary.html)

可选组件通过 GraalVM Updater 来获得
- gu --help
- gu install native-image

nodejs-v14.16.1, python-v3.8.5, ruby-v2.7.2, r-4.0.3 ...

-->
