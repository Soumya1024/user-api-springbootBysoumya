# Spring Boot User API

This is a basic REST API built using Java Spring Boot. It includes:

- `GET /hello` — returns a greeting
- `POST /user` — accepts JSON data and returns a custom message

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot 3.x
- Maven
- Tested using Postman

---

## 🚀 How to Run

```bash
mvn spring-boot:run
```

Then open:

- http://localhost:8081/hello

Send POST to http://localhost:8081/user with:

```json
{
  "name": "Soumya",
  "email": "pradhan@example.com"
}
```

---

## 👨‍💻 Author

Made with 💻 by **Soumya Ranjan Pradhan**
