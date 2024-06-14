package java_basics.zoo;

class ZooApp {

    public static void main(String[] args) {
        Fish fish = new Fish("Mermaid", "gold", 10, 25);
        Bird bird = new Bird("Sparrow", "brown", 5);
        Sparrow sparrow = new Sparrow("First Sparrow", "gold", 51);
        AnimalMove animalMove = new AnimalMove();

//        fish.move();
//        fish.getSize();
//        bird.move();
//        animalMove.getAnimalMove(fish);
//        animalMove.getAnimalMove(bird);

//        bird.test();
//        sparrow.test();
        animalMove.getAnimalMove(fish);
        animalMove.getAnimalMove(bird);
        animalMove.getAnimalMove(sparrow);

    }


}
