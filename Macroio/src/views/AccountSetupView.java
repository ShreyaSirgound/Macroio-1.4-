package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class AccountSetupView {
    public AccountSetupView() {
        JFrame frame = new JFrame("Create an account");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1280, 720);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.decode("#F9F5E3"));

        JPanel headerPane = new JPanel();
        headerPane.setBounds(385, 50, 500, 60);
        headerPane.setBackground(Color.decode("#F9F5E3"));
        JLabel header = new JLabel("Let's learn a bit about you");
        header.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 35));
		header.setForeground(Color.black);
        header.setAlignmentX(Component.CENTER_ALIGNMENT);
        headerPane.add(header);
        frame.add(headerPane);

        //////////////////////////////////////////////////////////////////
        JPanel formPanel = new JPanel();
        formPanel.setBounds(10, 120, 500, 500);
        formPanel.setLayout(null);

        JPanel mainPanel1 = new JPanel();
        mainPanel1.setBounds(270, 120, 365, 435); //10
        mainPanel1.setBackground(Color.white);
        mainPanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 25));

        //input fields
        //name input
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBackground(Color.white);
        JLabel label1 = new JLabel("Enter your name (First, Last)", SwingConstants.RIGHT);
        label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
        label1.setBackground(Color.decode("#76BEE8"));
        label1.setForeground(Color.gray);
        label1.setBorder(BorderFactory.createEmptyBorder(0, 0, 17, 0));
        JTextField input1 = new JTextField();
        input1.setColumns(5);
        input1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        panel1.add(label1);
        panel1.add(input1);
        mainPanel1.add(panel1);

        //age input
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setBackground(Color.white);
        JLabel label2 = new JLabel("What is your age?", SwingConstants.RIGHT);
        label2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
        label2.setBackground(Color.decode("#76BEE8"));
        label2.setForeground(Color.gray);
        label2.setBorder(BorderFactory.createEmptyBorder(0, 0, 17, 0));
        JTextField input2 = new JTextField();
        input2.setColumns(17);
        input2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        panel2.add(label2);
        panel2.add(input2);
        mainPanel1.add(panel2);
        
        //height input
        JPanel panel4 = new JPanel();
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
        panel4.setBackground(Color.white);
        JLabel label4 = new JLabel("Enter your height", SwingConstants.RIGHT);
        label4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
        label4.setBackground(Color.decode("#76BEE8"));
        label4.setForeground(Color.gray);
        label4.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));
        JTextField input4 = new JTextField();
        input4.setColumns(19);
        input4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        panel4.add(label4);
        panel4.add(input4);
        mainPanel1.add(panel4);

       //weight input
        JPanel panel5 = new JPanel();
        panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
        panel5.setBackground(Color.white);
        JLabel label5 = new JLabel("Enter your weight", SwingConstants.RIGHT);
        label5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
        label5.setBackground(Color.decode("#76BEE8"));
        label5.setForeground(Color.gray);
        label5.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));
        JTextField input5 = new JTextField();
        input5.setColumns(19);
        input5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        panel5.add(label5);
        panel5.add(input5);
        mainPanel1.add(panel5);

        //second panel
        JPanel mainPanel2 = new JPanel();
        mainPanel2.setBounds(630, 120, 370, 435); //475
        mainPanel2.setBackground(Color.white);
        mainPanel2.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 25));

        //sex input
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel3.setBackground(Color.white);
        JLabel label3 = new JLabel("Enter your sex", SwingConstants.LEFT);
        label3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
        label3.setBackground(Color.decode("#76BEE8"));
        label3.setForeground(Color.gray);
        panel3.setAlignmentX(Component.LEFT_ALIGNMENT);
        label3.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));
        String roles[] = {"", "Female", "Male"};
        JComboBox<String> roleOptions = new JComboBox(roles);
        roleOptions.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        panel3.add(label3);
        panel3.add(roleOptions);
        mainPanel2.add(panel3);

       //diet input
        JPanel panel6 = new JPanel();
        panel6.setLayout(new BoxLayout(panel6, BoxLayout.Y_AXIS));
        panel6.setBackground(Color.white);
        JLabel label6 = new JLabel("Enter your diet preferences", SwingConstants.LEFT);
        label6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
        label6.setBackground(Color.decode("#76BEE8"));
        label6.setForeground(Color.gray);
        panel6.setAlignmentX(Component.LEFT_ALIGNMENT);
        label6.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));
        String diets[] = {"", "Vegan", "Vegetarian", "Non-Vegetarian", "Keto", "Pescatarian"};
        JComboBox<String> dietOptions = new JComboBox(diets);
        dietOptions.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        panel6.add(label6);
        panel6.add(dietOptions);
        mainPanel2.add(panel6);

        //activity input
        JPanel panel7 = new JPanel();
        panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));
        panel7.setBackground(Color.white);
        JLabel label7 = new JLabel("How active are you?", SwingConstants.LEFT);
        label7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
        label7.setBackground(Color.decode("#76BEE8"));
        label7.setForeground(Color.gray);
        panel7.setAlignmentX(Component.LEFT_ALIGNMENT);
        label7.setBorder(BorderFactory.createEmptyBorder(0, 0, 17, 0));
        String activities[] = {"", "Little to no excercise", "Little excercise (1-3 times/week)", "Moderate excercise (3-5 times/week)", "Heavy excercise (6-7 times/week)"};
        JComboBox<String> activityOptions = new JComboBox(activities);
        activityOptions.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        panel7.add(label7);
        panel7.add(activityOptions);
        mainPanel2.add(panel7);

        //password input
        JPanel panel8 = new JPanel();
        panel8.setLayout(new BoxLayout(panel8, BoxLayout.Y_AXIS));
        panel8.setBackground(Color.white);
        JLabel label8 = new JLabel("Create your password:", SwingConstants.RIGHT);
        label8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
        label8.setBackground(Color.decode("#76BEE8"));
        label8.setForeground(Color.gray);
        label8.setBorder(BorderFactory.createEmptyBorder(0, 0, 17, 0));
        JPasswordField password = new JPasswordField(30);
        password.setEchoChar('*');
        password.setColumns(13);
        password.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        panel8.add(label8);
        panel8.add(password);
        mainPanel2.add(panel8);

        JButton submit = new JButton("Submit");
        submit.setBounds(270, 560, 735, 35);
        submit.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        submit.setBackground(Color.decode("#E8F0F3"));
        submit.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
        submit.setForeground(Color.decode("#5596B2"));
        submit.setBorderPainted(false);
        submit.addActionListener(e -> {
            new LoginView();
            frame.dispose();
        });

        frame.add(mainPanel1);
        frame.add(mainPanel2);
        frame.add(submit);

        frame.setVisible(true);
    }
}
