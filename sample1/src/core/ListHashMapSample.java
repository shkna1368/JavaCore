package core;

import java.util.*;

/**
 * Created by Sh-Java on 12/23/2016.
 */
public class ListHashMapSample {


    List<Student> studentList;
    HashMap<Integer,Student> studentHashMap;

    public void fillList(){


       Student st1=new Student();

        st1.setId(100);
        st1.setName("mohamad");


        Student st2=new Student();
        st2.setId(170);
        st2.setName("hawraz");

          Student st3=new Student();
        st3.setId(600);
        st3.setName("hiro");

          Student st4=new Student();
        st4.setId(620);
        st4.setName("ribwar");



        studentList=new ArrayList<Student>();

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);



        studentHashMap=new HashMap<Integer, Student>();
studentHashMap.put(st1.getId(),st1);
studentHashMap.put(st2.getId(),st2);
studentHashMap.put(st3.getId(),st3);
studentHashMap.put(st4.getId(),st4);




    }


    public void printStudentList(){
        System.out.println("---------in print list-----------");
        for(Student st:studentList){

            System.out.println(st.toString());
        }

    }

    public void printStudentsHashMap(){
        System.out.println("--------- in printStudentsHashMap-----------");
        Iterator it = studentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();

          int key= (Integer) pair.getKey();
            Student st= (Student) pair.getValue();

            System.out.println(key + " ----->" +st );
        }
    }



     public void getStudentWithId(int id){
        System.out.println("---------in filter map-----------");
         Student st=studentHashMap.get(id);
         System.out.println("name="+st.getName());


    }





}
