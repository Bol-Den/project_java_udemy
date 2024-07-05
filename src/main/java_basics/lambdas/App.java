package java_basics.lambdas;

public class App {

    public static void main(String[] args) {

        Human human = new Human();
        Robot robot = new Robot();

        walking(human);
        walking(robot);

        //// lambda
        Walkable firstLambda = () -> System.out.println("Walking and running");
        walking(() -> System.out.println("Walking and running"));

        walking(firstLambda);

    }

    public static void walking(Walkable walkable){
        walkable.walk();
    }

}
