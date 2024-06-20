# Day 21: Understanding `break` and `continue` Statements in Java.

## **What is the `break` Statement?**
The `break` statement is used to exit a loop or switch statement prematurely. When encountered, it terminates the loop or switch and moves control to the next statement.

### **Syntax:**
```java
break;
```
### **Example:**
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break; // Exit the loop when i equals 4
            }
            System.out.println(i);
        }
    }
}
```

## **What is the `continue` Statement?**
The `continue` statement is used to skip the current iteration of a loop and proceed with the next iteration. It is useful when you want to skip certain values or conditions within a loop.

### **Syntax:**
```java
continue;
```

### **Example:**
```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue; // Skip the iteration when i equals 4
            }
            System.out.println(i);
        }
    }
}
```

Thanks for your attention Happy coding.🙏❤️
