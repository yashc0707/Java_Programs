import java.util.*;

class ExceptionDemo4
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int ino1=0, ino2=0,ians=0;

        System.out.println("Enter First No:");
        ino1=sobj.nextInt();

        System.out.println("Enter Second No:");
        ino2=sobj.nextInt();

        try
        {
            System.out.println("Inside try Block");
            ians= ino1/ino2;
        }

        catch(ArithmeticException aobj)
        {
            System.out.println("Inside catch Block");
            System.out.println(aobj);

        }

        System.out.println("Division is:"+ians);


    }
}