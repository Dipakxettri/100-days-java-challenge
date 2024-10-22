# Default Methods in Java

## Definition
Default methods are methods in an interface that have a body and are defined using the `default` keyword.

## Purpose
- They allow adding new methods to interfaces without breaking existing implementations, ensuring backward compatibility.

## Characteristics
- **Abstract Methods**: Default methods can coexist with abstract methods in the same interface.
- **Inheritance**: Classes implementing the interface can inherit the default implementation or override it to provide their own behavior.
- **Restrictions**: Default methods cannot be static or private in the interface.

## Benefits
- Enhances interface functionality without affecting existing classes.
- Promotes code reuse by allowing shared behavior in multiple implementations.