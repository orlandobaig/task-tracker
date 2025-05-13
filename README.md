"# Task Tracker" 
# 📝 Task Tracker

A simple full-stack web application to manage tasks (To-Do List), built with **Java Spring Boot** and **HTML/CSS/JS**.

---

## 🚀 Features

- Add new tasks
- View all tasks
- Mark tasks as completed
- Delete tasks
- In-memory storage (no database yet)

---

## 🛠 Tech Stack

**Backend:**
- Java 21
- Spring Boot 3.x
- Maven
- RESTful API

**Frontend:**
- HTML
- CSS
- Vanilla JavaScript (Fetch API)

---

## 📂 Project Structure

task-tracker/
├── src/
│ ├── main/
│ │ ├── java/com/example/task_tracker/
│ │ │ ├── Task.java
│ │ │ ├── TaskService.java
│ │ │ └── TaskController.java
│ │ └── resources/static/
│ │ └── index.html
├── pom.xml
└── README.md


---

## ▶️ How to Run

### Prerequisites:
- Java 17+ or 21
- Maven

### Run the app:
```bash
./mvnw spring-boot:run

Then open your browser to:

http://localhost:8080