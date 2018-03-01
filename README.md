一 微服务部署平台
	1. 微服务多实例部署，负载均衡，服务发现，升级不断服
	


二  微服务治理

三 K8S Docker
    负责本部门首个全容器化改造版本（K8S，Docker）

四  安全相关

  秘钥管理：秘钥文件存储几次历史物料，兼容老密文解密
 使用k8s 的secret统一存储密文，支持秘钥替换
SSL证书：
单向认证：不认证对端，客户端不需要提供证书。客户端会认证服务端，服务端需要提供证书和公钥
双向认证：客户端需要提供

五  maven私服 Nexus
Nexus提供了可以调试组件下载过程的方法，在组件的下载全路径后面增加参数“?describe”，



六 分布式：
 分布式缓存一致性hash算法等。其实redis的读写性能很高，通过主备方式也可以。
分布式session数据：数据外置（redis）
分布式数据库（主备）
分布式任务调度（quartz）
分布式事务（2PC，TCC）
分布式锁（sql语句 forupdate,redis 
jedis.set(String key, String value, String nxxx, String expx, int time)
 jedis.eval 执行lua脚本（key value 一致才能删除）
）

七 高并发实践：
 1. 性能问题
 2. proxy缓存，请求合并。
 3. vertx异步IO


