import java.util.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

class Client
{
    public static void main(String a[]) throws Exception
    {
       System.out.println("Client is Running"); 


       Socket sobj=new Socket("localhost",2100);
       System.out.println("Server Succesfully Connected");

       DataInputStream diobj=new DataInputStream(sobj.getInputStream());
       DataOutputStream doobj=new DataOutputStream(sobj.getOutputStream());

       JFrame fobj=new JFrame("Client Window");
    
       JLabel Number1=new JLabel("Number 1");
       Number1.setBounds(50,100,100,30);

       JTextField tobj1=new JTextField();
       tobj1.setBounds(150,100,100,30);

       JLabel Number2=new JLabel("Number 2");
       Number2.setBounds(50,200,100,30);

       JTextField tobj2=new JTextField();
       tobj2.setBounds(150,300,100,30);

       JButton bobj=new JButton("Submit");
       bobj.setBounds(150,200,100,50);

       JLabel Resultlabel=new JLabel();
       Number1.setBounds(200,150,100,30);

       fobj.add(Number1);
       fobj.add(Number2);
       fobj.add(bobj);
       fobj.add(tobj1);
       fobj.add(tobj2);

       fobj.setSize(400,300);
       fobj.setLayout(null);
       fobj.setVisible(true);
       fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

    //    String no1=tobj1.getText();
    //    String no2=tobj2.getText();

    //    int num1=Integer.parseInt(no1);
    //    int num2=Integer.parseInt(no2);

    //    doobj.writeInt(num1);
    //    doobj.writeInt(num2);






    // //    int no1=11,no2=10;

    // //    doobj.writeInt(no1);
    // //    doobj.writeInt(no2);



    //     int sum=diobj.readInt();
    //     Resultlabel.setText(""+sum);

        sobj.close();

        System.out.println("Client application Terminated");
    }
}