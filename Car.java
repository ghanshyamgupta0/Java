class Vehicle{
    String type;

    // Constructor
    public Vehicle(String type){
        this.type = type;
    }

    // Method
    public void vehicleType(){
        System.out.println(type+" is the type of the vehicle");
    }
}

class Car extends Vehicle{
    String brand;

    // Constructor
    public Car(String type, String brand){
        super(type);    //super keyword calls the type of vehicle
        this.brand = brand;
    }

    // Methods
    public void displayDetails(){
        super.vehicleType();
        System.out.println(brand+ " is the brand of the car");
    }

    // Min function
    public static void main(String[] args){
        Car obj = new Car("Truck", "Mahindra");
        obj.displayDetails();

    }
}