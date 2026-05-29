# Student CRUD API

A simple Spring Boot REST API for performing CRUD operations on Student data.

### Tech Stack
- Java 17
- Spring Boot 3.2
- Spring Data JPA
- Maven
- MySQL

### API Endpoints
| Method | Endpoint | Description |
| --- | --- | --- |
| GET | /api/students | Get all students |
| GET | /api/students/{id} | Get student by ID |
| POST | /api/students | Create new student |
| PUT | /api/students/{id} | Update student |
| DELETE | /api/students/{id} | Delete student |

### How to Run
1. Clone: `git clone https://github.com/stapaswini364-cpu/student-crud-api.git`
2. Configure MySQL in `application.properties`
3. Run: `mvn spring-boot:run`
4. Test with Postman or Thunder Client
