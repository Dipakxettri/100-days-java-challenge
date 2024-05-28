# Day 6: Percentage Calculation Program and about type casting in Java

### Percentage Calculation Program

This Java program calculates the percentage of marks obtained in six subjects. It takes input for each subject's marks and calculates the percentage based on the total marks obtained out of a maximum possible total.

```java
//simple percentage calculation program
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simple percentage calculate program");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("English marks:");
        int sub1 = sc.nextInt();
        
        System.out.println("Nepali marks:");
        int sub2 = sc.nextInt();
        
        System.out.println("Math marks out of 100:");
        int sub3 = sc.nextInt();
        
        System.out.println("Physics marks out of 100:");
        int sub4 = sc.nextInt();
        
        System.out.println("Biology marks out of 100:");
        int sub5 = sc.nextInt();
        
        System.out.println("Chemistry marks out of 100:");
        int sub6 = sc.nextInt();
        
        int totalMarksObtained = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
        int totalMaxMarks = 600; // Since each subject is out of 100, and there are 6 subjects
        
        // Using type casting to ensure accurate division
        double percentage = (totalMarksObtained / (double) totalMaxMarks) * 100;
        
        System.out.println("Percentage: " + percentage + "%");
    }
}

```
## Explanation of Type Casting in Java

In Java, type casting is the process of converting one data type into another. In this code, `(double)` is used for type casting. Here's why:

**Implicit Type Casting:** When you divide two integers in Java, the result is also an integer. However, to get a decimal value as a result of division, at least one of the operands must be a decimal number (i.e., a floating-point type). In this case, dividing `totalMarksObtained` by `totalMaxMarks` yields an integer result because both operands are integers. To ensure the division yields a decimal value, we use type casting to explicitly convert `totalMaxMarks` to a `double`.

**Explicit Type Casting:** The syntax `(double)` is used for explicit type casting in Java. It tells the compiler to treat the operand `totalMaxMarks` as a `double` before performing the division operation. This ensures that the division result is a decimal value, giving us an accurate percentage calculation.

Thanks for your attention Happy coding.🙏 ❤️
