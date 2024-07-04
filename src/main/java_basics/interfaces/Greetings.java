package java_basics.interfaces;

public class Greetings implements HelloAndBye {

    @Override
    public void sayingHelloAndBye() {
        System.out.println(sayingHello());
        System.out.println(sayingBye());
    }

    @Override
    public String sayingHello() {
        return "Hello!!!";
    }

    @Override
    public String sayingBye() {
        return "Bye Bye!!!";
    }

}
