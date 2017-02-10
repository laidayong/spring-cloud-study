
| 项目名称                                     | 端口   | 描述             | URL             |
| ---------------------------------------- | ---- | ---------------------- | --------------- |
| microservice-discovery-eureka            | 8761/8762 | 注册中心          | /               |
| microservice-consumer-movie-feign        | 8020 	   | 服务client        | /feign/1        |
| microservice-provider-user               | 8000      | 服务提供者        | /1              |

1. 环境准备：为了在一台机器上测试 eureka HA， 
增加 
127.0.0.1 peer1 peer2
到测试机的 HOSTS 文件里

2. 构建系统：在根目录运行在根目录运行 maven clean install 

3. 系统启动

   3.1 启动两个eureka注册中心 

   java -jar microservice-discovery-eureka/target/microservice-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
   java -jar microservice-discovery-eureka/target/microservice-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
   注册中心通过如下url查看
   http://localhost:8761/
   http://localhost:8762/
   
   3.2 启动服务提供者 (原例子使用JPA, 增加了使用MyBastis的例子)

   java -jar microservice-provider-user/target/microservice-provider-user-0.0.1-SNAPSHOT.jar   
   
     注:如果希望启动多个provider, 参见 注册中心 的配置文件，增加profile
   
   3.3 启动服务使用者 (原例子有rest service的例子, 增加了web page例子, 以及log，feign client的配置)
   java -jar microservice-consumer-movie-feign/target/microservice-consumer-movie-feign-0.0.1-SNAPSHOT.jar
   
   测试url
   http://localhost:8020/feign/1
   http://localhost:8020/greeting?id=2