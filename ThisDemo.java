class Demo
{
    public int i;
    public static int j;
    
    static
    {
        j=21;
    }

    public Demo()
    {
       
        System.out.println("Inside Default Constructor");
         this.i=11; //1st Use

    }

    public Demo(int a)
    {
        this();  //Second use ,It calls Default Constructor or this()used to access another constructor
        System.out.println("Inside Parameterized Constructor");
    }

    public void Display()
    {
        System.out.println("Inside Display:"+this.i); //Third use

    }

}

class ThisDemo
{
    public static void main(String A[])
    {

        Demo dobj=new Demo(11);

        dobj.Display();                                                                     

    }
}