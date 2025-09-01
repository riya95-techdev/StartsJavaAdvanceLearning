public class CarDealership {
    public static void main(String[] args) {

        //create a Sedan Object
        Sedan mySedan = new Sedan("Honda","Accord",2022,4);

        System.out.println("---Sedan Details---");
        mySedan.displayDetails(); //Polymorphism in action
        System.out.println("Fuel Efficiency (MPG) : "+mySedan.calculateFuelEfficiency());
        System.out.println(); //Adds a blank line for redability

        //Create an SUV object
        SUV mySUV = new SUV("Ford", "Explorer",2023, true);

        System.out.println("---SUV Details---");
        mySUV.displayDetails();
        System.out.println("Fuel Efficiency (MPG) : "+mySUV.calculateFuelEfficiency());


    }
}
