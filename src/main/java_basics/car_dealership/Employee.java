package java_basics.car_dealership;

class Employee {

     void handleCustomer(Customer customer,
                         Vehicle vehicle,
                         boolean finance) {
        if (finance) {
             double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
             runCreditHistory(customer, loanAmount);
        } else if (vehicle.getPrice() < customer.getCashOnHand()) {
             // customer pays in cash
             processTransaction(customer, vehicle);
        } else {
             System.out.println("Customer need more money to purchase " + vehicle.getModel());
        }
     }


     void runCreditHistory(Customer customer, double loan) {
          System.out.println("Run credit history for Customer - " + customer.getName());
          System.out.println("Customer has been approved to purchase a car");
     }


     void processTransaction(Customer customer, Vehicle vehicle){
          System.out.println("Customer " + customer.getName()
                               + " has purchase a " + vehicle );
     }

}
