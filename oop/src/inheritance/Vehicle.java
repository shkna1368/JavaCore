package inheritance;

/**
 * Created by Sh-Java on 12/22/2016.
 */
public class Vehicle {


        private String make;
        private String model;
        private int year;
        Vehicle(String make, String model, int year)
        {
            this.make = make;
            this.model = model;
            this.year = year;
        }
        String getMake()
        {
            return make;
        }
        String getModel()
        {
            return model;
        }
        int getYear()
        {
            return year;
        }
        void describe()
        {
            System.out.println(year + " " + make + " " + model);
        }
}
