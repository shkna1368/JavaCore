package classes;

/**
 * Created by Sh-Java on 12/22/2016.
 */
public class Human {
//Attributes ,field
  private String name;
     private int  age;
    private float height;// in cm
    private float   weight; // in kg
    private String eyColor;
    private int gender;


    public Human(String name, int age, float height, float weight, String eyColor, int gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyColor = eyColor;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getEyColor() {
        return eyColor;
    }

    public void setEyColor(String eyColor) {
        this.eyColor = eyColor;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void calculateBMI(){
        System.out.println('\n'+"----------------------------------------------");

        double heightInMeter=height/100;
        double   bmi = ( weight / (heightInMeter * heightInMeter)) ;



        if (bmi < 16)
            System.out.println("You are seriously underweight");
        else if (bmi < 18)
            System.out.println("You are underweight");
        else if (bmi < 24)
            System.out.println("You are normal weight");
        else if (bmi < 29)
            System.out.println("You are overweight");
        else if (bmi < 35)
            System.out.println("You are seriously overweight");
        else
            System.out.println("You are gravely overweight");


        System.out.println('\n'+"----------------------------------------------");

   }
   public void printAttributes(){

       //weight in kg
       //height in m


       System.out.println('\n'+"name="+name+'\n'+"age="+age+'\n'+"height="+height+'\n'+"weight="+weight+'\n'+"Eye Color="+eyColor+

       '\n'+"Gender="+gender);






    }




}
