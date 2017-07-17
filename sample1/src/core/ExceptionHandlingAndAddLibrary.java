package core;


import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * Created by Sh-Java on 12/20/2016.
 */
public class ExceptionHandlingAndAddLibrary {
    //samples contains add library and exception handling



    public void getStaticsOfArray (){

        double [] inputArray={230.7, 458,23.787,22.008,452,6.2,235.7, 488,23.787,235.008,482,6.2};
        DescriptiveStatistics stats = new DescriptiveStatistics();

// Add the data from the array
        for( int i = 0; i < inputArray.length; i++) {
            stats.addValue(inputArray[i]);
        }

// Compute some statistics
        double mean = stats.getMean();
        System.out.println("mean="+mean);
        double std = stats.getStandardDeviation();
        System.out.println("std="+std);
        double median = stats.getPercentile(50);
        System.out.println("median"+median);
        System.out.printf("max\t%f\n", stats.getMax());
        System.out.printf("min\t%f\n", stats.getMin());

    }




public void getException(){

   try {
     int x=  1/0;
   }
   catch (Exception ex){

       ex.toString();
       System.out.println("in catch state");
   }
}


}
