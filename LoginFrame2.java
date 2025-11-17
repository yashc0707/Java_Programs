import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin
{
    public MarvellousLogin(String Title,int Width,int Height)
    {
        JFrame fobj=new JFrame(Title);
        fobj.setSize(Width,Height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class LoginFrame2
{
    public static void main(String a[])
    {
        MarvellousLogin mobj=new MarvellousLogin("Login",500,300);
    }
}