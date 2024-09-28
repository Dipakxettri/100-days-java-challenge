# Dynamic Method Dispatch in Java

## Introduction
Dynamic Method Dispatch is a key idea in Java that allows a program to decide which method to run at runtime based on the actual object type, rather than the type of reference variable used.

## Use
- It helps achieve **runtime polymorphism**, meaning a subclass can provide its own version of a method defined in a superclass.
- Often used with **interfaces** and **abstract classes** to create flexible and easy-to-update code.

## Points to Remember / Rules
1. **Method Overriding**: The subclass must override the method from the superclass.
2. **Reference Type**: The type of the reference variable decides which methods can be called; the actual object type decides which version of the method runs.
3. **Runtime Behavior**: The specific method that gets called is determined while the program is running.
4. **No Compile-Time Resolution**: The program does not decide which method to call until it runs; this decision is made at runtime.
5. **Code Reusability**: This approach supports using the same code with different object types, making the code more flexible and reusable.
6. **Object Type vs. Reference Type**: The type of the actual object (like a Dog or Cat) tells the program which method to execute, even if the reference is of a more general type (like Animal).

## Summary
Dynamic Method Dispatch is important for understanding how polymorphism works in Java. It allows methods to be chosen based on the actual object type, leading to clearer and more maintainable code.
