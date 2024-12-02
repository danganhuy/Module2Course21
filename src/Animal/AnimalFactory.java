package Animal;

public class AnimalFactory {
    public Animal getAnimal(String animalType) {
        switch (animalType) {
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
            default:
                return null;
        }
    }
}
