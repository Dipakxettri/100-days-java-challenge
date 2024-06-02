# Day 3 of Java Programming 🔥👨🏻‍💻

Hello , I am Deepak Ghimire , Day 3 of my Java journey brings insights into fundamental Java components: documentation, package statements, interfaces, class definitions, and the pivotal static void main method. Additionally, I delved into variable rules and explored various data types. Stay tuned for more Java adventures!

## Today's Learnings:

### Key Components of Java:
- **Documentation Section**: Comments that explain the code, making it easier to understand and maintain.
- **Package Statement**: Declares the package name at the beginning of a Java program to organize classes into namespaces.
  - **Example**: `package com.company;`
- **Import Statement**: Imports other Java classes and packages, allowing you to use their functionality without needing to specify their fully qualified names.
  - **Example**: `import java.util.Scanner;`
- **Interface Statement**: Defines an interface in Java. Interfaces specify methods that a class must implement without providing the method implementations.
  - **Syntax**:
    ```java
    public interface MyInterface {
        void myMethod();
    }
    ```
- **Class Definition**: The blueprint for creating objects, containing fields and methods.
  - **Syntax**:
    ```java
    public class MyClass {
        // Fields
        int myField;
        
        // Methods
        void myMethod() {
            // Method body
        }
    }
    ```
- **Static Void Main Method**: The entry point of any Java application. The `main` method is static, so it can be called without creating an instance of the class.
  - **Syntax**:
    ```java
    public class Main {
        public static void main(String[] args) {
            // Statements to be executed
        }
    }
    ```

### Variables :
- **Variables**: Containers for storing data values.
  - **Syntax**:
    ```java
    int myNumber = 5; // Declares an integer variable with value 5
    String myText = "Hello"; // Declares a String variable with value "Hello"
    ```
    #### Rules for Naming Variables:
1. **Start with a Letter or Underscore**: Variable names must begin with a letter (a-z or A-Z) or an underscore (_).
   - **Correct**: `_myVar`, `myVar`
   - **Incorrect**: `1myVar`
2. **No Spaces**: Variable names cannot contain spaces.
   - **Correct**: `myVariable`
   - **Incorrect**: `my Variable`
3. **Case Sensitive**: Variable names are case-sensitive.
   - `myVar` and `MyVar` are different variables.
4. **Reserved Words**: Variable names cannot be Java reserved words.
   - **Correct**: `myClass`
   - **Incorrect**: `class`
### Data Types in Java:
Data types in Java define the kind of data a variable can hold. They include primitive types like numbers and characters, and non-primitive types like arrays and objects. Each type has specific characteristics and limitations, crucial for writing correct and efficient code.
Java data types are divided into two categories: primitive and non-primitive.

#### Primitive Data Types:
1. **byte**:
   - **Description**: 8-bit integer.
   - **Range**: -128 to 127.
   - **Example**:
     ```java
     byte myByte = 100;
     ```

2. **short**:
   - **Description**: 16-bit integer.
   - **Range**: -32,768 to 32,767.
   - **Example**:
     ```java
     short myShort = 10000;
     ```

3. **int**:
   - **Description**: 32-bit integer.
   - **Range**: -2^31 to 2^31-1.
   - **Example**:
     ```java
     int myInt = 100000;
     ```

4. **long**:
   - **Description**: 64-bit integer.
   - **Range**: -2^63 to 2^63-1.
   - **Example**:
     ```java
     long myLong = 100000L;
     ```

5. **float**:
   - **Description**: 32-bit floating point.
   - **Range**: Approximately ±3.40282347E+38F (6-7 significant decimal digits).
   - **Example**:
     ```java
     float myFloat = 10.5f;
     ```

6. **double**:
   - **Description**: 64-bit floating point.
   - **Range**: Approximately ±1.79769313486231570E+308 (15 significant decimal digits).
   - **Example**:
     ```java
     double myDouble = 20.5;
     ```

7. **boolean**:
   - **Description**: Represents true or false values.
   - **Example**:
     ```java
     boolean isJavaFun = true;
     ```

8. **char**:
   - **Description**: 16-bit Unicode character.
   - **Range**: '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).
   - **Example**:
     ```java
     char myChar = 'A';
     ```

#### Non-Primitive Data Types:
1. **String**:
   - **Description**: A sequence of characters.
   - **Example**:
     ```java
     String myString = "Hello, World!";
     ```

2. **Array**:
   - **Description**: A collection of similar types of elements.
   - **Example**:
     ```java
     int[] myArray = {1, 2, 3, 4, 5};
     ```

3. **Class**:
   - **Description**: A blueprint for creating objects.
   - **Example**:
     ```java
     public class MyClass {
         // Fields
         int myField;
         
         // Methods
         void myMethod() {
             // Method body
         }
     }
     ```

4. **Interface**:
   - **Description**: A reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
   - **Example**:
     ```java
     public interface MyInterface {
         void myMethod();
     }
     ```

These are the essential data types in Java programming.

Thanks for your attention, happy coding! 🙏❤️
