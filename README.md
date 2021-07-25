## Slide

```shell
cd slidev
npm install
npm run dev
# visit http://localhost:3030
```

## Reference

- GraalVM Official Demo: https://github.com/graalvm/graalvm-demos.git
- GraalVM JIT Compiler Vs C2 Complier: https://github.com/martijndwars/battle-of-the-jits.git

## JMH

```shell
java -XX:+UnlockDiagnosticVMOptions \
  -XX:+LogCompilation \
  -XX:+PrintAssembly \
  -XX:+PrintInterpreter \
  -XX:+PrintNMethods \
  -XX:+PrintNativeNMethods \
  -XX:+PrintSignatureHandlers \
  -XX:+PrintAdapterHandlers \
  -XX:+PrintStubCode \
  -XX:+PrintCompilation \
  -XX:+PrintInlining \
  -XX:+TraceClassLoading \
  -jar benchmarks.jar -lprof
```
