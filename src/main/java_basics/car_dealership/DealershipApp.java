package java_basics.car_dealership;

class DealershipApp {

    public static void main(String[] args) {

       Vehicle audi = new Vehicle("Audi TT", "white", 100000);
       Vehicle bmw = new Vehicle("Audi TT", "white", 100000);

       Customer denis = new Customer("Denis", "Alicante",500000);
       Employee employee = new Employee();

//       denis.carPurchase(audi, employee, false);

        boolean test = audi.equals(bmw);
        System.out.println(test);

    }
}
