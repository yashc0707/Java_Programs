import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

class MarvellousLogin implements ActionListener
{
    //Charcteristics

    JFrame fobj;
    JButton addButton;
    JButton subButton;
    JButton mulButton;
    JButton divButton;
    JTextField tobj1;
    JTextField tobj2;
    JLabel NumberLabel1,NumberLabel2,Resultlabel;


    public MarvellousLogin(String Title,int Width,int Height)
    {
        fobj=new JFrame(Title);

        NumberLabel1=new JLabel("Number 1");
        NumberLabel1.setBounds(50,50,100,30);

        tobj1=new JTextField();
        tobj1.setBounds(150,50,150,30);

        NumberLabel2=new JLabel("Number 2");
        NumberLabel2.setBounds(50,100,100,30);

        tobj2=new JTextField();
        tobj2.setBounds(150,100,150,30);

        addButton=new JButton("+");
        addButton.setBounds(50,160,50,30);

        subButton=new JButton("-");
        subButton.setBounds(130,160,50,30);

        mulButton=new JButton("X");
        mulButton.setBounds(200,160,50,30);

        divButton=new JButton("/");
        divButton.setBounds(280,160,50,30);

        Resultlabel=new JLabel();
        Resultlabel.setBounds(180,200,250,30);

        fobj.add(addButton);
        fobj.add(subButton);
        fobj.add(mulButton);
        fobj.add(divButton);
        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(NumberLabel1);
        fobj.add(NumberLabel2);
        fobj.add(Resultlabel);

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        fobj.setLayout(null);
        fobj.setSize(Width,Height);
        fobj.setVisible(true);
        fobj.getContentPane().setBackground(Color.YELLOW);
        addButton.setBackground(Color.BLUE);
        subButton.setBackground(Color.BLUE);
        mulButton.setBackground(Color.BLUE);
        divButton.setBackground(Color.BLUE);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {
        String Number1=tobj1.getText();
        String Number2=tobj2.getText();

        int num1=Integer.valueOf(Number1);
        int num2=Integer.valueOf(Number2);

        if(aobj.getSource()==addButton)
        {
            Resultlabel.setText(""+(num1+num2));
        }

        else if(aobj.getSource()==subButton)
        {
            Resultlabel.setText(""+(num1-num2));
        }

        else if(aobj.getSource()==mulButton)
        {
            Resultlabel.setText(""+(num1*num2));
        }
        else if(aobj.getSource()==divButton)
        {
            Resultlabel.setText(""+(num1/num2));
        }
        else
        {
            Resultlabel.setText("Divide by 0 Error");
        }
        
    }
}
class Calculator
{
    public static void main(String a[])
    {
        MarvellousLogin mobj=new MarvellousLogin("Calculator",450,300);
    }
}