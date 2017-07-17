package core;

/**
 * Created by Sh-Java on 12/20/2016.
 */
public class Loop2 {

   public int[] intary = { 1,2,3,4};  // variable
    public void forSample( int from ,int to){

        for (int i=from ;i<to ;i++){

            if(i /2==0){

                System.out.println(i +"is even");
            }
            else {
                System.out.println(i +"is Odd");

            }


        }
    }


    public void whileSample(int number ){

        int x = 10;

        while( x < number ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }
    }
 public void forEachSample( ){

     System.out.println("Display an array using for each loop");
     for (int a  : intary) {
         System.out.print(a+ " ");
     }
    }


}
