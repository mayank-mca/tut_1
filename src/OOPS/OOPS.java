package OOPS;

public class OOPS
{

    int StudentId;
    String StudentName;
    String StudentCity;



    // this method is called constuctor overloading
    // we just have to create a default constuctor with their class name like OOPS()


    // this is non parameter default constuctor
    public OOPS()
    {
        System.out.println("this is the non parameter constructor");
    }

    // constuctor with a parameter


    public OOPS( int s1)
    {
        System.out.println("parameterized constructor : with a single argument");
    }

    //constructor with their three parameter

    public OOPS(int i , String n,String c)
    {

        StudentId = i;
        StudentName=n;
        StudentCity=c;


    }

//BEHAVIOURS function
    // method overloading

    public void study(){
        System.out.println(StudentName + "  is studying");

    }

    public  void details()
    {
        System.out.println("My Name is "+StudentName);

        System.out.println("My student id "+StudentId);
        System.out.println("My student city  "+StudentCity);




    }




}
