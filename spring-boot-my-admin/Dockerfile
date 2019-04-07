
#Java 8 Base image which contains the java run time environment
FROM java:8

MAINTAINER Madhukar Gunda study.pattern@gmail.com

#Expose the java port 
EXPOSE 9001

#Add the account service jar file
ADD /target/spring-boot-my-admin.jar spring-boot-my-admin.jar

#RUN the jar file
ENTRYPOINT ["java" ,"-jar","spring-boot-my-admin.jar" ]
