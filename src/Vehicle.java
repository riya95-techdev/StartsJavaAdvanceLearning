public abstract class Vehicle {
    //Encapsulation : Private attributes
    private String make;
    private String model;
    private int year;

    //non-argument constructor

    public Vehicle() {}

    //all argument Constructor

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    //Encapsulation : Public getter and setter methods

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Abstraction : An abstract method that must be implemented by subclass
    public abstract double calculateFuelEfficiency();

    //Polymorphism : A common method to be overridden
    public void displayDetails(){
        System.out.println("Make : "+ this.make);
        System.out.println("Model : "+ this.model);
        System.out.println("Year : "+ this.year);
    }
}
