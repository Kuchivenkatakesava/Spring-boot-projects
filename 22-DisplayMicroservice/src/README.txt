spring cloud

it gives you many different libraries for implementing micro services using spring

1) openfeign


it is used to make REST calls.

steps to use openFeign

1) add dependency in pom.xml

2) create an interface with method matching signature 

3. enable feign client

we want to assign unique name to every microservice and use that to refer that microservice.
it is by using

2.Eureka: it service registry and discovery server.
          every microservice registers itself with Eureka
          Eureka server typically runs on port 8761