package inheritance;

/**
 * Created by Sh-Java on 12/22/2016.
 */
public class RunInheritance {
    public static void main(String[] args) {



        Car car = new Car("Ford", "Fiesta", 2009, 4);
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel ());
        System.out.println("Year = " + car.getYear ());
// Normally, you cannot access a private field via an object
// reference. However, numWheels is being accessed from
// within a method (main()) that is part of the Car class.
        System.out.println("Number of wheels = "+car.getNumWheels());
    }
}
