# Spring Boot Application with PostgreSQL and Swagger Integration

This is a sample Spring Boot application integrated with PostgreSQL for data storage and Swagger for API documentation.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven or Gradle
- PostgreSQL database server

### PostgreSQL

Ensure that PostgreSQL database is configured properly. Configure the database connection settings in the `application.properties` file:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/database_name
spring.datasource.username=username
spring.datasource.password=password
spring.datasource.driver-class-name=org.postgresql.Driver

#### Steps

