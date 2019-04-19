
#Java 8 Base image which contains the java run time environment
FROM java:8

MAINTAINER Madhukar Gunda study.pattern@gmail.com

#Expose the java port 
#EXPOSE 8080

#Add the account service jar file
ADD /target/eureka-service-registry.jar eureka-service-registry.jar

#RUN the jar file
ENTRYPOINT ["java" ,"-jar","eureka-service-registry.jar" ]
