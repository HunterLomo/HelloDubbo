# HelloDubbo
Dubbo的hello world

1、zookeeper的配置启动
首先下载zookeeper,http://zookeeper.apache.org/
这里使用的是3.4.9的稳定版，将conf/zoo_sample.cfg 复制一份，重名为zoo.cfg修改配置如下：
dataDir=/tmp/zookeeper
clientPort=2181
其他参数含义自己可研究
运行 zkServer.cmd，启动 zookeeper


