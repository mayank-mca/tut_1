package OOPS;

import INHERITANCE.dog;

public class demo1 {

    public static void main(String[] args) {

        //now we are creating the object of student class alias (OOPS)


        OOPS s1;
        OOPS s2;
        OOPS s3;
        s1 = new OOPS(); 


        s1.StudentId=1;
        s1.StudentName="jerry";
        s1.StudentCity="Hamirpur";
        s1.study();
        s1.details();


        s2 = new OOPS(21);


        s2.StudentId=14;
        s2.StudentName="champ";
        s2.StudentCity="Chitrkoot";


        s2.study();
        s2.details();

        // details without using the object input using with the constructor
        System.out.println("this would be use as the detail fill automatic");
        s3= new OOPS(751,"mudit","delhi");

        s3.study();
        s3.details();

        System.out.println("student id is ");
        // method overloading
        s3.study(751);

        System.out.println("useing of this keyword");
        OOPS s4;
        s4=new OOPS();
        s4.details();



        // inheritance concept

        dog d1= new dog();

        d1.eating();
        System.out.println(d1.color);


    }


}
