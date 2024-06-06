# Day 13 : Java String Methods and Escape Sequence Characters

## Java Index of a String

In Java, a string is essentially a sequence of characters. Each character in the string has a position, or index, associated with it. The index of a string starts from 0 and goes up to `length - 1`, where `length` is the number of characters in the string.

### Example
Consider the string "Hello":
- `H` is at index `0`
- `e` is at index `1`
- `l` is at index `2`
- `l` is at index `3`
- `o` is at index `4`

```java
String example = "Hello";
char firstChar = example.charAt(0); // firstChar = 'H'
char secondChar = example.charAt(1); // secondChar = 'e'
```

## String Methods in Java

- `length()`: This method tells you how many characters are in a string.

    ```java
    String str = "Hello";
    int len = str.length(); // len will be 5
    ```

- `toLowerCase()`: This changes all letters in a string to lowercase.

    ```java
    String str = "Hello";
    String lower = str.toLowerCase(); // lower will be "hello"
    ```

- `toUpperCase()`: This changes all letters in a string to uppercase.

    ```java
    String str = "Hello";
    String upper = str.toUpperCase(); // upper will be "HELLO"
    ```

- `trim()`: It removes any extra spaces at the beginning or end of a string.

    ```java
    String str = "  Hello  ";
    String trimmed = str.trim(); // trimmed will be "Hello"
    ```
- `substring(int beginIndex)`: It gives you a part of the string starting from a specified position.

    ```java
    String str = "Hello World";
    String sub = str.substring(6); // sub will be "World"
    ```

- `substring(int beginIndex, int endIndex)`: Similar to the previous one, but you can specify both the start and end positions.

    ```java
    String str = "Hello World";
    String sub = str.substring(6, 11); // sub will be "World"
    ```

- `replace(char oldChar, char newChar)`: This replaces all occurrences of a specific character with another character.

    ```java
    String str = "Hello";
    String replaced = str.replace('l', 'x'); // replaced will be "Hexxo"
    ```


- `replace(CharSequence target, CharSequence replacement)`: This replaces all occurrences of a specific sequence of characters with another sequence.

    ```java
    String str = "Hello";
    String replaced = str.replace("ll", "xx"); // replaced will be "Hexxo"
    ```

- `startsWith(String prefix)`: This checks if a string starts with a specific set of characters.

    ```java
    String str = "Hello";
    boolean startsWithHello = str.startsWith("He"); // startsWithHello will be true
    ```

- `endsWith(String suffix)`: This checks if a string ends with a specific set of characters.

    ```java
    String str = "Hello";
    boolean endsWithO = str.endsWith("o"); // endsWithO will be true
    ```

- `charAt(int index)`: Returns the character at the specified index in a string.

    ```java
    String str = "Hello";
    char ch = str.charAt(1); // ch will be 'e'
    ```

- `indexOf(int ch)`: It tells you the position of the first occurrence of a character in a string. You can also specify a starting position for the search.

    ```java
    String str = "Hello";
    int index = str.indexOf('l'); // index will be 2
    int indexFrom = str.indexOf('l', 3); // indexFrom will be 3
    ```

- `lastIndexOf(int ch)`: Similar to the previous one, but it gives you the position of the last occurrence of a character. You can also specify a starting position for the search.

    ```java
    String str = "Hello";
    int lastIndex = str.lastIndexOf('l'); // lastIndex will be 3
    int lastIndexFrom = str.lastIndexOf('l', 2); // lastIndexFrom will be 2
    ```

- `equals(Object obj)`: This checks if two strings have the same content.

    ```java
    String str1 = "Hello";
    String str2 = "Hello";
    boolean isEqual = str1.equals(str2); // isEqual will be true
    ```

- `equalsIgnoreCase(String anotherString)`: Similar to the previous one, but it ignores whether the letters are uppercase or lowercase.

    ```java
    String str1 = "Hello";
    String str2 = "hello";
    boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // isEqualIgnoreCase will be true
    ```

## Escape Sequences in Java

