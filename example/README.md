# Animal Kingdom Simulator

This program simulates an animal kingdom using object-oriented programming concepts such as abstract classes, interfaces, inheritance, polymorphism, and exception handling.

## Features

- Abstract class `Animal` with methods for making sound, sleeping, and getting information about the animal.
- Concrete subclasses `Dog`, `Cat`, and `Bird` extending `Animal`.
- Interface `Flyable` with a method for flying.
- Implementation of `Flyable` interface in the `Bird` class.
- `AnimalManager` class to display details of animals, including their sound, sleep, flight (if applicable), and information.
- Custom exception `InvalidAnimalException` to handle invalid animal names.

## How to Run

1. Ensure you have Java installed on your system.
2. Clone this repository or download the `Main.java` file.
3. Compile the `Main.java` file using the following command:
4. Run the compiled program using the following command:
5. The program will execute and display details of different animals, demonstrating polymorphism and exception handling.

## Adding New Animals

To add new animals to the simulation:

1. Create a new class extending `Animal`.
2. Implement the abstract methods `makeSound()` and `getInfo()`.
3. Optionally, implement the `Flyable` interface if the animal can fly.
4. Ensure the new class is handled correctly in the `AnimalManager` class.

## Customizing

Feel free to customize the program by adding new features, modifying existing ones, or improving the user interface. This program serves as a foundation for simulating an animal kingdom and can be expanded upon based on your requirements.

## Author

This program was created by [Your Name]. Feel free to contact me with any questions or suggestions.
