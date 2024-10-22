// Abstract Class
abstract class Animal {
    abstract void sound(); // Abstract method

    void eat() { // Concrete method
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    void sound() {
        System.out.println("Woof!");
    }
}

// Main Class
public class AbstractClasses{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Output: Woof!
        dog.eat();   // Output: This animal eats food.
    }
}