Escape sequences are special characters used in Java to represent certain whitespace characters, symbols, and other non-printable characters within string literals. Each escape sequence is prefixed by a backslash (`\`). Here's a list of commonly used escape sequences in Java:

- `\n`: Newline - Moves the cursor to the next line.
  
    ```java
    String str = "Hello\nWorld";
    // Output:
    // Hello
    // World
    ```

- `\t`: Tab - Inserts a tab space.

    ```java
    String str = "Hello\tWorld";
    // Output: Hello   World
    ```

- `\b`: Backspace - Moves the cursor one position back (deletes the previous character).

    ```java
    String str = "Hello\bWorld";
    // Output: HellWorld
    ```

- `\r`: Carriage Return - Moves the cursor to the beginning of the current line.

    ```java
    String str = "Hello\rWorld";
    // Output: World
    // Explanation: "World" overwrites "Hello"
    ```

- `\'`: Single Quote - Inserts a single quote character.

    ```java
    String str = "It\'s a nice day";
    // Output: It's a nice day
    ```

- `\"`: Double Quote - Inserts a double quote character.

    ```java
    String str = "He said, \"Hello World\"";
    // Output: He said, "Hello World"
    ```

- `\\`: Backslash - Inserts a backslash character.

    ```java
    String str = "This is a backslash: \\";
    // Output: This is a backslash: \
    ```

- `\f`: Form Feed - Moves the cursor to the next logical page (used in printers).

    ```java
    String str = "Hello\fWorld";
    // Form feed effect is not visible in console output
    ```

### Using Escape Sequences in Java

Escape sequences are used within double quotes to ensure that the string is correctly interpreted. Here are some practical examples:

1. **Printing a Quote Inside a String**:

    ```java
    String quote = "She said, \"Java is fun!\"";
    System.out.println(quote);
    // Output: She said, "Java is fun!"
    ```

2. **Creating a Multiline String**:

    ```java
    String multiLine = "First Line\nSecond Line\nThird Line";
    System.out.println(multiLine);
    // Output:
    // First Line
    // Second Line
    // Third Line
    ```

3. **Using Tab Spaces**:

    ```java
    String tabbed = "Column1\tColumn2\tColumn3";
    System.out.println(tabbed);
    // Output: Column1  Column2  Column3
    ```
    
4. **Inserting Backslashes**:

    ```java
    String path = "C:\\Program Files\\Java";
    System.out.println(path);
    // Output: C:\Program Files\Java
    ```


### Summary

Escape sequences are essential for formatting string literals# Day 13: Java String Methods and Escape Sequence Characters

## Java Index of a String

In Java, a string is essentially a sequence of characters. Each character in the string has a position, or index, associated with it. The index of a string starts from 0 and goes up to `length - 1`, where `length` is the number of characters in the string.

### Example
Consider the string "Hello":
- `H` is at index `0`
- `e` is at index `1`
- `l` is at index `2`
- `l` is at index `3`
- `o` is at index `4`

```java
String example = "Hello";
char firstChar = example.charAt(0); // firstChar = 'H'
char secondChar = example.charAt(1); // secondChar = 'e'
```

## String Methods in Java

- `length()`: This method tells you how many characters are in a string.

    ```java
    String str = "Hello";
    int len = str.length(); // len will be 5
    ```

- `toLowerCase()`: This changes all letters in a string to lowercase.

    ```java
    String str = "Hello";
    String lower = str.toLowerCase(); // lower will be "hello"
    ```

- `toUpperCase()`: This changes all letters in a string to uppercase.

    ```java
    String str = "Hello";
    String upper = str.toUpperCase(); // upper will be "HELLO"
    ```

- `trim()`: It removes any extra spaces at the beginning or end of a string.

    ```java
    String str = "  Hello  ";
    String trimmed = str.trim(); // trimmed will be "Hello"
    ```
- `substring(int beginIndex)`: It gives you a part of the string starting from a specified position.

    ```java
    String str = "Hello World";
    String sub = str.substring(6); // sub will be "World"
    ```

- `substring(int beginIndex, int endIndex)`: Similar to the previous one, but you can specify both the start and end positions.

    ```java
    String str = "Hello World";
    String sub = str.substring(6, 11); // sub will be "World"
    ```

- `replace(char oldChar, char newChar)`: This replaces all occurrences of a specific character with another character.

    ```java
    String str = "Hello";
    String replaced = str.replace('l', 'x'); // replaced will be "Hexxo"
    ```


- `replace(CharSequence target, CharSequence replacement)`: This replaces all occurrences of a specific sequence of characters with another sequence.

    ```java
    String str = "Hello";
    String replaced = str.replace("ll", "xx"); // replaced will be "Hexxo"
    ```

- `startsWith(String prefix)`: This checks if a string starts with a specific set of characters.

    ```java
    String str = "Hello";
    boolean startsWithHello = str.startsWith("He"); // startsWithHello will be true
    ```

- `endsWith(String suffix)`: This checks if a string ends with a specific set of characters.

    ```java
    String str = "Hello";
    boolean endsWithO = str.endsWith("o"); // endsWithO will be true
    ```

- `charAt(int index)`: Returns the character at the specified index in a string.

    ```java
    String str = "Hello";
    char ch = str.charAt(1); // ch will be 'e'
    ```

- `indexOf(int ch)`: It tells you the position of the first occurrence of a character in a string. You can also specify a starting position for the search.

    ```java
    String str = "Hello";
    int index = str.indexOf('l'); // index will be 2
    int indexFrom = str.indexOf('l', 3); // indexFrom will be 3
    ```

- `lastIndexOf(int ch)`: Similar to the previous one, but it gives you the position of the last occurrence of a character. You can also specify a starting position for the search.

    ```java
    String str = "Hello";
    int lastIndex = str.lastIndexOf('l'); // lastIndex will be 3
    int lastIndexFrom = str.lastIndexOf('l', 2); // lastIndexFrom will be 2
    ```

- `equals(Object obj)`: This checks if two strings have the same content.

    ```java
    String str1 = "Hello";
    String str2 = "Hello";
    boolean isEqual = str1.equals(str2); // isEqual will be true
    ```

- `equalsIgnoreCase(String anotherString)`: Similar to the previous one, but it ignores whether the letters are uppercase or lowercase.

    ```java
    String str1 = "Hello";
    String str2 = "hello";
    boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // isEqualIgnoreCase will be true
    ```

## Escape Sequences in Java

Escape sequences are special characters used in Java to represent certain whitespace characters, symbols, and other non-printable characters within string literals. Each escape sequence is prefixed by a backslash (`\`). Here's a list of commonly used escape sequences in Java:

- `\n`: Newline - Moves the cursor to the next line.
  
    ```java
    String str = "Hello\nWorld";
    // Output:
    // Hello
    // World
    ```

- `\t`: Tab - Inserts a tab space.

    ```java
    String str = "Hello\tWorld";
    // Output: Hello   World
    ```

- `\b`: Backspace - Moves the cursor one position back (deletes the previous character).

    ```java
    String str = "Hello\bWorld";
    // Output: HellWorld
    ```

- `\r`: Carriage Return - Moves the cursor to the beginning of the current line.

    ```java
    String str = "Hello\rWorld";
    // Output: World
    // Explanation: "World" overwrites "Hello"
    ```

- `\'`: Single Quote - Inserts a single quote character.

    ```java
    String str = "It\'s a nice day";
    // Output: It's a nice day
    ```

- `\"`: Double Quote - Inserts a double quote character.

    ```java
    String str = "He said, \"Hello World\"";
    // Output: He said, "Hello World"
    ```

- `\\`: Backslash - Inserts a backslash character.

    ```java
    String str = "This is a backslash: \\";
    // Output: This is a backslash: \
    ```

- `\f`: Form Feed - Moves the cursor to the next logical page (used in printers).

    ```java
    String str = "Hello\fWorld";
    // Form feed effect is not visible in console output
    ```

### Using Escape Sequences in Java

Escape sequences are used within double quotes to ensure that the string is correctly interpreted. Here are some practical examples:

1. **Printing a Quote Inside a String**:

    ```java
    String quote = "She said, \"Java is fun!\"";
    System.out.println(quote);
    // Output: She said, "Java is fun!"
    ```

2. **Creating a Multiline String**:

    ```java
    String multiLine = "First Line\nSecond Line\nThird Line";
    System.out.println(multiLine);
    // Output:
    // First Line
    // Second Line
    // Third Line
    ```

3. **Using Tab Spaces**:

    ```java
    String tabbed = "Column1\tColumn2\tColumn3";
    System.out.println(tabbed);
    // Output: Column1  Column2  Column3
    ```
    
4. **Inserting Backslashes**:

    ```java
    String path = "C:\\Program Files\\Java";
    System.out.println(path);
    // Output: C:\Program Files\Java
    ```


### Summary

Escape sequences are essential for formatting string literals in Java, allowing developers to include special characters and control characters within their strings. They enhance the readability and manageability of strings, especially when dealing with formatted text or special characters.

Thanks for your attention Happy coding.🙏 ❤️ 
