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

        this(879,"akhil","banda");
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

    public void study(){
        System.out.println(StudentName + "  is studying");

    }

    // method overloading

    public void study(float f)
    {

        System.out.println("methods overloading with same method name but different parameter and data type");
        System.out.println(StudentId+ " is in college");
        //this function is used to fecth the deatil to the existing class
        System.out.println(this.StudentCity);
    }



    /*this keyword functionallty refer to the current invokeing

        for calling current class constuctor from inside different construtor of same class
*/




    public  void details()
    {
        System.out.println("My Name is "+StudentName);

        System.out.println("My student id "+StudentId);
        System.out.println("My student city  "+StudentCity);




    }




}