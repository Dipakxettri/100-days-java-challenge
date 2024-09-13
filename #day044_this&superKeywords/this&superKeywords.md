# Java `this` and `super` Keywords

## `this` Keyword
The `this` keyword in Java refers to the current instance of a class. It is commonly used for several purposes:

### Uses of `this`:
1. **Referring to the current class instance variables**  
   It helps differentiate between instance variables and method parameters when they share the same name.

2. **Invoking the current class methods**  
   It can be used to call methods within the current class.

3. **Invoking the current class constructor**  
   It is used to call one constructor from another constructor within the same class (constructor chaining).

---

## `super` Keyword
The `super` keyword refers to the parent class (superclass) and is useful when dealing with inheritance.

### Uses of `super`:
1. **Referring to the parent class instance variables**  
   It allows access to variables in the parent class when the child class has variables with the same name.

2. **Invoking parent class methods**  
   It is used to call methods from the parent class, especially when they are overridden in the child class.

3. **Invoking parent class constructor**  
   It allows the child class to call the constructor of the parent class.

---

In essence, the `this` keyword is used to reference the current class's instance, while the `super` keyword is utilized to interact with the parent class's members in inheritance scenarios.
