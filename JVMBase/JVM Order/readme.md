# JVM HotSpot Start param List:
#### JVM HotSpot 的启动参数列表：
### 虚拟机运行数据区大小相关
1. -Xms JVM堆最小值 : -Xmx20m (最小值20m)
2. -Xmx JVM堆最大值 : -Xmx20m (最大值20m)
3. -Xoss 本地方法栈大小 : -Xoss20m (本地方法栈20m)
    
    -Xoss 参数对HotStop无效，但是可以接受此参数
4. -Xss 栈容量

### 虚拟机辅助指令
1. -XX:+HeapDumpOnOutOfMemoryError
    
    当设置此参数后，虚拟机出现内存溢出异常时，Dump出当前的内存堆转储快照
    此命令可以让开发人员进行分析OOM等内存异常发生的原因和过程