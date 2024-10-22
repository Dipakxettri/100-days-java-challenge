// Interface with a default method
interface Animal {
    void sound(); // Abstract method

    default void eat() {
        System.out.println("This animal eats food."); // Default method
    }
}

// Class implementing the interface
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }

    // Override the default method (optional)
    @Override
    public void eat() {
        System.out.println("The dog eats meat.");
    }
}

// Main class
public class DefaultMethImplement{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Output: Woof!
        dog.eat();   // Output: The dog eats meat.
    }
}
