# Day 8: Operators and Expressions in Java

## Operators in Java

In Java, operators are symbols used for performing operations on variables and values. Expressions are combinations of these elements that evaluate to a single value. Here's a detailed rundown of the main operators:

## Types of  Operators in Java

### 1. Arithmetic Operators

Arithmetic operators are used to perform mathematical operations on numerical values.

- **Addition (`+`)**: Adds two operands.
    ```java
    int sum = 5 + 3; // sum is 8
    ```

- **Subtraction (`-`)**: Subtracts the second operand from the first.
    ```java
    int difference = 5 - 3; // difference is 2
    ```

- **Multiplication (`*`)**: Multiplies two operands.
    ```java
    int product = 5 * 3; // product is 15
    ```

- **Division (`/`)**: Divides the first operand by the second.
    ```java
    int quotient = 5 / 3; // quotient is 1
    ```

- **Modulus (`%`)**: Returns the remainder of the division operation.
    ```java
    int remainder = 5 % 3; // remainder is 2
    ```

### 2. Relational Operators

Relational operators are used to compare two values and determine the relationship between them.

- **Equal to (`==`)**: Checks if two operands are equal.
    ```java
    boolean isEqual = (5 == 3); // isEqual is false
    ```

- **Not equal to (`!=`)**: Checks if two operands are not equal.
    ```java
    boolean isNotEqual = (5 != 3); // isNotEqual is true
    ```

- **Greater than (`>`)**: Checks if the first operand is greater than the second.
    ```java
    boolean isGreater = (5 > 3); // isGreater is true
    ```

- **Less than (`<`)**: Checks if the first operand is less than the second.
    ```java
    boolean isLess = (5 < 3); // isLess is false
    ```

- **Greater than or equal to (`>=`)**: Checks if the first operand is greater than or equal to the second.
    ```java
    boolean isGreaterOrEqual = (5 >= 3); // isGreaterOrEqual is true
    ```

- **Less than or equal to (`<=`)**: Checks if the first operand is less than or equal to the second.
    ```java
    boolean isLessOrEqual = (5 <= 3); // isLessOrEqual is false
    ```

### 3. Logical Operators

Logical operators are used to perform logical operations on boolean values.

- **Logical AND (`&&`)**: Returns true if both operands are true.
    ```java
    boolean result = (5 > 3) && (3 > 1); // result is true
    ```

- **Logical OR (`||`)**: Returns true if at least one of the operands is true.
    ```java
    boolean result = (5 > 3) || (3 < 1); // result is true
    ```

- **Logical NOT (`!`)**: Returns the opposite of the operand's boolean value.
    ```java
    boolean result = !(5 > 3); // result is false
    ```

### 4. Assignment Operators

Assignment operators are used to assign values to variables.

- **Assignment (`=`)**: Assigns the value of the right operand to the left operand.
    ```java
    int value = 5; // value is 5
    ```

- **Addition Assignment (`+=`)**: Adds the value of the right operand to the left operand and assigns the result to the left operand.
    ```java
    int value = 5;
    value += 3; // value is now 8
    ```

- **Subtraction Assignment (`-=`)**: Subtracts the value of the right operand from the left operand and assigns the result to the left operand.
    ```java
    int value = 5;
    value -= 3; // value is now 2
    ```

- **Multiplication Assignment (`*=`)**: Multiplies the value of the left operand by the value of the right operand and assigns the result to the left operand.
    ```java
    int value = 5;
    value *= 3; // value is now 15
    ```

- **Division Assignment (`/=`)**: Divides the value of the left operand by the value of the right operand and assigns the result to the left operand.
    ```java
    int value = 5;
    value /= 3; // value is now 1
    ```

- **Modulus Assignment (`%=`)**: Computes the modulus of the left operand with the right operand and assigns the result to the left operand.
    ```java
    int value = 5;
    value %= 3; // value is now 2
    ```

### 5. Increment and Decrement Operators

Increment and decrement operators are used to increase or decrease the value of a variable by 1.

- **Increment (`++`)**: Increases the value of the operand by 1.
    ```java
    int value = 5;
    value++; // value is now 6
    ```

- **Decrement (`--`)**: Decreases the value of the operand by 1.
    ```java
    int value = 5;
    value--; // value is now 4
    ```

### 6. Conditional Operator (Ternary Operator)

The conditional operator (also known as the ternary operator) is a shorthand for writing if-else statements.

- **Ternary Operator (`? :`)**: Evaluates a boolean expression and returns one of two values based on the result of the expression.
    ```java
    int value = (5 > 3) ? 10 : 20; // value is 10
    ```

These operators are fundamental building blocks in Java programming and are used extensively in writing expressions and statements to perform various tasks.

Thanks for your attention Happy coding.❤️🙏

