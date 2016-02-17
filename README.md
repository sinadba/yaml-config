# *yaml-config*
使用 `SnakeYAML`(YAML解析器)配置管理storm topo配置文件。  
`YAML` 是一种和`JSON`类似的数据序列化标准，小巧易用。
:point_right:[Wikipedia](https://zh.wikipedia.org/wiki/YAML)

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
