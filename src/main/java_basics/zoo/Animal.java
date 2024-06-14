package java_basics.zoo;

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



}
