# Day 19  :  Practice Set 4 Exercises

This is an practice set 4 exercises for better understanding.

## Some Questions  :
**Q.no.1)** What will be the output of this program:
```java
int a = 100;
if (a == 2) { 
    System.out.println("2");
} else { 
    System.out.println("!2");
}
```

**Answer:**
The output will be `!2` because `a` is not equal to 2.

**Q.no.2)** Write a program to find out whether a student is pass or fail if it requires total 40% marks and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.

**Answer:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read marks for subject 1
        System.out.println("Enter marks for subject 1:");
        int subject1 = scanner.nextInt();
        
        // Read marks for subject 2
        System.out.println("Enter marks for subject 2:");
        int subject2 = scanner.nextInt();
        
        // Read marks for subject 3
        System.out.println("Enter marks for subject 3:");
        int subject3 = scanner.nextInt();
        
        // Calculate total marks
        float totalMarks = subject1 + subject2 + subject3;
        // Calculate percentage
        float percentage = (totalMarks / 300) * 100;
        
        // Check if the student has passed or failed
        if (percentage >= 40 && subject1 >= 33 && subject2 >= 33 && subject3 >= 33) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
```

***Explanation of the Answer  :*** 
The program takes input for three subjects, calculates the total percentage, and checks if the student has at least 33% in each subject and 40% overall to determine if they pass or fail.

**Q.no.3)** Calculate the income tax paid by an employee to the government as per the slabs mentioned below:
Income             | Tax
------------------ | ---
2.5L - 5.0L        | 5%
5.0L - 10.0L       | 20%
Above 10.0L        | 30%

**Answer:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the income from the user
        System.out.println("Enter your income in lakhs:");
        double income = scanner.nextDouble();

        // Variable to store the tax
        double tax = 0;

        // Calculate tax based on income slabs
        if (income <= 2.5) {
            tax = 0; // No tax for income up to 2.5L
        } else if (income > 2.5 && income <= 5.0) {
            tax = (income - 2.5) * 0.05; // 5% tax for income between 2.5L to 5.0L
        } else if (income > 5.0 && income <= 10.0) {
            tax = (2.5 * 0.05) + (income - 5.0) * 0.20; // 20% tax for income between 5.0L to 10.0L
        } else {
            tax = (2.5 * 0.05) + (5.0 * 0.20) + (income - 10.0) * 0.30; // 30% tax for income above 10.0L
        }

        // Print the calculated tax
        System.out.println("Income Tax to be paid: " + tax + " lakhs");
    }
}
```

***Explanation of the Answer  :***
This program takes the user's income as input and calculates the income tax based on the given tax slabs. The calculated tax is then printed out.

**Q.no.4)** Write a Java program to find out the day of the week given the number (1 for Sunday, 2 for Monday, and so on).

**Answer:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the number corresponding to the day of the week
        System.out.println("Enter a number (1 for Sunday, 2 for Monday, etc.):");
        int dayNumber = scanner.nextInt();

        // Variable to store the name of the day
        String day;

        // Determine the day of the week based on the number
        switch (dayNumber) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid number! Please enter a number between 1 and 7.";
                break;
        }

        // Print the name of the day
        System.out.println("The day is: " + day);
    }
}
```

***Explanation of the Answer  :***
This program takes a number as input and prints the corresponding day of the week. If the number is not between 1 and 7, it informs the user that the input is invalid.



**Q.no.5)** Write a Java program to find out whether a year entered by the user is a leap year or not.

**Answer:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the year from the user
        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = false;

        // A year is a leap year if it is divisible by 4
        if (year % 4 == 0) {
            // But if the year is divisible by 100, it must also be divisible by 400 to be a leap year
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        // Print the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
```

***Explanation of the Answer  :***
This program checks whether a given year is a leap year or not based on the rules of the Gregorian calendar. It takes the year as input from the user and prints whether it is a leap year or not.

**Q.no.6)** Write a Java program to find out the type of website from the URL using the `endsWith()` method.

**Answer:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the URL from the user
        System.out.println("Enter a website URL:");
        String url = scanner.nextLine();

        // Check the type of website based on the domain
        if (url.endsWith(".com")) {
            System.out.println(url + " is a commercial website.");
        } else if (url.endsWith(".org")) {
            System.out.println(url + " is a non-profit organization website.");
        } else if (url.endsWith(".edu")) {
            System.out.println(url + " is an educational institution website.");
        } else if (url.endsWith(".gov")) {
            System.out.println(url + " is a government website.");
        } else {
            System.out.println("Unknown type of website.");
        }
    }
}
```

***Explanation of the Answer  :***
This program takes a URL input from the user and determines the type of website based on its domain using the endsWith() method. It checks for common domain suffixes like .com, .org, .edu, and .gov to categorize the type of website. If the URL doesn't end with any of these, it prints "Unknown type of website".

Thanks for your attention Happy coding.🙏 ❤️ 
