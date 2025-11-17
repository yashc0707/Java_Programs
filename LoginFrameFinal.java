import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
    //Charcteristics

    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JPasswordField pobj;
    JLabel Userlabel,Passlabel,Resultlabel;


    public MarvellousLogin(String Title,int Width,int Height)
    {
        fobj=new JFrame(Title);

        Userlabel=new JLabel("User Name");
        Userlabel.setBounds(50,50,100,30);

        tobj=new JTextField();
        tobj.setBounds(150,50,150,30);

        Passlabel=new JLabel("Password");
        Passlabel.setBounds(50,100,100,30);

        pobj=new JPasswordField();
        pobj.setBounds(150,100,150,30);

        bobj=new JButton("SUBMIT");
        bobj.setBounds(150,150,100,30);

        Resultlabel=new JLabel();
        Resultlabel.setBounds(150,200,250,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(Userlabel);
        fobj.add(Resultlabel);
        fobj.add(Passlabel);

        bobj.addActionListener(this);
        fobj.setLayout(null);
        fobj.setSize(Width,Height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Username: Marvellous
    //Password: Marvellous@123

    public void actionPerformed(ActionEvent aobj)
    {
        String uname=tobj.getText();
        String pass=pobj.getText();

        if(uname.equals("Marvellous") && pass.equals("Marvellous@123") )
        {
            Resultlabel.setText("Login Successful....");
        }
        else
        {
            Resultlabel.setText("Login Failed....");
        }
    }
}
class LoginFrameFinal
{
    public static void main(String a[])
    {
        MarvellousLogin mobj=new MarvellousLogin("Login",400,300);
    }
}