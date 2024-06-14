package java_basics.methods;

class LearningMethods {
    public static void main(String[] args) {
        System.out.println("print statement");
        printSomething();

        LearningMethods learn = new LearningMethods();
        learn.printSomethingNew();
    }

    public static void printSomething(){
        System.out.println("Printing something");
    }

    private void printSomethingNew(){
        System.out.println("Printing something new");
    }

}
