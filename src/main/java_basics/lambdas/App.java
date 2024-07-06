package java_basics.lambdas;

public class App {

    public static void main(String[] args) {

        Human human = new Human();
        Robot robot = new Robot();

        walking(human);
        walking(robot);

        //// lambda
        LambdaFunctionalInterface firstLambda = () -> System.out.println("Walking and running");
        walking(() -> System.out.println("Walking and running"));
        walking(firstLambda);

        SumFunctionalInterface sumVal = (arg1, arg2) -> arg1 + arg2;
        System.out.println(sumVal.compute(5,7));


    }

    public static void walking(Walkable walkable){
        walkable.walk();
    }

    public static int sumValue(int arg1, int arg2){
        return arg1+arg2;
    }

}
