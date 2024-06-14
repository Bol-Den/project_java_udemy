package java_basics.car_dealership;

class Customer {

    private String name;
    private String address;
    private double cashOnHand;


    Customer(String name, String address, double cashOnHand){
        this.name = name;
        this.address = address;
        this.cashOnHand = cashOnHand;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }


    void carPurchase(Vehicle vehicle, Employee employee, boolean finance){
        //// this - points to current Customer
        employee.handleCustomer(this, vehicle, finance);
    }



}
