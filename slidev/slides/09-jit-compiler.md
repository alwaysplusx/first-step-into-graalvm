# What GraalVM Compiler?

&nbsp;

**GraalVM Complier**

- 纯 Java 编写的动态 JIT Compiler (transforms bytecode into machine code)
- 与 Java HotSpot VM 集成, 基于 [JVMCI](https://openjdk.java.net/jeps/243)

**GraalVM Complier Advantages**

- 通过独特的代码分析和方法优化为运行在 JVM 上的程序提供性能优化
- 多种优化算法 (called Phases)[^1]
  - 方法内联、部分逃逸分析、Global Value Numbering 等
  - GraalVM EE 拥有 62 优化阶段, 并拥有其中 27 项目专利
- 对新特性的优化更加友好, 如: Streams、Lambdas

[^1]: 1.[Compiler Configuration](https://www.graalvm.org/reference-manual/java/options/)

<!--

更加激进的优化

JVM 会在解析执行的时候收集程序运行的各种信息, 而后编译器会根据这些信息进行预测优化(激进)
  - 如: 分支预测-选择性的编译一些概率较大的分支. 所以峰值性能通常要比C2更好
  - 由于需要优化的内容变多, 所以达到峰值的时间点要比C2晚

由于是纯 Java 编写, 对 Java 新特性的优化支持更加优秀

-->
