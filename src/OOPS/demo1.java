package OOPS;

public class demo1 {

    public static void main(String[] args) {

        //now we are creating the object of student class alias (OOPS)


        OOPS s1;
        OOPS s2;
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









    }




}
