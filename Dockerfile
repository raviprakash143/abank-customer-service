FROM java:8
VOLUME /tmp
ADD target/abank-customer-service-0.0.1-SNAPSHOT.jar abank-customer-service-0.0.1-SNAPSHOT.jar
RUN sh -c 'touch /abank-customer-service-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","abank-customer-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 9123
