package java_basics.car_dealership;

//import java.util.Objects;

class Vehicle {

    private String model;
    private String color;
    private double price;

    Vehicle(String model, String color, double price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Vehicle vehicle = (Vehicle) o;
//        return Double.compare(price, vehicle.price) == 0 && Objects.equals(model, vehicle.model) && Objects.equals(color, vehicle.color);
//    }


    @Override
    public String toString() {
        return "Vehicle [model: " + model + ", color: " + color + ", price: " + price +"]";
    }
}
