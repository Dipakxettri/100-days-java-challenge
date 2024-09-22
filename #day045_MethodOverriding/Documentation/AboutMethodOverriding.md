# Method Overriding in Java

## Explanation
Method overriding allows a subclass to provide a specific implementation for a method that is already defined in its superclass, enabling customization of inherited behavior.

## Override notation - @Override
Not necessary but recommended

## Rules
1. **Same Method Signature**: The method in the subclass must have the same name, return type, and parameters as the method in the superclass.
2. **Access Modifiers**: The overriding method's access modifier must be the same or more accessible than that of the method in the superclass.
3. **Return Type**: The return type must be the same or a subtype (covariant return type) of the return type in the superclass.
4. **Cannot Override Static Methods**: Static methods are not overridden; they are hidden. The method is determined at compile-time.
5. **Final Methods**: Methods marked as `final` in the superclass cannot be overridden.
6. **Abstract Methods**: If a superclass has an abstract method, it must be overridden in any concrete subclass.

## Important Points
- **Dynamic Method Dispatch**: Method overriding is a key aspect of dynamic method dispatch, allowing Java to resolve method calls at runtime based on the object's actual class, not the reference type.
- **super Keyword**: The `super` keyword can be used to call the superclass version of an overridden method.
- **Default Methods in Interfaces**: In Java 8 and above, interfaces can have default methods, which can be overridden in implementing classes.

## Use Case
- **Polymorphism**: Method overriding is essential for achieving runtime polymorphism, allowing you to call overridden methods through superclass references, enabling dynamic method resolution.
