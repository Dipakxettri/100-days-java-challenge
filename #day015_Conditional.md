# Day 15 : Conditional in Java 

Today's learning focused on conditionals in programming, a fundamental concept in many programming languages including Java. Conditionals allow programs to make decisions based on certain conditions being true or false. In Java, this is typically achieved using `if`, `else if`, and `else` statements, along with comparison operators such as `==`, `!=`, `<`, `>`, `<=`, and `>=`. These statements control the flow of the program by executing specific blocks of code based on whether certain conditions are met. 

### Syntax/format of conditional in Java

```java
if (condition) {
    // code to execute if condition is true
} else {
    // code to execute if condition is false
}
```
```java
if (condition1) {
    // code to execute if condition1 is true
} else if (condition2) {
    // code to execute if condition1 is false and condition2 is true
} else {
    // code to execute if both condition1 and condition2 are false
}
```

### Example ####

```java
int x = 10;
if (x > 5) {
    System.out.println("x is greater than 5");
} else if (x == 5) {
    System.out.println("x is equal to 5");
} else {
    System.out.println("x is less than 5");
}
```

In this example, the program checks the value of the variable x. If x is greater than 5, it prints "x is greater than 5". If x is equal to 5, it prints "x is equal to 5". Otherwise, it prints "x is less than 5".

Thanks for your attention Happy coding 🙏 ❤️!!

