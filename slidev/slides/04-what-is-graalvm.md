# What is GraalVM?

&nbsp;

**GraalVM Architecture**

- 🕹️ Java HotSpot VM
- 🍭 GraalVM compiler (JIT Compiler)[^1]
- 🚉 Truffle Language Implemention Framework

<img
  v-click="1" class="example-image" 
  src="https://www.graalvm.org/docs/img/graalvm_architecture_community.png"
/>

<div v-click="2">

**Runtime Mode**

- JVM Runtime Mode
- Native Image
- <span class="emphasize-text">Java On Truffle (experimental)</span>
  - `java -truffle [options] class`
  - `java -truffle --java.JavaHome=/path/to/java/home -version`

</div>

[^1]: 1.[ Javac Compiler vs JIT Compiler](/images/compiler.jpg)

<style>

.example-image {
  position: absolute;
  top: 120px;
  right: 0px;
  width: 510px;
}

</style>

<!--

GraalVM compiler(jit):

sourcecode  ->  bytecode  ->  machine code

 └─── javac ───┘   └─── jit ────┘

Truffle Framework: implemnets by graalvm

jvm run time mode: java code 通过顶级编译器(graalvm compiler)编译直接运行在jvm上, 其他语言通过truffle拦截并解析后运行在vm中

native image: 是一项创新技术, 将java bytecode 编译为执行文件

java on truffle: 21.0.0 实验版本, 是一个完整的 java 虚拟机规范实现, 基于 truffle framework
- 单独安装: gu install espresso / gu install -L espresso.jar
- run with truffle: java -truffle

-->
