# Day 37 : Access Modifiers and Getters/Setters in Java.

## Access Modifiers in Java
Access modifiers in Java control the visibility and accessibility of classes, methods, and other members. They define the scope of where the elements can be accessed from.

### List of Access Modifiers
1. **public**
   - **Description:** Accessible from anywhere.
2. **protected**
   - **Description:** Accessible within package, subclasses.
3. **default** (no modifier)
   - **Description:** Accessible within the package.
4. **private**
   - **Description:** Accessible within the class.

## Getters and Setters in Java
Getters and setters are methods used to access and update the private fields of a class. They follow a naming convention and provide controlled access to class properties.

### Purpose
- **Encapsulation**: Protect internal state.
- **Validation**: Add logic for setting values.
- **Abstraction**: Hide implementation details.

### Getter:
A getter method retrieves the value of a private field.

### Setter:
A setter method sets the value of a private field.

### Summary
- **Getters:** Retrieve field values.
- **Setters:** Update field values.Use: Ensure encapsulation and validation.

** Example Code: **
```java
class Employee {    // Employee Class
    private String name; // Name property
    private int salary; // Salary property

    // Method to set the name property
    public void setName(String n) {
        name = n;
    }

    // Method to get the name property
    public String getName() {
        return name;
    }

    // Method to set the salary property
    public void setSalary(int s) {
        salary = s;
    }

    // Method to get the salary property
    public int getSalary() {
        return salary;
    }
}

public class AccessModifiersAndGreatersAndSetters {

    public static void main(String[] args) {
        // Creating an instance of Employee class
        Employee em = new Employee();
        
        // Setting the name of the employee
        em.setName("Deepak Ghimire");
        
        // Printing the name of the employee
        System.out.println(em.getName());
        
        // Setting the salary of the employee
        em.setSalary(80);
        
        // Printing the salary of the employee
        System.out.println(em.getSalary());
    }
}
```

Thanks for your attention Happy coding.❤️❤️


