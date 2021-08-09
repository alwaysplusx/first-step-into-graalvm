# About GraalVM

&nbsp;

**GraalVM 前世今生**

- 💥 起源于 Sun Micorsystems Maxine Virtual Machine(2005), 目标是用 Java 编写 Java Virtual Machine

- 🎯 希望从 C 开发的问题中解放出来, 并从元循环(Meta-circular)受益

- 🐌 当意识到到目标过于巨大后, 决定尽可能多的重用 Hotspot 运行时, 采用 Hook 的方式嵌入定制编译器

<div v-click="1">

- 💰 Oracle Labs, 第一个生产就绪版本 GraalVM 19.0 已于 2019 年 5 月发布

- 🚄 一个高效的 Java 运行时, 对标 Native languages

- 🔥 &nbsp;为多语言设计消除语言间的隔离, 允许在单个程序中混合使用多种编程语言

- 🔊 支持多种基础环境运行: [Oracle Database](https://www.graalvm.org/examples/mle-oracle/), OpenJDK, Nodejs, Android/iOS

- 🌈 减少应用的启动时间 (AOT), 是实现程序微服务的理想方式

</div>

<!--

C 开发问题: JNI

元循环: 语言的自举, 嵌套运行时(自己运行自己)

* 以 native-languages 为目标, 提升 JVM 语言的性能
* 通过aot技术降低启动时间
* 多种嵌入式环境支持
* 应用程序不在受到语言的限制, 在一个应用程序中支持多种编程语言
* 支持通过扩展来实现语言运行

* To improve the performance of Java virtual machine-based languages to match the performance of native languages.
* To reduce the startup time of JVM-based applications by compiling them ahead-of-time with GraalVM Native Image technology.
* To enable GraalVM integration into the Oracle Database, OpenJDK, Node.js, Android/iOS, and to support similar custom embeddings.
* To allow freeform mixing of code from any programming language in a single program, billed as "polyglot applications".
* To include an easily extended set of "polyglot programming tools".

-->
