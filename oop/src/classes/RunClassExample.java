package classes;

import java.util.Scanner;

/**
 * Created by Sh-Java on 12/22/2016.
 */
public class RunClassExample {


    public static void main(String[] args) {

        RunClassExample run=new RunClassExample();

        Human boy=   run.getValue();
        boy.calculateBMI();
        boy.printAttributes();


    }
private Human getValue(){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter name: ");
       String name  = input.next();

    System.out.print("Enter age: ");
    int age  = input.nextInt();

    System.out.print("Enter height in cm: ");
    float height = input.nextFloat();


 System.out.print("Enter weight in kg: ");
    float weight = input.nextFloat();

    System.out.print("Enter Eye Color: ");
    String eyeColor  = input.next();


  System.out.print("Enter 1 if you boy,2 if you are girl: ");
    int gender  = input.nextInt();


   Human human1=new Human(name,age,height,weight,eyeColor,gender);//pass param in constructor

    System.out.println("use getter="+human1.getName());
/*
   Human human1=new Human();
    human1.setName(name);  // pass param in setter
    human1.setAge(age);
    human1.setHeight(height);
    human1.setWeight(weight);
    human1.setEyColor(eyeColor);*/


    return human1;





}

}
