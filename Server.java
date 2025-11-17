import java.util.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

class Server
{
    public static void main(String a[]) throws Exception
    {
       System.out.println("Server is Running"); 
       ServerSocket ssobj=new ServerSocket(2100);//Port Number
       System.out.println("Server is waiting at port number 2100"); 
       Socket sobj=ssobj.accept();
       System.out.println("Client Request arrives and accepted by server"); 

       DataInputStream diobj=new DataInputStream(sobj.getInputStream());
       DataOutputStream doobj=new DataOutputStream(sobj.getOutputStream());

        // int num1=0,num2=0;

        // num1=diobj.readInt();
        // num2=diobj.readInt();

        // int sum = num1+num2;

        // doobj.writeInt(sum);


        sobj.close();
        ssobj.close();
        System.out.println("Server application Terminated");
    }
}