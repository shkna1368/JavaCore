import core.*;

/*
Classes
        Fields
        Methods
        override-overload
        switch
*/

public class MainClass {


    public static void main(String[] args) {


        //class field,method,ovreload
/*     MainClass mainClass=new MainClass();

        mainClass.callSwitch();
        mainClass.callSwitch('B');

        Switch1.getAge(22);  //static method*/

//////////////////////////////////////////////////////////////////
        // loop sample
     /*   Loop2 loop2=new Loop2();
        loop2.forSample(1,20);
        loop2.whileSample(20);
        loop2.forEachSample();
      // loop2.intary;// can not access private class;*/
///////////////////////////////////////////////////////
//casting sample
       /* Casting3 cast=new Casting3();
        cast.stringToInteger();
        cast.stringToFloat();
        cast.stringToDouble();
       cast.floatToString();*/


        ////////////////////////
        //add library and exception handling

   /*     ExceptionHandlingAndAddLibrary handle=new ExceptionHandlingAndAddLibrary();
        handle.getStaticsOfArray();
handle.getException();*/



        //////////////////////////////
      //  List & Hashmap

        ListHashMapSample sample=new ListHashMapSample();
        sample.fillList();
        sample.printStudentList();
        sample.printStudentsHashMap();
        sample.getStudentWithId(600);





    }

    private void callSwitch(){
        Switch1 sw1=new Switch1();
        sw1.grading('A');
        sw1.grading('C');
        sw1.grading('E');
        sw1.grading('G');

    }

    private void callSwitch(char charachter){
        Switch1 sw1=new Switch1();
        sw1.grading(charachter);


    }


}
