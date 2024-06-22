package java_basics.inheritance;

abstract class Animal {

    private String animal;
    private String color;
    private int age;

    Animal(String name, String color, int age){
        this.animal = name;
        this.color = color;
        this.age = age;
    }

    String getAnimal(){
        return this.animal;
    }

    String getColor(){
        return this.color;
    }

    int getAge(){
        return this.age;
    }

    void setAge(int age) {
        this.age = age;
    }

    abstract void eat() ;

    abstract void sleep();

}
