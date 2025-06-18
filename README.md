# 🎓 Student Profile – Spring Boot Project

This is a basic **Spring Boot** application that provides functionality for student registration and login, along with handling and storing basic student profile information. This was my first project built with the Spring ecosystem, focusing on creating clean architecture using controllers, services, repositories, and entities.

---

## 🧱 Features

- 🔐 Student Signup and Login
- 🗂️ Store and manage basic student details
- ✅ RESTful API design using Spring MVC
- 🧠 Layered architecture: Controller → Service → Repository
- 💾 Data persistence using Spring Data JPA

---

## 📁 Project Structure

```
.
├── src/
│   ├── main/
│   │   ├── java/studentProfile/demo/
│   │   │   ├── controller/
│   │   │   │   └── StudentController.java     # Handles API requests
│   │   │   ├── entity/
│   │   │   │   └── StudentEntity.java         # Entity representing student data
│   │   │   ├── repo/
│   │   │   │   └── StudentRepo.java           # JPA repository for DB operations
│   │   │   ├── service/
│   │   │   │   └── StudentService.java        # Business logic
│   │   │   └── DemoApplication.java           # Main Spring Boot application class
│   │   └── resources/
│   └── test/java/studentProfile/demo/
│       └── DemoApplicationTests.java          # Test cases
├── .mvn/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml                                    # Maven project configuration
```

---

## 🚀 Getting Started

### 📦 Prerequisites

- Java 17+ installed
- Maven installed (`mvn -v` to check)
- IDE like IntelliJ IDEA or Eclipse

### 🔧 Running the App

```bash
# 1. Clone the repository
git clone https://github.com/your-username/student-profile-springboot.git
cd student-profile-springboot

# 2. Build the project
./mvnw clean install

# 3. Run the application
./mvnw spring-boot:run
```

---

## 🔗 API Endpoints (Sample)

| Method | Endpoint          | Description            |
|--------|-------------------|------------------------|
| POST   | `/students/signup` | Create a new student   |
| POST   | `/students/login`  | Login as a student     |
| GET    | `/students/{id}`   | Get student profile    |

> Add actual endpoints based on your controller mapping for clarity.

---

## 🛠️ Technologies Used

- Java 21
- Spring Boot
- Spring Web (MVC)
- Spring Data JPA
- H2 / MySQL (customizable DB)
- Maven

---

## 📌 Notes

- The application can be easily extended to include:
  - Profile update and delete endpoints
  - UI integration using Flutter

---

## 👨‍💻 Author

**Devansh Dhopte**  
My first Spring Boot application – learning layered architecture and REST APIs.

---

> _"A simple yet scalable foundation for backend development using Spring Boot."_
