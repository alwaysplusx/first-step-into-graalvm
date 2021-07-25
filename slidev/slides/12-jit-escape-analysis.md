# Awesome JIT - Partial Escape Analysis

&nbsp;

<div class="escape-code-before">

**Scalar replacement**[^1]

```java {all|7-8}
public class ScalarReplacement {
  int x, y;
  boolean flag = randomBool();

  public void split(Blackhole blackhole) {
    for (int i = 0; i < 300; i++) {
      Value o = flag ? new Value(x) : new Value(y);
      blackhole.consume(o.x);
    }
  }
}
public class Value{
  public int x;
  Value(int x) {
    this.x = x;
  } 
}
```

</div>

<div class="escape-code-after" v-click="2">

```java {all|7-8}
public class ScalarReplacement {
  int x, y;
  boolean flag = randomBool();

  public void split(Blackhole blackhole) {
    for (int i = 0; i < 300; i++) {
      int val = flag ? x : y;
      blackhole.consume(val);
    }
  }
}
public class Value{
  public int x;
  Value(int x) {
    this.x = x;
  } 
}
```

</div>

[^1]: 1.[ScalarReplacement Escape Analysis Details](https://shipilev.net/jvm/anatomy-quarks/18-scalar-replacement/#_practice)

<style>
  .escape-code-before {
    width: 410px;
  }
  .escape-code-after {
    position: absolute;
    right: 50px;
    top: 168px;
    width: 410px;
  }
</style>

<!--

逃逸分析通常是在方法内联的基础上进行

Value 对象创建后仅在方法内部使用. 没有发生逃逸, 这样编辑器就可以对 Value 进行优化

- 方法逃逸: 对象被传入未知代码中(内联可以消除未知代码)
- 线程逃逸: 对象被存入堆中

即时编译器可以根据逃逸分析的结果进行诸如
- 锁消除
- 栈上分配
- 标量替换


-->