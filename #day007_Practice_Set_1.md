# Day 7 :  Practice Set 1 Exercises

## Question 1 : Sum of 2 numbers
Simple program that do sum of given numbers

### Code :

```java
// Question 1: Sum of Two Numbers
public class Main {
    public static void main(String[] args) {
        // Initializing two integers
        int a = 20;
        int b = 20;
        
        // Calculating the sum
        int sum = a + b;
        
        // Printing the sum
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }
}
```
## Question 2 : GPA Calculation Program

This program calculates the Grade Point Average (GPA) based on marks obtained in three subjects.

### Explanation :

The GPA is calculated by dividing the total marks obtained in all subjects by the total maximum marks and then scaling it to a 10-point scale.

### Formula :

The formula to calculate GPA is:

GPA = (Total Marks Obtained) / 30

Here, we assume that the maximum marks for each subject is 100, so the total maximum marks for three subjects would be 300.

### Code :

```java
// Question 2: GPA Calculation Program
public class Main {
    public static void main(String[] args) {
        // Marks for three subjects
        float sub1 = 90; 
        float sub2 = 40; 
        float sub3 = 48;
        
        // Calculate the average GPA
        // Formula: GPA = (total marks of subjects)/30
        float gpa = (sub1 + sub2 + sub3) / 30;  // Assuming maximum marks for each subject is 100, so total maximum marks = 300
        
        // Print the average GPA
        System.out.println("Average GPA: " + gpa);
    }
}
```
## Question 3 : Personalized Greeting Program

This program takes input from the user for their name and prints a personalized greeting message.

### Explanation :

The program prompts the user to enter their name using the `Scanner` class and then reads the input using `sc.nextLine()`. It then prints a greeting message using the entered name.

```java
// Question 3: User Input and Greeting
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for input
        System.out.print("Enter your name: ");
        
        // Reading user input
        String name = sc.nextLine();
        
        // Greeting the user
        System.out.println("Hello, " + name + "! Have a good day.");
    }
}
```

## String Concatenation 
String concatenation is used to combine strings in Java. In this program, the greeting message is created by combining the string "Hello, ", the user's name (stored in the `name` variable), and the string "!" using the `+` operator.

## Question 4 : Kilometer to Mile Converter

This program converts a distance in kilometers to miles.

### Explanation :

The program defines a variable `kilometer` with the value 4. It then calculates the equivalent distance in miles using the conversion factor 0.621371 (1 kilometer = 0.621371 miles). The result is stored in the variable `mile`.

###  Formula :
1 kilometer  =  0.621371 miles
So,
Miles = kilometers *  0.621371 

### Code :

```java
// Question 4: Kilometer to Mile Conversion
public class Main {
    public static void main(String[] args) {
        // Distance in kilometers
        double kilometer = 4;
        
        // Conversion factor from kilometers to miles
        double conversionFactor = 0.621371;
        
        // Calculating distance in miles
        double mile = kilometer * conversionFactor;
        
        // Displaying distance in miles
        System.out.println("Distance in miles: " + mile);
    }
}
```

## Question 5 : Checking for Integer Input

This program prompts the user to enter a number and checks if the input is an integer.

### Explanation :

The `hasNextInt()` method is a part of the `Scanner` class in Java, which is used to read input from the user. It checks if the next token in the input stream is an integer. 

Here's a simple explanation of how it works:

- When `hasNextInt()` is called, it scans the next token from the input stream.
- If the next token is an integer, it returns `true`; otherwise, it returns `false`.
- It does not consume the input, so the token remains in the input stream for future reading.

In our program, we use `hasNextInt()` to check if the user has entered an integer. If the input is an integer, we proceed with further operations; otherwise, we handle the situation accordingly.

### Code :

```java
// Question 5 : Checking for Integer Input 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter number: ");
        
        // Check if the next input is an integer
        boolean isInteger = sc.hasNextInt();
        
        // Display the result
        System.out.println(isInteger);
        
        // Close the scanner object to release resources
        sc.close();
    }
}
```

## Question 6 :  Percentage Calculator

This program calculates the percentage of a given number.

### Formula :
percentage = (number / 100) * 100

### Code :

```java
// Question 6 : Percentage Calculator 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the input number
        double number = sc.nextDouble();
        
        // Calculate the percentage
        double percentage = (number / 100) * 100;
        
        // Display the result
        System.out.println("Percentage of " + number + " is: " + percentage + "%");
        
        // Close the scanner object to release resources
        sc.close();
    }
}
```
These are some practice questions which are essential to solve for developing problem solving skills!!

Thanks for your attention Happy coding.🙏❤️






