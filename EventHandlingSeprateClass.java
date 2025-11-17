import javax.swing.*;
import java.awt.event.*;

class MarvellousListener implements ActionListener
{
    public void actionPerformed(ActionEvent aobj)
    {
        System.out.println("Button Clicked....\n");
    }
}
class EventHandlingSeprateClass
{
    public static void main(String a[])
    {
        JFrame fobj=new JFrame("PPA");//(Frame Name)
        
        JButton bobj=new JButton("OK");//(Button Name)

        bobj.setBounds(100,100,150,50); //(x,y,Width,Height);

        bobj.addActionListener(new MarvellousListener());

        fobj.add(bobj);//Button add in Frame

        fobj.setSize(400,300);//(Width,Height)
        fobj.setLayout(null);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}