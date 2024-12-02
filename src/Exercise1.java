import Animal.*;

public class Exercise1 {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal a1 = animalFactory.getAnimal("Dog");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = animalFactory.getAnimal("Cat");
        System.out.println("a2 sound: " + a2.makeSound());
    }
}
