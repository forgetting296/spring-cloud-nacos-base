# acelee-SpringCloudAlibaba-nacosDemo

#### 介绍
一套整合好的   消费者-注册中心-生产者  流程框架代码，开箱即用。包含spring cloud alibaba nacos+spring cloud feign的小demo。助您快速学习搭建Spring cloud微服务架构！

#### 软件架构

nacos0.9.0    服务注册中心

nacos-provider   服务提供者

nacos-consumer   服务消费者

#### 使用说明

**启动nacos：**

   从官网https://github.com/alibaba/nacos/releases下载nacos-server-0.9.0.zip或者0.8.0.zip，我这里用的8。下载完毕后解压，
打开bin目录下，双击startup.cmd启动，访问http://127.0.0.1:8848/nacos可以看到nacos登陆页面，默认账户名和密码都是nacos


**测试**

1）依次启动nacos0.9.0、nacos-provider、nacos-consumer三个项目 

2）先输入：http://localhost:8888/hello?name=acelee 检查nacos-provider服务是否正常

返回：Hello acelee, this is nacos-provider message.

说明nacos-provider正常启动，提供的服务也正常。

3）浏览器中输入：http://localhost:8889/hello/acelee

返回：Hello acelee, this is nacos-provider message.

说明客户端已经成功的通过feign调用了远程服务hello，并且将结果返回到了浏览器。
