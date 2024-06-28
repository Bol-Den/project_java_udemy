package java_basics.inheritance;

class Bird extends Animal {

    private String mood;

    Bird(String animal, String color, int age, String mood) {
        super(animal, color, age);
        this.mood = mood;
    }

    String getMood(){
        return this.mood;
    }

    void increaseAgeBy5() {
        int newAge = age + 5;
//        age = newAge;
        setAge(newAge);
    }

    @Override
    void eat(){
        System.out.println(getAnimal() + " can eat proper food");
    }

    @Override
    void sleep(){
        System.out.println(getAnimal() + " can sleep well");
    }

}
