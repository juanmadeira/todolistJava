# todolistJava

### postgresql

``` bash
psql -h localhost -U postgres
```

``` sql
CREATE DATABASE todolistjava;
```

### application.properties

``` properties
spring.datasource.url=jdbc:postgresql://localhost:5432/todolistjava
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```