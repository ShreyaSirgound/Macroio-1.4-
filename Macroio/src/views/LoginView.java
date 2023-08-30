package views;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import views.MainViews.DashboardView;
import views.MainViews.MainView;

public class LoginView {
    char[] enteredPassword;
	String curPassword = "";
	String curUsername = "";
	JPasswordField password;
	JTextField username;

    public LoginView() {
        JFrame frame = new JFrame("Create an account");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1280, 720);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.decode("#F9F5E3"));
        
        JLabel headerLabel = new JLabel("Login to get started!");
        headerLabel.setForeground(Color.black);
        headerLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 34));
        headerLabel.setBounds(465, 50, 350, 60);
        frame.add(headerLabel);

        //login input area
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        loginPanel.setBackground(Color.white);
        loginPanel.setBounds(460, 150, 350, 320);

        //username input
        JPanel filler = new JPanel();
        filler.setPreferredSize(new Dimension(350, 25));
        filler.setBackground(Color.white);
        loginPanel.add(filler);
        JLabel userDesc = new JLabel("Username");
        userDesc.setForeground(Color.gray);
        userDesc.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        loginPanel.add(userDesc);
        username = new JTextField(21);
        username.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        loginPanel.add(username);

        JPanel filler2 = new JPanel();
        filler2.setPreferredSize(new Dimension(350, 5));
        filler2.setBackground(Color.white);
        loginPanel.add(filler2);

        //password input
        JLabel passwordDesc = new JLabel("Password");
        passwordDesc.setForeground(Color.gray);
        passwordDesc.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        loginPanel.add(passwordDesc);

        password = new JPasswordField(21);
        password.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        password.setEchoChar('*');
        loginPanel.add(password);

        JPanel filler3 = new JPanel();
        filler3.setPreferredSize(new Dimension(350, 10));
        filler3.setBackground(Color.white);
        loginPanel.add(filler3);

        //login button
        JButton login = new JButton("Login");
        login.setPreferredSize(new Dimension(340,45));
        login.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        login.setBackground(Color.decode("#E8F0F3"));
        login.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
        login.setForeground(Color.decode("#5596B2"));
        login.setBorderPainted(false);
        login.addActionListener(e -> {
            new MainView();
            frame.dispose();
        });
        loginPanel.add(login);

        JLabel option = new JLabel("------------------------- or -------------------------", SwingConstants.CENTER);
        option.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 17));
        option.setForeground(Color.black);
        option.setPreferredSize(new Dimension(340,20));
        loginPanel.add(option);
        
        //button to create an account
        JButton newAccount = new JButton("Create an account");
        newAccount.setPreferredSize(new Dimension(340,45));
        newAccount.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        newAccount.setBackground(Color.decode("#E8F0F3"));
        newAccount.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
        newAccount.setForeground(Color.decode("#5596B2"));
        newAccount.setBorderPainted(false);
        newAccount.addActionListener(e -> {
            new AccountSetupView();
            frame.dispose();
        });

        loginPanel.add(newAccount);
        frame.add(loginPanel);

        frame.setVisible(true);
        
    }
    	public boolean validate() {

    		return false;
        }
    
}
