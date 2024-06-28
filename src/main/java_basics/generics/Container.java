package java_basics.generics;

class Container<S,I> {

    S item1;
    I item2;

    Container(S item1, I item2){
        this.item1 = item1;
        this.item2 = item2;
    }

    public S getItem1() {
        return item1;
    }

    public I getItem2() {
        return item2;
    }

    void printItems(){
        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);
    }

}
