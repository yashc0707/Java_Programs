class Demo
{
    public int i;                   // Instance variable
    static public int j;           // Class variable

    static  //Static Block
    {
        System.out.println("Inside static block");
        j = 21;
    }
     // Initializer Block (Common For all)
    {
        System.out.println("Inside initializer block");
    }

    public Demo() //Default Constructor 
    {
        System.out.println("Inside constructor");
        this.i = 11;
    }

    public Demo(int a) //Parametrized Constructor 
    {
        System.out.println("Inside parametrised constructor");
        this.i = a;
    }
}

class BlocksX
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
        Demo dobj4 = new Demo(11);
    }
}