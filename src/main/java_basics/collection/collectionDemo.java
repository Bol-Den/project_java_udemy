package java_basics.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class collectionDemo {

    public static void main(String[] args) {

        List<String> word = new ArrayList<>();
        word.add("name");
        word.add("surname");
        word.add("10");

        System.out.println(word);

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(34);
        numbers.add(145);
        numbers.add(155);
        numbers.add(195);
        numbers.remove(2);

        for (Integer number:numbers){
            System.out.println(number);
        }

        System.out.println("Loop over linked list");
        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle toyota = new Vehicle("toyota", 2023, "black", "diesel");
        Vehicle ford = new Vehicle("ford", 2010, "red", "petrol");
        Vehicle honda = new Vehicle("honda", 1999, "green", "petrol");
        Vehicle opel = new Vehicle("opel", 2020, "grey", "diesel");

        vehicles.add(toyota);
        vehicles.add(ford);
        vehicles.add(honda);
        vehicles.add(opel);

        System.out.println("Iterate over list of Vehicles");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getModel() + " " + vehicle.getReleaseYear());
        }

        System.out.println(vehicles);

        getList(numbers);
        getList(vehicles);

    }

    public static void  getList(List list){
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}
