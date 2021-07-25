# Why GraalVM?

&nbsp;

**For Java**

- 更佳的峰值性能
  - Twitter 服务性能提升`22%`[^1] (GraalVM EE)
  - 美团`TP9999`由`60ms↓50ms`, 幅度`16.7%`
- 更少的资源消耗, CPU 以及内存
  - User CPU Time `↓11%`
  - Old Gen Used `↓40MB`
  - PS Scavenge Cycles `↓2.5%~2.7%`
- 异构语言的扩展性[^2]
- 构建机器可直接执行的应用程序 (Native Image)

<div class="polyglot-example" v-click="1">

```java {all|3|4|5|all}
import org.graalvm.polyglot.*;
{
  Context context = Context.create("js");
  Value parse = context.eval("js", "JSON.parse");
  Value parsedValue = parse.execute("{\"foo\":\"bar\"}");
  Value memberValue = parsedValue.getMember("foo");
  System.out.println(memberValue.asString());
}
``` 

</div>

[^1]: 1.[Twitter's quest for a wholly Graal runtime](https://www.youtube.com/watch?v=pR5NDkIZBOA)
[^2]: 2.[PrettyPrintJSON.java](/example/PrettyPrintJSON.java)

<style>
  .polyglot-example {
    position: absolute;
    right: 50px;
    bottom: 120px;
    width: 460px;
  }
</style>

<!--

Twitter
- 服务性能提升了22%(GraalVM EE)
- CPU 使用率降低 11%
- 根据云服务CPU使用价格计算, $127/year per CPU core
-->
