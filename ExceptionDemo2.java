import java.util.*;

class ExceptionDemo2
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int ino1=0, ino2=0;
        float fans=0;

        System.out.println("Enter First No:");
        ino1=sobj.nextInt();

        System.out.println("Enter Second No:");
        ino2=sobj.nextInt();

        fans= (float)ino1/(float)ino2;

        System.out.println("Division is:"+fans);


    }
}