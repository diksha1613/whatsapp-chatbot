# WhatsApp Chatbot (Spring Boot)

## Description
This is a simple WhatsApp chatbot backend simulation built using Spring Boot.

## Features
- REST API endpoint: /webhook
- Accepts JSON input
- Predefined responses:
  - Hi → Hello
  - Bye → Goodbye
- Logs all incoming messages

## API Example

POST /webhook

Request:
{
  "message": "Hi"
}

Response:
Hello

## Tech Stack
- Java
- Spring Boot
- REST API

## How to Run
1. Clone the repo
2. Run the application
3. Use Postman to test API

## Author
Diksha Patel
