# Day 9: Associativity and Precedence of Operators in Java

## Overview

Understanding associativity and precedence is crucial in Java programming as it helps in determining the order of evaluation of expressions. Associativity specifies the order in which operators of the same precedence are evaluated, while precedence determines the order in which different operators are evaluated.

## Associativity

Associativity determines the order in which operators of the same precedence are evaluated. There are two types of associativity:

- **Left-associative**: Operators are evaluated from left to right.
- **Right-associative**: Operators are evaluated from right to left.

For example, the addition (`+`) operator is left-associative, so `5 + 3 + 2` is evaluated as `(5 + 3) + 2`.

## Precedence

Precedence determines the order in which different operators are evaluated. Operators with higher precedence are evaluated before operators with lower precedence. For example, multiplication (`*`) has higher precedence than addition (`+`), so `5 + 3 * 2` is evaluated as `5 + (3 * 2)`.

If operators have the same precedence, their associativity comes into play. For example, both addition (`+`) and subtraction (`-`) have the same precedence and are left-associative, so `5 - 3 + 2` is evaluated as `(5 - 3) + 2`.

## Examples

```java
// Example of associativity and precedence
int result = 5 + 3 * 2;     // result is 11 (3 * 2 is evaluated first due to higher precedence)
int result2 = (5 + 3) * 2;  // result2 is 16 (5 + 3 is evaluated first due to parentheses)
```

# Operator Precedence and Associativity Chart

| Operator         | Associativity | Precedence | Explanation                                                        |
|------------------|---------------|------------|--------------------------------------------------------------------|
| Parentheses ()   | N/A           | Highest    | Parentheses are used to group expressions and override precedence. |
| Increment ++     | Right         | High       | Increment operator (postfix)                                      |
| Decrement --     | Right         | High       | Decrement operator (postfix)                                      |
| Unary +          | Right         | High       | Unary plus operator                                                |
| Unary -          | Right         | High       | Unary minus operator                                               |
| Logical NOT !    | Right         | High       | Logical negation operator                                          |
| Bitwise NOT ~    | Right         | High       | Bitwise complement operator                                        |
| Multiplication * | Left          | Medium     | Multiplication operator                                            |
| Division /       | Left          | Medium     | Division operator                                                  |
| Modulus %        | Left          | Medium     | Modulus operator (remainder of division)                           |
| Addition +       | Left          | Low        | Addition operator                                                  |
| Subtraction -    | Left          | Low        | Subtraction operator                                               |
| Left Shift <<    | Left          | Low        | Bitwise left shift operator                                        |
| Right Shift >>   | Left          | Low        | Signed bitwise right shift operator                                |
| Unsigned Right Shift >>> | Left   | Low        | Unsigned bitwise right shift operator                              |
| Less Than <      | Left          | Low        | Less than operator                                                 |
| Greater Than >   | Left          | Low        | Greater than operator                                              |
| Less Than or Equal To <= | Left  | Low        | Less than or equal to operator                                     |
| Greater Than or Equal To >= | Left | Low        | Greater than or equal to operator                                  |
| Equality ==      | Left          | Low        | Equality operator                                                  |
| Inequality !=    | Left          | Low        | Inequality operator                                                |
| Bitwise AND &    | Left          | Low        | Bitwise AND operator                                               |
| Bitwise XOR ^    | Left          | Low        | Bitwise XOR operator                                               |
| Bitwise OR \|    | Left          | Low        | Bitwise OR operator                                                |
| Logical AND &&   | Left          | Low        | Logical AND operator                                               |
| Logical OR \|\|  | Left          | Low        | Logical OR operator                                                |
| Conditional ?:   | Right         | Lowest     | Ternary conditional operator (shorthand if-else)                   |
| Assignment =     | Right         | Lowest     | Assignment operator                                                |
| Compound Assignment (e.g., +=) | Right | Lowest | Compound assignment operator                                     |

Thanks for your attention Happy coding.🙏❤️
