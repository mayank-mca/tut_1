package OOPS;

public class OOPS
{

    int StudentId;
    String StudentName;
    String StudentCity;

    //BEHAVIOURS function

    public void study(){
        System.out.println(StudentName+"is studying");

    }

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





    public  void details()
    {
        System.out.println("My Name is "+StudentName);

        System.out.println("My student id "+StudentId);
        System.out.println("My student city  "+StudentCity);




    }




}
