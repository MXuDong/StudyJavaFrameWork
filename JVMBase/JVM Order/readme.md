# JVM HotSpot Start param List:
#### JVM HotSpot 的启动参数列表：
1. -Xms JVM堆最小值 : -Xmx20m (最小值20m)
2. -Xmx JVM堆最大值 : -Xmx20m (最大值20m)
3. -XX:+HeapDumpOnOutOfMemoryError
    当设置此参数后，虚拟机出现内存溢出异常时，Dump出当前的内存堆转储快照
    此命令可以让开发人员进行分析OOM等内存异常发生的原因和过程
4.