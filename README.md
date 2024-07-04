This app # Shape Calculator API

This project implements a RESTful API for calculating the area and perimeter of various geometric shapes. The API accepts JSON input to specify the type of shape and its parameters.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/YevhenDov/shape-calculator-api.git
    cd shape-calculator-api
    ```

2. Build the project with Maven:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

## Usage

### Endpoint

- **URL**: `/api/shape/calculate`
- **Method**: `POST`
- **Content-Type**: `application/json`

### Request Body

The request body should be a JSON object containing the `shapeType` and `parameters`. The `shapeType` must be one of the following: `CIRCLE`, `SQUARE`, `RECTANGLE`, `TRIANGLE`. The `parameters` field is an array of numbers representing the dimensions of the shape.

#### Example

**CIRCLE**
```json
{
  "shapeType": "CIRCLE",
  "parameters": [1]
}