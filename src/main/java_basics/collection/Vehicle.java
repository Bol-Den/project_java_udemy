package java_basics.collection;

class Vehicle {

     private String model;
     private int releaseYear;
     private String color;
     private String fuelType;

    Vehicle(String model, int releaseYear, String color, String fuelType){
         this.model = model;
         this.releaseYear = releaseYear;
         this.color = color;
         this.fuelType = fuelType;
     }

     public String getModel() {
        return model;
     }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "[" +
                "model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ']';
    }

}
