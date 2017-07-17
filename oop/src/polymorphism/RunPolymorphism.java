package polymorphism;

import sun.security.provider.SHA;

/**
 * Created by Sh-Java on 12/22/2016.
 */
public class RunPolymorphism {


    public static void main(String[] args) {

        Shape shape1=new Circle(10, 20, 30);
        shape1.draw();


        Shape shape2=new Rectangle(20, 30, 40, 50) ;
        shape2.draw();

    }





}
