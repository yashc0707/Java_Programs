import java.util.*;

class ExceptionDemo9
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int arr[]={10,20,30,40,50};
        int iIndex=0, iData=0; 

        System.out.println("Enter the index no:");
        iIndex=sobj.nextInt();

        iData=arr[iIndex];  //Exception Prone Code

        System.out.println("Element at this index is:"+iData);


    }
}