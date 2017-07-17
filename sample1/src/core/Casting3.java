package core;

/**
 * Created by Sh-Java on 12/20/2016.
 */
public class Casting3 {



/*
    A float gives you approx. 6-7 decimal digits precision while a double gives you approx. 15-16. Also the range of numbers is larger for double.

    A double needs 8 bytes of storage space while a float needs just 4 bytes*/

    public void stringToInteger(){

        String s="27";
        int x=Integer.parseInt(s);
        System.out.println(x);
        if (x == (int)x)
        {
            System.out.println("conver string to integer and "+x+" is integer"); // Number is integer
        }

    }
     public void stringToDouble(){

        String s="27.32323233323232";
        double x=Double.parseDouble(s);

         if (x == (double) x)
         {
             System.out.println("conver string to double and "+x+" is double"); // Number is integer
         }

    }
    public void stringToFloat(){

        String s="22.3211";
        float x=Float.parseFloat(s);
        System.out.println(x);

        if (x == (float) x)
        {
            System.out.println("conver string to float and "+x+" is float"); // Number is integer
        }
    }

    public void floatToString(){

        float flt=23.256258f;
        String str=Float.toString(flt);
        if(str instanceof String )
        System.out.println("conver float  to string and "+str +" is instance of string");

    }




    public void stringToLong(){

        String s="27.3";
        long lng=Long.valueOf(s).longValue();

       // long lng=Long.parseLong(s);

    }
      public void longToString(){

        long s=65232002156232l;//long number end with 'l'
        String str=Long.toString(s);
          if(str instanceof String){

              System.out.println("it is instance of string");
          }
          else{
              System.out.println("it is not instance of string");
          }

       // long lng=Long.parseLong(s);

    }






}
