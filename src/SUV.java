public class SUV extends Vehicle {
    //Unique attribute for SUV
    private boolean isFourWheelerDrive;

    public SUV(String make, String model, int year, boolean isFourWheelerDrive){
        super(make,model,year);
        this.isFourWheelerDrive = isFourWheelerDrive;
    }

    //Polymorphism : Override the parent's method
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Four-Wheeler Drive : "+ this.isFourWheelerDrive);
    }

    //Abstraction : provide a concrete implementation for the abstract method
    @Override
    public double calculateFuelEfficiency(){
        //A different calculation for an SUV
        return 20.0; // Eg. MPG
    }
}
