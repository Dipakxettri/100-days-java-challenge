### Constructors in Java

Constructors in Java are special methods used to initialize objects. They have the same name as the class and do not have a return type.

#### Key Points:
- **Purpose**: To initialize an object when it is created.
- **Types**: 
  - **Default Constructor**: Automatically provided by Java if no other constructor is defined. It assigns default values (0, null, etc.).
  - **Parameterized Constructor**: Allows passing parameters to initialize the object with specific values.
- **Syntax**:
  ```java
  class ClassName {
      // Constructor
      ClassName() {
          // Initialization code
      }
      
      // Parameterized Constructor
      ClassName(int value) {
          // Initialization with value
      }
  }
