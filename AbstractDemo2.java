abstract class Base
{
    public int i,j;

    public int Addition(int a,int b)
    {
        return a+b;
    }

    abstract public int Substarction(int a,int b);

}

class Derived extends Base  //Error
{
    public int x;

}


class AbstractDemo2
{
    public static void main(String A[])
    {
        Base bp=new Base(); //Error
       

    }
}