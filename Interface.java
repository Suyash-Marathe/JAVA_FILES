
// Define the interface
interface Animal {
    void makeSound(); // Abstract method

    void eat(); // Abstract method
}

// Implement the interface in the Dog class
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void eat() {
        System.out.println("The dog is eating.");
    }
}

// Main class to demonstrate the interface
public class Interface {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Polymorphism with the interface

        dog.makeSound();
        dog.eat();

    }
}
