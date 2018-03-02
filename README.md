一 微服务部署平台，公司内部微服务部署云
  使用语言技术：java， python linux shell lua， mybatis等
	1. 微服务多实例部署，去中心化，不同节点并发部署；
	2. nginx反向代理实现负载均衡，zookeeper 实现服务注册和服务发现，升级不断服
	3. pub集成机制，实现多微服务菜单，权限等静态文件集成。
	4. 通过proxy 代理缓存，合并请求方式实现部署平台管理规模水平扩展能力。
	


二  华为公有云微服务应用平台开发流水线
 使用语言技术：go java maven git nexus k8s docker spring mybatis
	1. 华为公有云部署架构深入理解（信任域，多region）
	2. 使用K8s作为微服务（基于容器，虚机）部署平台，实现微服务服务注册，发现，可靠性（region级别发亲和，节点级别反亲和），升级不断服
	3. 使用Helm实现微服务部署生命周期管理，preInstall preUpgrade各种hook
	4. 实现devops的流水线云服务（代码托管->编译构建->部署->运维）
	

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

 1. 性能问题，使用高性能算法，减少大循环，递归。
 2.接入层：
	a.  proxy缓存，请求合并。
	b. Nginx 反向代理，后台服务多实例（无状态，状态外置/sessiion数据同步）
	3. 数据层：增加nosql缓存，解决读多写少场景；读写数据库实例分离，水平（拆表，userid），垂直（拆库）
	

 3.垂直扩展： vertx异步IO，异步化，减少锁竞争（相对于原来的顺序编程，编程难度增加）


集中任务管理：
基于quartz实现集中任务管理框架，支持业务注册定时任务，界面运维能力
分布式任务调度框架quartz（不同trigger特点不一样，SimpleTrigger，CronTrigger， misfire策略)
Spring Osgi （服务发布，服务引用）：根据分层原则分解bundle,接入层，业务层，数据层 
使用EventBus（jms）解决反向依赖问题

技能：
