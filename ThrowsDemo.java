class Demo
{
    public int Division(int no1,int no2) throws ArithmeticException
    {
        int ians=0;

        ians=no1/no2;

        return ians;
    }
}

class ThrowsDemo
{
    public static void main(String a[])
    {
        Demo dobj=new Demo();

        int iret=0;
        
       try
       { 
          iret=dobj.Division(11,0);
       }

       catch(ArithmeticException aobj)
       {
          System.out.println("Inside Catch"+aobj);

       }

        System.out.println("Division is:"+iret);
          
    }
}