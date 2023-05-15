FROM amazoncorretto:17-alpine-jdk  
MAINTAINER PorfolioFS
EXPOSE 8080
COPY target/porfolio-0.0.1-SNAPSHOT.jar porfolio-fs.jar 
ENTRYPOINT ["java","-jar","/porfolio-fs.jar"]
