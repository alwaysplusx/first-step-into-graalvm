# C2 VS Graal

&nbsp;

| **Compiler**           | **C2**                   | **Graal**                            |
| :--------------------- | :----------------------- | :----------------------------------- |
| Languages              | C++                      | Java                                 |
| For Developer Learning | 学习曲线陡峭             | 模块化设计便于理解                   |
| Streams and Lambdas    | 不友好                   | Java 编写, 更优的支持                |
| Method Inlining        | 一般                     | 激进的方法内联, 更佳的峰值性能       |
| Escape Analysis        | 不支持带控制流的逃逸分析 | 部分逃逸分析, 支持带控制流的逃逸分析 |
| New Major Releases     | 无                       | Java On Truffle, Native Image        |
| Performance[^1]        | -                        | Better then C2, Low memory and CPU   |

[^1]: 1.[Graal vs. C2: Battle of the JITs](https://martijndwars.nl/2020/02/24/graal-vs-c2.html)
