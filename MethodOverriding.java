

// Superclass
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another Subclass
class Cat extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class TestOverride {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the sound method
        myAnimal.sound(); // Outputs: Animal makes a sound
        myDog.sound();    // Outputs: Dog barks
        myCat.sound();    // Outputs: Cat meows
    }
}
