### Build History

```text
> mvn clean package -Pnative -DskipTests
...
[native-playground:32205]     (clinit):   1,541.20 ms,  5.23 GB
[native-playground:32205]   (typeflow):  28,824.01 ms,  5.23 GB
[native-playground:32205]    (objects):  41,737.90 ms,  5.23 GB
[native-playground:32205]   (features):   3,908.46 ms,  5.23 GB
[native-playground:32205]     analysis:  78,920.62 ms,  5.23 GB
[native-playground:32205]     universe:   3,938.72 ms,  5.23 GB
[native-playground:32205]      (parse):   6,241.95 ms,  5.23 GB
[native-playground:32205]     (inline):  25,440.27 ms,  5.87 GB
[native-playground:32205]    (compile): 128,124.63 ms,  7.08 GB
[native-playground:32205]      compile: 173,706.97 ms,  7.08 GB
[native-playground:32205]        image:  15,143.89 ms,  7.02 GB
[native-playground:32205]        write:   2,652.18 ms,  7.02 GB
# Printing build artifacts to: native-playground.build_artifacts.txt
[native-playground:32205]      [total]: 283,590.66 ms,  7.02 GB
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  05:04 min
[INFO] Finished at: 2021-08-10T08:55:02+08:00
[INFO] ------------------------------------------------------------------------
```

