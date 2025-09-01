public class Sedan extends Vehicle {
    //Unique attribute for Sedan
    private int numberOfDoors;

    public Sedan(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Sedan(String make, String model,int year, int numberOfDoors) {
        //Inheritance : Call the constructor of the parent class
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    //Polymorphism : Override the parent's method to add unique details
    @Override
    public void displayDetails(){
        super.displayDetails();//Call the parent's displayDetails() method
        System.out.println("Number of doors : "+this.numberOfDoors);
    }

    //Abstraction : provide a concrete implementation for the abstract method
    @Override
    public double calculateFuelEfficiency(){
        //A simple calculation for a sedan
        return 30.5;
    }
}
