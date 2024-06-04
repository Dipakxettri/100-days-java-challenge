## Day 12 : Strings in Java

Today is Day 12 of my 100-day Java challenge. Here are the key concepts I learned:

### Strings
- **Strings:** In Java, strings are sequences of characters enclosed within double quotes, like `"Hello, World!"`. They are used to represent text data.
- **Immutable:** Strings in Java are immutable, meaning once a string is created, its value cannot be changed. Any operation that modifies a string will create a new string instead of altering the original one.
- **Mutable:** Unlike strings, some objects in Java, like `StringBuilder` and `StringBuffer`, are mutable, meaning their values can be changed after they are created. This makes them more efficient for certain operations that involve frequent modifications.

### Print Methods
- **print():** This method prints text to the console without adding a newline at the end. For example, `System.out.print("Hello")` will print "Hello" without moving to the next line.
- **println():** This method prints text to the console and then moves to a new line. For example, `System.out.println("Hello")` will print "Hello" and then move to the next line.
- **printf():** This method is used to print formatted text. It allows you to format numbers and text in a specific way. For example, `System.out.printf("Age: %d", 25)` will print "Age: 25".
- **format():** Similar to `printf()`, it formats the given string using specified format specifiers. For example, `System.out.format("Number: %.2f", 123.456)` will print `Number: 123.46`.

### Format Specifiers
- **%d:** This format specifier is used to format integers. For example, `System.out.printf("%d", 100)` will print `100`.
- **%f:** This format specifier is used to format floating-point numbers. For example, `System.out.printf("%.2f", 3.14159)` will print `3.14`.
- **%s:** This format specifier is used to format strings. For example, `System.out.printf("%s", "Hello")` will print `Hello`.
- **%c:** This format specifier is used to format single characters. For example, `System.out.printf("%c", 'A')` will print `A`.
- **%b:** This format specifier is used to format boolean values. For example, `System.out.printf("%b", true)` will print `true`.
- **%e:** This format specifier is used to format numbers in scientific notation. For example, `System.out.printf("%e", 1234.56)` will print something like `1.234560e+03`.
- **%x:** This format specifier is used to format integers as hexadecimal. For example, `System.out.printf("%x", 255)` will print `ff`.
- **%o:** This format specifier is used to format integers as octal numbers. For example, `System.out.printf("%o", 10)` will print `12`.

It was a productive day learning about these essential concepts in Java!

Thanks for your attention Happy coding. 🙏❤️
