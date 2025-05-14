# S3.02-Patterns-Builder-Nivel1-Ej1

## Summary: exercise description
In all exercises, create a Gradle project with a Main class that demonstrates the use of the pattern (with any invocations needed).

Builder
Develop a pizza order management system using the Builder design pattern in Java. The system should allow the creation of different types of pizzas with different size, dough, and ingredient configurations.

Define a Pizza class with the following attributes:
size
dough
toppings

Create a PizzaBuilder interface with the methods needed to configure the size, dough, and ingredients of a pizza.
Implement one or more classes that act as specific builders (PizzaBuilder) for different types of pizzas. For example, you could have a builder for Hawaiian pizza, another for vegetarian pizza, and so on.
Develop a MestrePizzer class that receives a PizzaBuilder and allows you to build pizzas in a specific way.
In the main program (Main), create instances of PizzaBuilder and MestrePizzer, and use them to build pizzas with different configurations.

## Technologies Used

java 22

## Requirements

Programming language: Java 22

Development environment: IntelliJ IDEA

Build tool: Gradle 

## How to run it

1. **Clone or download the repository**:
- Clone the repository:
```bash
git clone https://github.com/your-repository/testing-junit.git
```
- Or download the ZIP file and extract the contents.

2. **Open the project**:
- Use your favorite IDE (such as IntelliJ IDEA or Eclipse).
- Make sure the project is set up correctly and that the dependencies (if you use Maven) are downloaded automatically.

## Contribution

Contributions are welcome! Please follow these steps to contribute:

-Fork the repository
-Create a new branch git checkout
-b feature/NewFeature
-Make your changes and commit them: git commit
-m 'Add New Feature'
-Upload the changes to your branch: git push origin feature/NewFeature
-Make a pull request
