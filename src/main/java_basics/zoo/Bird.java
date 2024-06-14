package java_basics.zoo;

class Bird extends Animal {

    Bird(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void test() {
        System.out.println("this is Bird class");
    }

    @Override
    public void move(){
        System.out.println("Bird is moving now");
    }


}
