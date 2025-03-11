# First AI Project

## Overview
This is a Spring Boot-based AI project that integrates with the **Ollama AI Chat Model** to provide AI-generated responses based on user prompts.

## Technologies Used
- Java
- Spring Boot
- Spring AI (OllamaChatModel)
- Reactor (Flux)

## Installation and Setup

### Prerequisites
Ensure you have the following installed:
- Java 17 or later
- Maven or Gradle
- Spring Boot

### Steps to Run the Project
1. Clone the repository:
   ```sh
   git clone https://github.com/Rohitsah6372/first-ai-Spring-project.git
   cd first_ai_project
   ```
2. Build the project using Maven:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints

### 1. AI Prompt Response
**Endpoint:** `GET /ai/prompt`

**Description:** Accepts a user prompt and streams an AI-generated response using Ollama AI.

**Parameters:**
- `prompt` (String, required) - The input text for the AI model.

**Example Request:**
```
GET http://localhost:8080/ai/prompt?prompt=What+is+Java+Language
```

**Example Response:**
```json
{
    "response": "Java is a high-level, object-oriented programming language..."
}
```

## Project Structure
```
com.ai.first_ai_project
│── AiController.java  # Handles AI prompt requests
│── Application.java   # Main Spring Boot application
```

## Dependencies
Ensure the following dependencies are included in your `pom.xml` (if using Maven):
```xml
<dependency>
    <groupId>org.springframework.ai</groupId>
    <artifactId>spring-ai-ollama</artifactId>
    <version>YOUR_VERSION</version>
</dependency>
```

## License
This project is licensed under the MIT License.

## Author
Developed by ROHIT SAH
