# Day 10: Understanding Data Types of Expressions and Increment/Decrement Operators in Java

## Overview

Today's focus was on gaining a deeper understanding of expressions and mastering the use of increment and decrement operators in Java.

## Expressions and Data Types

Expressions in Java are combinations of variables, operators, and method invocations that produce a single value. Each expression has a data type, which determines the type of value it produces. Data types can be primitive (e.g., int, double, boolean) or reference types (e.g., String, arrays).

## Increment and Decrement Operators

The increment (`++`) and decrement (`--`) operators are used to increase or decrease the value of a variable by 1, respectively. These operators can be applied both as prefix (e.g., `++i`) and postfix (e.g., `i++`). 

### Prefix vs. Postfix Increment/Decrement

- **Prefix Increment (`++a`)**: The value of the variable is incremented by 1, and then the new value is used in the expression.
- **Postfix Increment (`a++`)**: The current value of the variable is used in the expression, and then the variable is incremented by 1.

Example:
```java
int a = 5;
int b = ++a; // b is assigned the value of (a + 1), so b = 6, a = 6
int c = a++; // c is assigned the value of a, then a is incremented, so c = 6, a = 7
```

Thanks for your attention Happy coding.🙏 ❤️ 
