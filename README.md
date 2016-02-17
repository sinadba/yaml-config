# *yaml-config*
使用 `SnakeYAML`(YAML解析器)配置管理storm topo配置文件。  
[Wikipedia](https://zh.wikipedia.org/wiki/YAML):point_down:
```txt
YAML的语法和其他高阶语言类似，并且可以简单表达清单、散列表，标量等资料形态。
```

---------------------
## 使用方法
- 默认从`本地文件系统`加载配置文件
```java
Config conf = new ConfigLoader().loadStormConfig("yaml file path");
```
- 从`HDFS`加载配置文件
```java
Config conf = new ConfigLoader("HDFS").loadStormConfig("yaml file path");
```
