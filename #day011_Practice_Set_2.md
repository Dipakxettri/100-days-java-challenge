## Day 11 : Practice Set 2 Exercises

### Q1) Result of Expression

```java
// Expression: float a = 9/4 * 7/2
float a = 9/4 * 7/2; // a = 9/4 * 7/2 = 2 * 3 = 6
System.out.println("Result of expression: " + a);
```

**Explanation:** The expression `9/4` and `7/2` are integer divisions, resulting in `2` and `3` respectively. Then, `2 * 3` is calculated, resulting in `6`. Since the variable `a` is declared as float, the result is implicitly converted to float, giving `6.0`.

### Q2) Encrypting and Decrypting a Grade
```java
// Encrypting Grade
char grade = 'B';
grade += 8; // 'B' + 8 = 'J'
System.out.println("Encrypted Grade: " + grade);

// Decrypting Grade
grade -= 8; // 'J' - 8 = 'B'
System.out.println("Decrypted Grade: " + grade);
```

**Explanation:** In Java, characters are represented using Unicode values. Adding 8 to the Unicode value of a character shifts it by 8 positions. Subtracting 8 reverses the process, bringing it back to the original grade.

### Q3) Comparison of Two Numbers

```java
int number = 10;
int userInput = 7;
boolean greater = number > userInput; // Using comparison operator >
System.out.println("Is number greater than userInput? " + greater);
```

**Explanation:**
The comparison operator > checks if the value of number is greater than userInput. If number is indeed greater, the boolean variable greater will be true; otherwise, it will be false.

### Q4) Finding Value of 'a'
```java
int x = 9;
int a = 7 * 49 / 7 + 36 / 7;
System.out.println("Value of 'a': " + a);
```
**Explanation:** In the expression `7 * 49 / 7 + 36 / 7`, integer division is performed first. So, `7 * 49 / 7` is calculated as 49, and `36 / 7` is calculated as 5. Then, the result of these two divisions (49 and 5) is added together, resulting in 54. Therefore, the value of 'a' is 54.

Thanks for your attention Happy coding. 🙏 ❤️ 
