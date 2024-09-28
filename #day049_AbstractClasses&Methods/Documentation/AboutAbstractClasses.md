# Abstract Classes And Methods in Java

## Introduction
- **Abstract Class**: A class that cannot be instantiated on its own and may contain abstract methods (methods without a body).
- **Purpose**: To provide a blueprint for other classes, defining methods that must be implemented by subclasses.

## Use Cases
- **Common Interface**: Define a common interface for related classes, like shapes (e.g., circles and squares) that extend an abstract class called `Shape`.
- **Code Reusability**: Contain shared code that subclasses can reuse, reducing code duplication.

### Example: Smartphone
- **Abstract Class: Smartphone**: This class serves as a blueprint for smartphone models like `Redmi` and `Samsung`.
  - **Properties**: brand, model, batteryCapacity, price.
  - **Abstract Methods**: call(), sendMessage(), takePhoto().
  
Subclasses like `Redmi` and `Samsung` implement these methods with their unique features.

## Important Points/Roles to Note
1. **Declaration**: Use the keyword `abstract` in the class declaration.
2. **Abstract Methods**: Must be implemented by subclasses; they have no body in the abstract class.
3. **Concrete Methods**: Abstract classes can have concrete methods (methods with a body) as well.
4. **Cannot Instantiate**: You cannot create an object of an abstract class directly; they are incomplete by design.
5. **Inheritance**: A subclass can extend only one abstract class, as Java does not support multiple inheritance for classes.
6. **Constructor**: Abstract classes can have constructors, which can be invoked by subclasses.
7. **Access Modifiers**: Abstract methods and classes can use access modifiers (public, private, etc.).
8. **No Final Modifier**: Abstract classes cannot be declared as `final`, as they need to be extended.

## Conclusion
- Abstract classes are vital for designing robust and scalable code structures in Java, allowing for abstraction and code reuse. They define a common interface for subclasses, promoting consistency across related classes.
