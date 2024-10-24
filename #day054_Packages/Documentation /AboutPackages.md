# Java Packages - Quick Revision

## What is a Package?
A package is used to group related classes and interfaces. It helps to:
- Avoid name conflicts.
- Manage large codebases efficiently.
- Provide access protection.

## Types of Packages
1. **Built-in Packages**: Predefined packages like:
   - `java.util` (e.g., ArrayList, HashMap)
   - `java.io` (e.g., File, BufferedReader)
   - `java.lang` (default, includes String, Math)

2. **User-defined Packages**: Custom packages created by developers.

## Syntax
### Declaring a Package:
```java
package mypackage;
public class MyClass { }
```

### Importing a Package:
```java
import mypackage.MyClass;
```

- *Example :*
In animals/Dog.java:
```java
package animals;
public class Dog {
    public void bark() {
        System.out.println("Woof!");
    }
}
```
In Main.java:
```java
import animals.Dog;
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}
```

## Notes:

The package statement must be the first line of the Java file.

Default package: If no package is declared, the class belongs to the default package.



