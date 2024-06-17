package java_basics.zoo;

import java.util.Objects;

abstract class Animal {
    String name;

    String color;
    int age;
     Animal(String name, String color, int age){
         this.name = name;
         this.color = color;
         this.age = age;
     }

     public void eat(){
         System.out.println("I'm eating");
     }

     public void sleep(){
         System.out.println("I'm sleeping");
     }

     public void test(){
         System.out.println("this is Animal class");
     }

     public abstract void move();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }


}
