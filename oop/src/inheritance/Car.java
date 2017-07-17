package inheritance;

/**
 * Created by Sh-Java on 12/22/2016.
 */
class Car extends Vehicle {
    private int numWheels;

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    Car(String make, String model, int year, int numWheels) {
        super(make, model, year);
        this.numWheels = numWheels;
    }

    void describe() {
        System.out.print("This car is a "); // Print without newline – see Chapter 1.
        super.describe();
    }
}