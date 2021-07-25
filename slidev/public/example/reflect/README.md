**Complation Source Code**

```shell
javac src/com/example/* -d classes
```

**Build Native Image**

```shell
native-image --no-fallback -cp ./classes com.example.ReflectExample reflect
```

**Build Native Image with config file**

```shell
native-image --no-fallback \
  -H:ReflectionConfigurationResources=reflect-config.json \
  -cp ./classes com.example.ReflectExample reflect
```
