import java.util.*;

class ExceptionDemo10
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int arr[]={10,20,30,40,50};
        int iIndex=0, iData=0; 

        System.out.println("Enter the index no:");
        iIndex=sobj.nextInt();

        try
        {
            System.out.println("Inside try");
            iData=arr[iIndex];
        } 

        catch(Exception eobj)
        {
            System.out.println("Inside catch");
            System.out.println(eobj);
        }

        finally
        {
            System.out.println("Inside Finally");

        }

        System.out.println("Element at this index is:"+iData);


    }
}