package Homework_8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Main implements ActionListener {

    public Main() {
        initComponents();
    }

    private JFrame viewForm;

    private void initComponents() {
        viewForm = new JFrame("Окно");
        viewForm.setBounds(350, 350,450, 300);
        viewForm.setVisible(true);
        viewForm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JButton button = new JButton("<html><h2><font color=\"black\">Нажми меня!");
        button.setVisible(true);
        button.setLocation(120, 80);
        button.setSize(200, 100);
        button.setBackground(Color.red);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(viewForm, "Спасибо за семинары и новые знания!",
                        "Last Homework!", JOptionPane.INFORMATION_MESSAGE);
            }

        });
        viewForm.getContentPane().add(button);
        viewForm.getContentPane().add(new JLabel());
    }

    public void actionPerformed(ActionEvent action) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}

