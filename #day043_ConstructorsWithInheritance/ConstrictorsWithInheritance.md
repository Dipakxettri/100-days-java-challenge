# Constructors with Inheritance in Java

- **Base Class Constructor**: When a subclass is created, the constructor of the superclass is called first.
- **Implicit Super Call**: Java automatically inserts `super()` in the subclass constructor to call the no-arg constructor of the superclass.
- **Explicit Super Call**: You can explicitly call a specific superclass constructor using `super(args)`.
- **Order of Execution**: Superclass constructor runs before the subclass constructor.
- **Example**:
  ```java
  class A {
      A() { System.out.println("A's constructor"); }
  }

  class B extends A {
      B() { super(); System.out.println("B's constructor"); }
  }
  
  public class Main {
      public static void main(String[] args) {
          B obj = new B();  // Output: A's constructor, B's constructor
      }
  }
