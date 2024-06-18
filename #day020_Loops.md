# Day 20: Exploring Loops in Java 🚀👨‍💻

## Understanding Loops

Loops are essential in programming as they allow us to execute a block of code repeatedly until a specific condition is met. Java offers several types of loops, each suited for different scenarios:

## Types of Loops :
***1*** .For Loop

***2*** .While Loop

***3*** .Do-While Loop

### 1. **For Loop**

The `for` loop is ideal when you know in advance how many times you want to execute a block of code. It consists of three parts:

```java
for (initialization; condition; update) {
    // Code to be executed repeatedly
}
```
-  **Initialization:** Executes once before the loop starts. Typically initializes a counter variable.
- **Condition:** Checked before each iteration. If true, the loop continues; if false, the loop terminates.
- **Update:** Executed after each iteration to update the counter variable.

### Example  :
```java
// Print numbers from 1 to 5 using a for loop
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### 2. **While Loop**

The while loop repeats a block of code as long as a specified condition is true:

```java
while (condition) {
    // Code to be executed repeatedly
}
```
- **Condition:** Checked before each iteration. If true, executes the code block; if false, terminates the loop.

### Example:
```java
// Print numbers from 1 to 5 using a while loop
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### 3.Do-While Loop
The do-while loop is similar to the while loop, except it guarantees at least one execution of the block of code before checking the condition:
```java
do {
    // Code to be executed repeatedly
} while (condition);
```
- **Condition:** Checked after each iteration. If true, continues executing; if false, terminates the loop.

***Example:***
```java
// Print numbers from 1 to 5 using a do-while loop
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

Thanks for your attention Happy coding.🙏 ❤️ 

