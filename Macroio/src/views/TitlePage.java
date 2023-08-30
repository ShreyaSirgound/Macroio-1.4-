package views;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TitlePage {
    public TitlePage() {
        JFrame frame = new JFrame("TitlePage");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1280, 720);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.decode("#F9F5E3"));

        JPanel logoPanel = new JPanel(new FlowLayout());
        logoPanel.setBackground(Color.decode("#F9F5E3"));

        JLabel logoLbl = new JLabel("macroio");
        logoLbl.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 90));
		logoLbl.setForeground(Color.black);
        logoPanel.add(logoLbl);

        JLabel descLbl = new JLabel("Empower Your Fitness Journey with Precision and Balance!");
        descLbl.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		descLbl.setForeground(Color.black);

        logoPanel.add(descLbl);
        logoPanel.setBounds(360, 220, 550, 155);

        JPanel btnPanel = new JPanel(new FlowLayout());
        btnPanel.setBackground(Color.decode("#F9F5E3"));
        btnPanel.setBounds(360, 400, 550, 50);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBackground(Color.decode("#E8F0F3"));
        loginBtn.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
        loginBtn.setForeground(Color.decode("#5596B2"));
        loginBtn.setBorderPainted(false);
        loginBtn.addActionListener(e -> {
            new LoginView();
            frame.dispose();
        });
        btnPanel.add(loginBtn);

        JButton createAccBtn = new JButton("Create an account");
        createAccBtn.setBackground(Color.decode("#E8F0F3"));
        createAccBtn.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
        createAccBtn.setForeground(Color.decode("#5596B2"));
        createAccBtn.setBorderPainted(false);
        createAccBtn.addActionListener(e -> {
            new AccountSetupView();
            frame.dispose();
        });
        btnPanel.add(createAccBtn);

        frame.add(logoPanel);
        frame.add(btnPanel);

        frame.setVisible(true);
    }
    
}
