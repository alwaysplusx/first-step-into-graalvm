**Complation Source Code**

```shell
javac src/com/example/* -d classes
```

**Directory layout**
```txt
├── classes
│   ├── com
│   │   └── example
│   │       ├── Echo.class
│   │       ├── Greeting.class
│   │       └── ReflectExample.class
│   └── reflect-config.json
└── src
    └── com
        └── example
            ├── Echo.java
            ├── Greeting.java
            └── ReflectExample.java
```

**Build Native Image**

```shell
# fallback
native-image -H:+ReportExceptionStackTraces \
  -cp ./classes com.example.ReflectExample reflect

# no-fallback
native-image --no-fallback \
  -H:+ReportExceptionStackTraces \
  -cp ./classes com.example.ReflectExample reflect
```

**Build Native Image with config file**

```shell
native-image --no-fallback \
  -H:+ReportExceptionStackTraces \
  -H:ReflectionConfigurationResources=reflect-config.json \
  -cp ./classes com.example.ReflectExample reflect
```

**reflect-config.json**
```json
[
  {
    "name": "com.example.Greeting",
    "allDeclaredFields": true,
    "allDeclaredConstructors": true,
    "allDeclaredMethods": true
  }
]
```