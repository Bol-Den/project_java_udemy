package java_basics.zoo;

public class Sparrow extends Bird{

    Sparrow(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void move() {
        System.out.println("Sparrow is moving now");
    }

}
