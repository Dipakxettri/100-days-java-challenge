# Day 16 : Logical Operators in Java

Today's focus was on logical operators in Java, essential tools for making decisions in programming. Logical operators allow us to combine multiple conditions and perform actions based on whether these conditions are met. There are three main logical operators in Java:

1. **AND Operator (`&&`):** This operator returns true only if both of the operands are true. It's like saying "both conditions must be true for this to happen."

2. **OR Operator (`||`):** This operator returns true if at least one of the operands is true. It's like saying "either condition can be true for this to happen."

3. **NOT Operator (`!`):** This operator reverses the logical state of its operand. If a condition is true, the NOT operator will make it false, and vice versa. It's like saying "whatever the condition is, do the opposite."

### Example :
```java
public class LogicalOperatorsExample {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        // Using AND operator (&&)
        if (num1 < num2 && num2 < num3) {
            System.out.println("Both conditions are true");
        } else {
            System.out.println("At least one condition is false");
        }

        // Using OR operator (||)
        if (num1 > num2 || num2 < num3) {
            System.out.println("At least one condition is true");
        } else {
            System.out.println("Both conditions are false");
        }

        // Using NOT operator (!)
        boolean isTrue = true;
        if (!isTrue) {
            System.out.println("The condition is false");
        } else {
            System.out.println("The condition is true");
        }
    }
}
```

In this example:

- The `&&` operator (AND) checks if both conditions are true. If both are true, it prints "Both conditions are true".
- The `||` operator (OR) checks if at least one condition is true. If either condition is true, it prints "At least one condition is true".
- The `!` operator (NOT) negates the condition. If the condition is true, it prints "The condition is true"; otherwise, it prints "The condition is false".

Understanding these operators helps us create more flexible and sophisticated conditions in our programs, making our code more powerful and efficient. With practice, we can use these logical operators to build complex decision-making logic in our Java programs. 🚀💻 Keep coding and exploring!

Thanks for your attention Happy coding.🙏❤️
