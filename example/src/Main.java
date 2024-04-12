public class Main {
    public static void main(String[] args) {
        AnimalManager manager = new AnimalManager();
        
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();
        
        manager.displayAnimalDetails(dog);
        manager.displayAnimalDetails(cat);
        manager.displayAnimalDetails(bird);
        
        // Testing invalid animal name exception
        Animal invalidAnimal = new Animal() {
            @Override
            public String makeSound() {
                return null;
            }

            @Override
            public String getInfo() throws InvalidAnimalException {
                if (true) {
                    throw new InvalidAnimalException("Invalid animal name");
                }
                return null;
            }
        };
        
        manager.displayAnimalDetails(invalidAnimal);
    }
}

class InvalidAnimalException extends Exception {
    public InvalidAnimalException(String message) {
        super(message);
    }
}

interface Flyable {
    String fly();
}

abstract class Animal {
    public abstract String makeSound();
    
    public void sleep() {
        System.out.println("Zzz...");
    }
    
    public abstract String getInfo() throws InvalidAnimalException;
}

class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof!";
    }
    
    @Override
    public String getInfo() throws InvalidAnimalException {
        return "Dog: A domesticated carnivorous mammal.";
    }
}

class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow!";
    }
    
    @Override
    public String getInfo() throws InvalidAnimalException {
        return "Cat: A small domesticated carnivorous mammal.";
    }
}

class Bird extends Animal implements Flyable {
    @Override
    public String makeSound() {
        return "Chirp!";
    }
    
    @Override
    public String getInfo() throws InvalidAnimalException {
        return "Bird: A warm-blooded vertebrate distinguished by feathers.";
    }
    
    @Override
    public String fly() {
        return "The bird is flying.";
    }
}

class AnimalManager {
    public void displayAnimalDetails(Animal animal) {
        System.out.println("Sound: " + animal.makeSound());
        animal.sleep();
        if (animal instanceof Flyable) {
            System.out.println(((Flyable) animal).fly());
        }
        try {
            System.out.println("Info: " + animal.getInfo());
        } catch (InvalidAnimalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
