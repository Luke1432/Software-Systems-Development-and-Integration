import java.awt.*;
import javax.swing.*;

public class MyFirstGUI{
    public static void main(String[] args) {
        JFrame frame=new JFrame("My First Swing Application");
        frame.setLayout(new FlowLayout());
        JTextField inputText=new JTextField(20);
        JLabel output=new JLabel();
        JButton button=new JButton("Click here");
        button.setBounds(50,50,100,50);



        button.addActionListener(e->{
            String text=inputText.getText();
            if(text.isEmpty()){
                JOptionPane.showMessageDialog(frame,"Text should not be empty!","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                output.setText("You entered: "+text);
            }
        });
        frame.add(inputText);
        frame.add(button);
        frame.add(output);
        frame.setSize(300,200);
        //frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}