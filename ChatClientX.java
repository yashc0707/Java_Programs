import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ChatClientX implements ActionListener
{
    JFrame fobj;
    JTextField tobj;
    JButton bobj;
    JLabel MessageLabel, ResultLabel;

    Socket sobj;
    PrintStream pobj;
    BufferedReader bobj1, bobj2;

    ChatClientX() throws Exception
    {
        // GUI Design
        fobj = new JFrame("Client");
        tobj = new JTextField();
        bobj = new JButton("SEND");
        MessageLabel = new JLabel("Message:");
        ResultLabel = new JLabel();

        fobj.add(MessageLabel);
        fobj.add(tobj);
        fobj.add(bobj);
        fobj.add(ResultLabel);

        fobj.setLayout(null);
        fobj.setSize(400, 300);
        fobj.getContentPane().setBackground(Color.YELLOW);
        bobj.setBackground(Color.BLUE);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fobj.setVisible(true);

        MessageLabel.setBounds(50, 70, 100, 30);
        tobj.setBounds(150, 70, 150, 30);
        bobj.setBounds(130, 130, 100, 30);
        ResultLabel.setBounds(100, 180, 200, 30);

        bobj.addActionListener(this);

        // Networking
        sobj = new Socket("localhost", 5000);
        pobj = new PrintStream(sobj.getOutputStream());
        bobj1 = new BufferedReader(new InputStreamReader(System.in));
        bobj2 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        String str;
        while (true)
        {
            str = bobj2.readLine();
            if (str == null || str.equalsIgnoreCase("end")) break;
            ResultLabel.setText("Server Says: " + str);
        }

        sobj.close();
    }

    public void actionPerformed(ActionEvent aobj)
    {
        try
        {
            String str1 = tobj.getText();
            pobj.println(str1);
            tobj.setText("");
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String args[]) throws Exception
    {
        new ChatClientX();
    }
}
