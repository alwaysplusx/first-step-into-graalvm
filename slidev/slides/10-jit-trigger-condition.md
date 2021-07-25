# Awesome JIT

&nbsp;

**Java JIT 触发优化的过程**

- 阈值: 调用次数以及循环回边次数
  - `-XX:CompileThreshold`: 超出阈值将触发即时编译

<br>
<div class="jit-trigger-condition">
<img src="/images/JIT.png">
</div>

<style scope>
  .jit-trigger-condition {
    position: absolute;
    width: 640px;
    bottom: 90px;
    left: 140px;
  }
</style>
<!--
可以看出JIT编译器是以方法为单位的

- 触发编译的阈值
  - 调用次数和循环回边的次数的和
  - `-XX:CompileThreshold`

C1 默认 1500, C2 默认 10000

开启分层编译的情况下, 参数设置的阈值将会失效
-->
