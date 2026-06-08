// Parent class
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the makeSound() method
    @Override
    void makeSound() {
        System.out.println("Woof Woof!");
    }
}

// Main class
public class OverrideExample {
    public static void main(String[] args) {
        Animal a = new Animal();  // Parent reference, Parent object
        a.makeSound();            // Output: Some generic animal sound

        Dog d = new Dog();        // Child reference, Child object
        d.makeSound();            // Output: Woof Woof!

        // Parent reference, but Child object (Runtime Polymorphism)
        Animal obj = new Dog();
        obj.makeSound();          // Output: Woof Woof!
    }
}