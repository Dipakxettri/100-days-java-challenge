# Day 30: Methods Overloading

## Method Overloading:
Method overloading allows multiple methods with the same name but different parameters within a class.

```java
public class Main {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two numbers: " + add(4, 4));
        System.out.println("Sum of three numbers: " + add(4, 4, 2));
    }
}
```

Thanks for your attention. Happy coding! 🙏❤
