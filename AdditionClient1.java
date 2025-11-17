import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient1
{
    public static void main(String a[]) throws Exception
    {
       System.out.println("Client is Running"); 


       Socket sobj=new Socket("localhost",2100);
       System.out.println("Server Succesfully Connected");
    }
}