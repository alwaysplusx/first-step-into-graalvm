# Native Reflection

&nbsp;

**Reflection**

- Automatic Detection
  - `Class.forName(String)`
  - `Class.getField(String)`
- `-H:ReflectionConfigurationResources`

<div v-click="1">

**reflect-config.json**

<div class="native-refect-config-code">

```json
[
  {
    "name": "Greeting",
    "allDeclaredFields": true,
    "allDeclaredConstructors": true,
    "allDeclaredMethods": true
  }
]
```
</div>

</div>

<div class="native-reflection-code">

```java
public class ReflectionExample {
  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("Greeting");
    Method method = clazz.getDeclaredMethod("sayHi", String.class);
    Object instance = clazz.getDeclaredConstructors()[0].newInstance();
    Object result = method.invoke(instance, "wuxin");
    System.out.println(result);
  }
}

class Greeting {
  public String sayHi(String name) {
    return String.format("Hi %s!", name);
  }
}
```

</div>


<style scope>
  .native-reflection-code {
    position: absolute;
    right: 10px;
    top: 120px;
    width: 530px;
  }
  .native-refect-config-code {
    position: absolute;
    left: 55px;
    bottom: 40px;
    width: 320px;
  }
</style>

<!--

- `-H:+PrintClassInitialization`

-->
