# Spring Native (beta)

&nbsp;

**Dependency**

- `spring-native:${version}`
- `spring-aot-maven-plugin:${version}`
- `spring-boot-maven-plugin:${version}`


**Supports**

| Annotations                              | Configuration File          | 说明                                    |
| :--------------------------------------- | :-------------------------- | :-------------------------------------- |
| `@ResourceHint`                          | `resource-config.json`      | 资源相关                                |
| `@SerializationHint`                     | `serialization-config.json` | Java 序列化 &nbsp; &nbsp; &nbsp; &nbsp; |
| `@TypeHint`, `@FieldHint`, `@MethodHint` | `relect-config.json`        | 反射相关                                |
| `@JdkProxyHint`, `@AopProxyHint`         | `proxy-config.json`         | 代理相关                                |

<div class="more-options">

**Let's you library support spring-native**

- `spring-aot:${version}`
- `NativeConfiguration`

</div>

<style>
  .more-options {
    position: absolute;
    right: 50px;
    top: 110px;
    width: 420px;
  }
</style>
