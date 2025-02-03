package csci2020.lab04;

import java.util.Calendar;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.jdesktop.swingx.JXDatePicker;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel uNameLabel = new JLabel("Username:");
        JTextField uName = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField password = new JPasswordField(20);
        JLabel fNameLabel = new JLabel("Full Name:");
        JTextField fName = new JTextField(20);
        JLabel emailLabel = new JLabel("E-Mail:");
        JTextField email = new JTextField(20);
        JLabel phoneLabel = new JLabel("Phone number:");
        JTextField phone = new JTextField("(___) ___-____");
        JLabel dobLabel = new JLabel("Date of Birth:");
        JXDatePicker datePicker = new JXDatePicker();
        datePicker.setDate(Calendar.getInstance().getTime());
        JButton registrationButton = new JButton("Register");
        registrationButton.addActionListener(l -> {
            System.out.println("Username: " + uName.getText());
            System.out.println("Password: " + new String(password.getPassword()));
            System.out.println("Full Name: " + fName.getText());
            System.out.println("E-Mail: " + email.getText());
            System.out.println("Phone number: " + phone.getText());
            System.out.println("Date of Birth: " + datePicker.getDate());
        });

        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(uNameLabel)
                    .addComponent(passwordLabel)
                    .addComponent(fNameLabel)
                    .addComponent(emailLabel)
                    .addComponent(phoneLabel)
                    .addComponent(dobLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(uName)
                    .addComponent(password)
                    .addComponent(fName)
                    .addComponent(email)
                    .addComponent(phone)
                    .addComponent(datePicker)
                    .addComponent(registrationButton))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(uNameLabel)
                    .addComponent(uName))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(password))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel)
                    .addComponent(fName))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(email))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phone))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel)
                    .addComponent(datePicker))
                .addComponent(registrationButton)
        );

        frame.pack();
        frame.setVisible(true);
    }
}