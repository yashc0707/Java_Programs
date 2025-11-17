import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ChatServerX implements ActionListener
{
    JFrame fobj;
    JTextField tobj;
    JButton bobj;
    JLabel MessageLabel, ResultLabel;

    ServerSocket ssobj;
    Socket sobj;
    PrintStream pobj;
    BufferedReader bobj1, bobj2;

    ChatServerX() throws Exception
    {
        // GUI Design
        fobj = new JFrame("Server");
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
        ssobj = new ServerSocket(5000);
        System.out.println("Server started...waiting for client...");
        sobj = ssobj.accept();
        System.out.println("Client connected...");

        pobj = new PrintStream(sobj.getOutputStream());
        bobj1 = new BufferedReader(new InputStreamReader(System.in));
        bobj2 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        String str;
        while (true)
        {
            str = bobj2.readLine();
            if (str == null || str.equalsIgnoreCase("end")) break;
            ResultLabel.setText("Client Says: " + str);
        }

        sobj.close();
        ssobj.close();
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
        new ChatServerX();
    }
}
