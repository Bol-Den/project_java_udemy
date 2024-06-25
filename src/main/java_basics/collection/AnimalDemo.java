package java_basics.collection;

import java.util.HashSet;
import java.util.Set;

class AnimalDemo {

    public static void main(String[] args) {

        HashSet<Animal> animals = new HashSet<>();

        Animal animal1 = new Animal("wolf",45);
        Animal animal2 = new Animal("turtle", 876);
        Animal animal3 = new Animal("wolf", 45);
        Animal animal4 = new Animal("parrot", 99);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println(animal1.equals(animal3));

    }
}
