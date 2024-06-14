package java_basics.zoo;

class Fish extends Animal {

    private int size;

    Fish(String name, String color, int age, int size) {
        super(name, color, age);
        this.size = size;
    }

    int getSize(){
        return size;
    }

    @Override
    public void move(){
        System.out.println("Fish is moving now");
    }


}
