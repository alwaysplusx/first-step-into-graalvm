# Awesome JIT - Method Inlining

&nbsp;

**方法内联**
- <span class="emphasize-text">_将目标方法纳入编译方位之中, 取代原方法调用从而实现优化_</span>
  - 方法调用栈: 栈帧 (包含: 局部变量表、操作数栈等)
- 热点方法(方法调用次数)
  - `-XX:MinInliningThreshold`
  - `-XX:InlineFrequencyCount`
- 被内联的方法体不宜过大(编译后的字节码)
  - `-XX:MaxInlineSize`
  - `-XX:FreqInlineSize`

<img class="jit-inlining-picture" src="/images/inlining.png" v-click-hide="0">

<div class="jit-inlining-code-before" v-click="1">

```java
public class Inlining {
  public int sum(int a, int b, int c, int d) {
    return add(a, b) + add(c, d);
  }

  public int add(int x, int y) {
    return x + y;
  }
}
```

</div>

<div class="jit-inlining-code-after" v-after>

```java {all|3}
public class Inlining {
  public int sum(int a, int b, int c, int d) {
    return a + b + c + d;
  }

  public int add(int x, int y) {
    return x + y;
  }
}
```

</div>

<style>

  .jit-inlining-code-before {
    width: 360px;
    position: absolute;
    right: 40px;
    bottom: 240px;
  }
  
  .jit-inlining-code-after {
    width: 360px;
    position: absolute;
    right: 40px;
    bottom: 50px;
  }

  .jit-inlining-picture {
    position: absolute;
    top: 160px;
    right: 100px;
    width: 220px;
  }
</style>

<!--

方法内联: 在方法调用时, 将目标方法纳入编译方位之中, 并取代原方法调用的优化手段

Polymorphic inlining:
  - C2 仅针对具体的方法调用
  - GraalVM 可对抽象方法进行内联
  - `-XX:MaxFreqInlineSize=N`、`-XX:MaxInlineSize`
-->
