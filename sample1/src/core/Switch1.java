package core;

/**
 * Created by Sh-Java on 12/20/2016.
 */
public class Switch1 {
    public  void grading(char grade) {

        int success;

        switch (grade) {

            case 'A':

                System.out.println("Excellent grade");

                success = 1;

                break;

            case 'B':

                System.out.println("Very good grade");

                success = 1;

                break;

            case 'C':

                System.out.println("Good grade");

                success = 1;

                break;

            case 'D':

            case 'E':

            case 'F':

                System.out.println("Low grade");

                success = 0;

                break;

            default:

                System.out.println("Invalid grade");

                success = -1;

                break;

        }


        passTheCourse(success);

    }
    public  void passTheCourse(int success) {

        switch (success) {

            case -1:

                System.out.println("No result");

                break;

            case 0:

                System.out.println("Final result: Fail");

                break;

            case 1:

                System.out.println("Final result: Success");

                break;

            default:

                System.out.println("Unknown result");

                break;

        }



    }
    public static void getAge(int age){
        switch (age) {

            case 10:

                System.out.println("You are kids");

                break;

            case 17:

                System.out.println("You are Teenager");

                break;

            case 22:

                System.out.println("You are Young");

                break;

    }
    }
}
