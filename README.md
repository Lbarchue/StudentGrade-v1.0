# StudentGrade-v1.0
Student grade and gpa database that stores student name along with letter grades and GPA. 
🚀 Features

✅ Create, read, update, and delete student records
✅ Automatically calculate GPA based on letter grades (A–F)
✅ PostgreSQL database integration
✅ RESTful API endpoints for all operations
✅ Built using modern Spring Boot practices (JPA, Service, Controller layers)

🧩 Technologies Used

Java 17+

Spring Boot 3+

Spring Data JPA

PostgreSQL

Maven

IntelliJ IDEA (recommended IDE)

⚙️ Setup

Set up database using postgresql

Update your src/main/resources/application.properties file:

  spring.application.name=StudentGrades
  
  spring.datasource.url=jdbc:postgresql://localhost:5432/grades_db
  
  spring.datasource.username=postgres
  
  spring.datasource.password=your_password
  
  spring.jpa.hibernate.ddl-auto=update
  

Application will start on localhost 8080, Postgresql should be set to 5432

spring.jpa.show-sql=true
