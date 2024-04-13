abstract class Animal {
    //An abstract method `makeSound()` that returns a `String`.
    public abstract String makeSound();
    
    //A concrete method `sleep()` that prints "Zzz...".
    public void sleep() {
        System.out.println("Zzz...");
    }
    //An abstract method `getinfo()` that returns a `String` with information about the animal.
    public abstract String getinfo();
}

//A class `Dog` that extends the `Animal` class.
class Dog extends Animal {
    // method overriding of makeSound() that returns 'Woof!'
    @Override
    public String makeSound() {
        return "Woof!";
    }

    // method overriding of getinfo() that returns 'Dog'
    @Override
    public String getinfo() {
        return "Dog";
    }

    // note : sleep() method is a concrete method in Animal class, so no need to re-implement.
}

// A class `Cat` that extends the `Animal` class.
class Cat extends Animal {
    // method overriding of makeSound() that returns 'Meow!'
    @Override
    public String makeSound() {
        return "Meow!";
    }

    // method overriding of getinfo() that returns 'Cat'
    @Override
    public String getinfo() {
        return "Cat";
    }

    // note : sleep() method is a concrete method in Animal class, so no need to re-implement.
}

// A class `fish` that extends the `Animal` class and implements the `Flyable` interface.
class Fish extends Animal implements Flyable{
    // method overriding of makeSound() that returns 'Glug Glug!'
    @Override
    public String makeSound() {
        return "Glug Glug!";
    }

    // method overriding of getinfo() that returns 'Fish'
    @Override
    public String getinfo() {
        return "Fish";
    }

    // method overriding of fly() that returns 'Fish can't fly'
    @Override
    public String fly() {
        return "Fish can't fly";
    }

    // note : sleep() method is a concrete method in Animal class, so no need to re-implement.    
}

// An interface called `Flyable` with a method `fly()` that returns a `String`.
interface Flyable {
    public String fly();
}


class AnimalManager {
    public void displayAnimalDetails(Animal animal) {
        System.out.println("Animal : " + animal.getinfo());
        System.out.println("Sound : " + animal.makeSound());
        System.out.println("Fly : " + (animal instanceof Flyable ? ((Flyable) animal).fly() : "Can't fly"));
        animal.sleep();
    }
}

public class farm {
    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        animalManager.displayAnimalDetails(new Dog());
        animalManager.displayAnimalDetails(new Cat());
        animalManager.displayAnimalDetails(new Fish());
    }

    
}

