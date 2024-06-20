# Day 26: Working with Arrays in Java

## **Checking the Length of an Array**
To find out the number of elements in an array, you can use the `.length` property.
```java
int[] numbers = {1, 2, 3, 4};
int length = numbers.length; // length is 4
System.out.println("The length of the array is: " + length);
```

## Two Ways to Print Arrays
### 1. **Using a For Loop:**
```java
int[] numbers = {1, 2, 3, 4};
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
```
### 2. **Using Element Indexing:**
```java
int[] numbers = {1, 2, 3, 4};
System.out.println(numbers[0]); // Prints 1
System.out.println(numbers[1]); // Prints 2
System.out.println(numbers[2]); // Prints 3
System.out.println(numbers[3]); // Prints 4
```

## **Decrement Printing the Arrays**

To print an array in reverse order, you can use a for loop with a decrementing index:
```java
int[] numbers = {1, 2, 3, 4};
for (int i = numbers.length - 1; i >= 0; i--) {
    System.out.print(numbers[i] + " ");
}
```

## **For-Each Loop:**
The for-each loop provides a simpler way to iterate through the elements of an array.
```java
int[] numbers = {1, 2, 3, 4};
for (int number : numbers) {
    System.out.print(number + " ");
}
```

Thanks for your attention Happy coding.🙏 ❤️


