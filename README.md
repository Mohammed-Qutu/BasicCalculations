# BasicCalculations

## Description
This Java program includes basic mathematical operations such as addition, subtraction, multiplication, and division. It also features a method to generate a random number between two given integers. The project demonstrates basic method creation and logic for performing calculations.

## Author
Written by Mohammed Qutu.

## Requirements
- Java 21.0.2 or later

## Usage
To use the methods, simply call the static methods of the `Calculations` class with the required inputs. Below are the available methods and examples of their usage:

### Available Methods
- `generateRandomNumber(int a, int b)`: Generates a random integer between `a` and `b`.
- `add(double n1, double n2)`: Returns the sum of `n1` and `n2`.
- `subtract(double n1, double n2)`: Returns the difference between `n1` and `n2`.
- `multiply(double n1, double n2)`: Returns the product of `n1` and `n2`.
- `divide(double n1, double n2)`: Returns the quotient of `n1` and `n2`.

### Example Usage
```java
int randomNumber = Calculations.generateRandomNumber(5, 10);
double sum = Calculations.add(5.0, 3.0);
double difference = Calculations.subtract(10.0, 4.0);
double product = Calculations.multiply(2.0, 6.0);
double quotient = Calculations.divide(15.0, 3.0);
