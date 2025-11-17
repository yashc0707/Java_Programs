abstract class Base
{
    public int i,j;

    public int Addition(int a,int b)
    {
        return a+b;
    }

    abstract public int Substarction(int a,int b);

}

class Derived extends Base 
{
    public int x;

    public int Substarction(int a,int b)
    {
        return a-b;
    }

    public int Multiplication(int a,int b)
    {
        return a*b;
    }
    

}


class AbstractDemo2
{
    public static void main(String A[])
    {
        Base bp=new Derived();  //Upcasting

        int iret=0;

        iret=bp.Addition(11,10); //21

        System.out.println(iret);

        iret=bp.Substarction(11,10); //1 

        System.out.println(iret);

        // iret=bp.Multiplication(11,10);  Error
       

    }
    
}