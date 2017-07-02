https://github.com/weibocom/motan



# consul

ZooKeeper, doozerd, and etcd are all similar in their architecture. All three have server nodes that require a quorum of nodes to operate (usually a simple majority). They are strongly-consistent and expose various primitives that can be used through client libraries within applications to build complex distributed systems.

Consul also uses server nodes within a single datacenter. In each datacenter, Consul servers require a quorum to operate and provide **strong consistency**. However, Consul has native support for multiple datacenters as well as a more feature-rich gossip system that links server nodes and clients.



https://www.consul.io/intro/getting-started/install.html

https://www.consul.io/assets/images/consul-arch-420ce04a.png

---

created at 2017-07-01 23:56