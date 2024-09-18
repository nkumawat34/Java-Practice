// Abstract class Animal
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void walk();
}

// Subclass (inheriting from Animal)
class Dog extends Animal {
    // Providing implementation for the abstract method walk()
    @Override
    void walk() {
        System.out.println("The dog walks on four legs.");
    }
}

// Another subclass (inheriting from Animal)
class Bird extends Animal {
    // Providing implementation for the abstract method walk()
    @Override
    void walk() {
        System.out.println("The bird hops on two legs.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // You cannot instantiate the Animal class because it's abstract
        // Animal animal = new Animal(); // This will cause an error

        // Creating objects of the concrete subclasses
        Animal dog = new Dog();
        Animal bird = new Bird();

        // Calling the walk method on both objects
        dog.walk();
        bird.walk();
    }
}
