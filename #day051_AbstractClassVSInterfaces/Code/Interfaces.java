// Interface
interface Animal {
    void sound(); // Abstract method
    void eat();   // Abstract method
}

// Implementing Class
class Cat implements Animal {
    public void sound() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("This cat eats fish.");
    }
}

// Main Class
public class Interfaces {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound(); // Output: Meow!
        cat.eat();   // Output: This cat eats fish.
    }
}