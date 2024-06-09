# Day 17 : Switch-Case Statements in Java

Today, I learned about the switch-case statement in Java, which is used to choose and execute one block of code from many options, based on the value of a given expression. The switch statement evaluates the expression and then matches its value to a case label. This is a helpful alternative to using multiple `if-else-if` statements when you want to check one variable against many different values.

## Syntax of Switch-Case : 
The basic syntax of a switch-case statement is as follows:

```java
switch (variable) {
    case value1:
        // Code to run if expression equals value1
        break;
    case value2:
        // Code to run if expression equals value2
        break;
    // You can have any number of case statements.
    default:
        // Code to run if expression doesn't match any case
}
```
### Explanation : 
- `switch (variable)`: This is the value you want to check against multiple cases.
- `case value1`: If the expression matches value1, the code in this case block will run.
- `break`: Ends the switch-case statement so it doesn't run code in other cases.
- `default`: Runs if the expression doesn't match any of the given case values. This is optional but useful for catching unexpected values.

## Example of Switch-Case Statement in Java

This example demonstrates a switch-case statement that categorizes a person's age group.

```java
public class Main {
    public static void main(String[] args) {
        int age = 48;

        switch (age) {
            case 2:
                // If age is 2, print "Toddler"
                System.out.println("Toddler");
                break;
            case 18:
                // If age is 18, print "Teen"
                System.out.println("Teen");
                break;
            case 48:
                // If age is 48, print "Adult"
                System.out.println("Adult");
                break;
            case 90:
                // If age is 90, print "Elderly"
                System.out.println("Elderly");
                break;
        }
    }
}
```
### Explanation of given code :
This Java program checks the value of the variable `age` and prints out a message based on its value. Here's a simple explanation:

1. The program starts by setting the variable `age` to 48.
2. It then uses a `switch` statement to compare the value of `age` to different cases.
3. If `age` is 2, it prints "Toddler".
4. If `age` is 18, it prints "Teen".
5. If `age` is 48, it prints "Adult".
6. If `age` is 90, it prints "Elderly".
7. Since `age` is 48 in this example, it will print "Adult".

Basically, it's like asking the program, "If someone is 48 years old, what category do they fall into?" And the program responds with "Adult" because 48 falls into the case for adults.

### Conditional Statements vs. Switch-Case Statements in Java

**Conditional Statements (if-else) :**
- **Usage:** Used when there are few conditions to check.
- **Multiple Conditions:** Handled using else if.
- **Readability:** Good for a small number of conditions.

**Switch-Case Statements :**

- **Usage:** Used when there are multiple possible values for a variable.
- **Handling Multiple Cases:** Efficient and more readable for many cases.
- **Execution:** Jumps directly to the matching case label, improving performance for a large number of cases.

Thanks for your attention Happy coding.🙏 ❤️

