package views.MainViews;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MainView {
    public MainView() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1280, 720);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.decode("#F9F5E3"));

        //the tabbed pane containing all available views
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBackground(Color.white);
        tabbedPane.setForeground(Color.black);
        JComponent panel1 = makePanel();
        JComponent panel2 = makePanel();
        JComponent panel3 = makePanel();
        JComponent panel4 = makePanel();
        tabbedPane.addTab("Dashboard", panel1);
        tabbedPane.addTab("Meal Tracker", panel2);
        tabbedPane.addTab("Explore", panel3);
        tabbedPane.addTab("Analytics", panel4);
        tabbedPane.addTab("Account", new AccountEditView());
        tabbedPane.setBackgroundAt(0, Color.decode("#FFFDC3"));
        tabbedPane.setBackgroundAt(1, Color.decode("#DAFFC3"));
        tabbedPane.setBackgroundAt(2, Color.decode("#FFD4B0"));
        tabbedPane.setBackgroundAt(3, Color.decode("#DFC2FD"));
        tabbedPane.setBackgroundAt(4, Color.decode("#C6CDFA"));

        frame.add(tabbedPane);
        frame.setVisible(true);
    }

    JPanel makePanel() {
        return new JPanel();
    }
}
