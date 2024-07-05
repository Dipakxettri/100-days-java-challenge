# Day 31 : Variable Arguments (Varargs) in Java

Varargs, short for variable-length arguments, allow a method to accept a variable number of arguments of a particular type. This feature simplifies method calls where the number of arguments may vary. In Java, varargs are denoted by an ellipsis ... after the parameter type in the method declaration.

### **Syntax:**
```java
public void methodName(Type... variableName) {
    // Method implementation
}
```

## Usage:
Declaring Varargs: You can declare only one varargs parameter per method, and it must be the last parameter.Passing Arguments: When calling a method with varargs, you can pass zero or more arguments of the specified type, either as individual values or as an array of the same type.Implementation: Inside the method, varargs are treated as an array, allowing you to iterate over the elements or perform operations on them.

### **Example:**
```java
public class VarargsExample {
    public static void main(String[] args) {
        printNumbers(1, 2, 3);
        printNumbers(5, 10, 15, 20);
        printNumbers(); // Calling with zero arguments
    }

    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
```
In this example, printNumbers method uses varargs to accept a variable number of integers and prints them. The method can be called with different numbers of arguments, providing flexibility in function calls.Varargs are especially useful when you need to create methods that operate on a variable number of inputs, simplifying the code and enhancing flexibility in method design.

Thanks for your attention happy coding ❤️❤️
