# Native Image

&nbsp;

**Install Native Image**

- GraalVM Updater
  - `gu install native-image`

**Ahead-of-time Compilation**

- _Native Image_
- translates Java and JVM-base code into native platform executable
- instant start, smaller, consume less resources
- ideal for cloud deployments and microservices

<!--
- Java code to standalone executable
  - application classes
  - application dependencies classes
  - runtime library classes
  - statically linked native code from JDK
- Not run on JVM but include necessary components
  - memory management
  - thread scheduling
  - and so on, called "Substrate VM"
- faster startup time, lower runtime memory
-->
