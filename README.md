# SpringBoot Project - RestAPI with React

### Tech Stack

- SpringBoot-Spring Web, Spring Data JPA and SQL driver
- React
- MySQL

### Tools Used

- [Spring-web](https://start.spring.io/)
- IntelliJ Community version
- Postman

### Annotations

- @Entity-creates a table when connected to a database
- @Id- For primary key
- @GeneratedValue-annotation specifies the strategy for generating primary key values.
- @RequestBody- [Essentially, it allows automatic deserialization of the inbound HTTP request body onto a Java objec](https://www.baeldung.com/spring-request-response-body)t

- Besides **`GenerationType.IDENTITY`**, there are other strategies:
    - **`GenerationType.SEQUENCE`**: Uses a database sequence (e.g., Oracle).
    - **`GenerationType.TABLE`**: Creates a separate table to manage key generation.
    - **`GenerationType.AUTO`**: Tries to determine the best strategy based on the underlying database.

### `JpaRepository<User, Long>`

Here the User is the model and the Long is the datatype of the id. The **`JpaRepository`** is a specific extension of the Spring Data JPA **`Repository`** interface. It provides additional functionality for working with JPA (Java Persistence API) entities. Here are some key points about **`JpaRepository`**:

1. **Basic CRUD Operations**:
    - **`JpaRepository`** inherits methods from **`CrudRepository`**, allowing you to perform basic CRUD (Create, Read, Update, Delete) operations on entities.
    - Common methods include **`save()`**, **`findById()`**, **`findAll()`**, and **`deleteById()`**.
2. **Pagination and Sorting**:
    - **`JpaRepository`** also inherits methods from **`PagingAndSortingRepository`**, which provides pagination and sorting capabilities.
    - You can retrieve paginated results using methods like **`findAll(Pageable pageable)`**.
3. **Additional Methods**:
    - **`JpaRepository`** introduces some additional methods specific to JPA:
        - **`flush()`**: Flushes pending changes to the database.
        - **`getReferenceById(ID id)`**: Returns a reference to an entity with the given identifier.
        - **`saveAndFlush(S entity)`**: Saves an entity and flushes changes instantly.
        - **`saveAllAndFlush(Iterable<S> entities)`**: Saves multiple entities and flushes changes instantly.
4. **Usage in Spring Boot**:
    - Developers commonly use **`JpaRepository`** in Spring Boot applications to manage data persistence.
    - It simplifies database interactions and reduces boilerplate code.

Create a database in MySQL named fullstack

In application.properties

```jsx

spring.application.name=WebProjectWithReact
server.port=8081
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/fullstack
spring.datasource.username=root
spring.datasource.password=****
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

Requests

POST  http://localhost:8081/user

GET ALL http://localhost:8081/users

### If nodemon kind of experience needed

 While **IntelliJ IDEA Community Edition** doesn’t directly support Spring Boot-specific options like **spring-boot-devtools**, you can still achieve similar functionality. Here’s how:

1. **Enable Build Project Automatically**:
    - Go to **File** ➡️ **Settings**.
    - Under **Build, Execution, Deployment**, select **Compiler**.
    - Enable the **Build project automatically** option.
    - This ensures that your project is continuously compiled as you make changes.
2. **Enable Registry**:
    - Press **Ctrl + Alt + Shift + /** (or go to **Help** ➡️ **Find Action** and search for “Registry”).
    - Enable the **compiler.automake.allow.when.app.running** registry option.
    - This allows IntelliJ IDEA to compile files even when your application is running.
3. **Enable Compiler Running**:
    - In the same registry, enable the **compiler.automake.allow.when.app.running** option.
    - This ensures that changes are reflected without manual recompilation.
    
    ### React
    
    - npm create vite@latest
        - Project name-fullstack-front
        - Framework-React
        - Type-JavaScript
    - Then npm install and npm run dev from within the project
    - We also need bootstrap so do
    
    ```jsx
           npm i bootstrap
    ```
    
    - We also need axios to make [http](https://nodejs.org/api/http.html) requests from node.js
    
                   `npm install axios`
    
    - We also need react-router-dom
      
            `npm i react-router-dom`
