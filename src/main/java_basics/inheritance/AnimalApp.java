package java_basics.inheritance;

class AnimalApp {

    public static void main(String[] args) {

        Bird bird = new Bird("Parrot", "red", 55, "intelligent");

        bird.increaseAgeBy5();
        bird.increaseAgeBy5();

        System.out.println(bird.getAge());

        bird.eat();
        bird.sleep();

    }

}
