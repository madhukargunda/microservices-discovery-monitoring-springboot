# microservces-discovery-monitoring-using-spring-boot
In this article i am going to discuss about the service discovery and monitoring uisng spring boot eureka and spring boot admin. Spring provides a framework called spring cloud which is used to solve the many problems currently industry is facing when deploying the microservices in cloud environment. Spring boot admin is nice tool to visualize and monitor the spring boot microservices applications which are running in the cloud envinment.Spring boot admin internally depends on the spring boot actuator framework to get the information like health,info,logs,metrics,configuration informatiion about the different microservices running in cloud. 

### Objective

```
1.Why Service Discovery

2.Service Discovery Patterns

	a). Client Side service Discovery
	b). Server Side Service Discovery

3.Spring Boot Service registry using Eureka Netflix

4.Spring Boot Admin for monitoring the microservices
```

## 1.Why Service Discovery

In the microservices environment a monolothic application is divided into multiple microservices based on the 
functionality and each microservices will follow the single responsibility principle.In the microservice archiecture all these micro services will deployed in to separatley and  each service need to communicate another service. As we do in monolothic application if one service wants contact another service we are going to hardcode URL and port numbers in the configuration file and application will read these values from config to communicate with other service. This is not the case with microservice archiecture because when these microservices deployed into cloud environment beacuse of the autoscaling feature each service will have multiple replicas and each replica will run in same machine or multiple different machines in different datacenters and each service will have the dynamic ip and port.Its too difficlut to know the network location of the microservice in order to consume their features

To resolve this problem we have two different design patterns

## 2.Service Discovery Patterns

# Microservices


coming soon
