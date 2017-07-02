# Motan

https://github.com/weibocom/motan



# consul

ZooKeeper, doozerd, and etcd are all similar in their architecture. All three have server nodes that require a quorum of nodes to operate (usually a simple majority). They are strongly-consistent and expose various primitives that can be used through client libraries within applications to build complex distributed systems.

Consul also uses server nodes within a single datacenter. In each datacenter, Consul servers require a quorum to operate and provide **strong consistency**. However, Consul has native support for multiple datacenters as well as a more feature-rich gossip system that links server nodes and clients.



https://www.consul.io/intro/getting-started/install.html

https://www.consul.io/docs/internals/architecture.html

https://www.consul.io/assets/images/consul-arch-420ce04a.png



# zookeeper

ZooKeeper was designed to store coordination data: status information, configuration, location information, etc., so the data stored at each       node is usually small, in the byte to kilobyte range.

The data stored at each znode in a namespace is read and written atomically. Reads get all the data bytes associated with a znode and a       write replaces all the data.



As part of the agreement protocol all write requests from clients are forwarded to a single server, called the *leader*. The rest of the ZooKeeper servers, called *followers*, receive message proposals from the leader and agree upon message delivery. The messaging layer takes care of replacing leaders on failures and syncing followers with leaders.

http://zookeeper.apache.org/doc/trunk/zookeeperOver.html

​	

## Getting Started

###  /conf/zoo.cfg

```
tickTime=2000
dataDir=D:\zoodata
clientPort=2181
```

> note: path can't have space code e.g. `D:\Program Files\zookeeper-3.4.10\user-define-data`



### start cmd

```
zkServer.cmd
```





---

created at 2017-07-01 23:56