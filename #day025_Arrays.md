

# Day 25: Learning About Arrays in Java

## **What is an Array?**
An array is a data structure that allows us to store multiple values of the same type in a single variable. Instead of declaring separate variables for each value, we can use an array to store all the values under one name, using an index to access each value.
## **Characteristics of Arrays:**
- **Fixed Size:** Once an array is created, its size cannot be changed. You must specify the number of elements it will hold at the time of creation.
- **Zero-based Indexing:** The first element of an array is at index 0, the second at index 1, and so on.
- **Same Data Type:** All elements in an array must be of the same type (e.g., all integers, all strings, etc.).
- **Efficient Access:** Arrays provide efficient access to their elements using an index.
- **Can Be Overwritten:** Array elements can be overwritten by assigning new values to them.

## **Three Ways to Create an Array in Java**
### 1. **Declaration and Initialization Separately:**
In this method, you first declare the array, then you initialize it.
```java
int[] numbers;       // Declaration
numbers = new int[4]; // Initialization with size 4
numbers[0] = 10; // Stores the value 10 in index 0
number[1] = 20; //stores the value 20 in index 1
System.out.println(number[0]); //prints the value in index 0 which is 10
```

### 2. **Declaration and Initialization Together:**
Here, you declare and initialize the array in a single statement.
```java
int[] numbers = new int[4]; // Declaration and initialization
numbers[0] = 1; // Stores the value 1 in index 0
number[1] = 2; //stores the value 2 in index 1
System.out.println(number[1]); //prints the value in index 1 which is 2
```

### 3. **Using an Array Literal:**
```java
public class ArrayExample3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4}; // Declaration, initialization, and assignment
System.out.println(numbers[3]); //print the value in index 3 which is 4
```

Thanks for your attention Happy coding 🙏❤️!!
