# Abstract Class vs Interface in Java

## Abstract Class
- **Definition**: A class that cannot be instantiated and can contain both abstract and concrete methods.
- **Use**: To provide a common base for subclasses with shared code and behavior.
- **Members**:
  - Can have instance variables.
  - Can have constructors.
  - Can have method implementations (concrete methods).
- **Inheritance**: A class can extend only one abstract class (single inheritance).

## Interface
- **Definition**: A reference type that can contain only abstract methods (until Java 8, after which it can have default and static methods).
- **Use**: To define a contract that implementing classes must follow, promoting a polymorphic behavior.
- **Members**:
  - Cannot have instance variables (only constants).
  - Cannot have constructors.
  - Can have default and static method implementations (Java 8+).
- **Inheritance**: A class can implement multiple interfaces (multiple inheritance).