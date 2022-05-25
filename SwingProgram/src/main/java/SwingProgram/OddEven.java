/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingProgram;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Dell
 */
public class OddEven {

    JTextField t1;
    JLabel label;
    JButton btn;
    JFrame frame = new JFrame();

    public OddEven() {
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle("odd or even ");

        label = new JLabel("Input");
        t1 = new JTextField();

        label.setBounds(50, 90, 100, 20);
        t1.setBounds(50, 120, 100, 20);

        btn = new JButton("Check");
        btn.setBounds(60, 160, 100, 20);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                int number = Integer.parseInt(t1.getText());
                if (number % 2 == 0) {
                    JOptionPane.showMessageDialog(frame, number + " \t is even ");

                } else {

                    JOptionPane.showMessageDialog(frame, number + "\t is odd ");
                }

            }
        });

        frame.add(label);
        frame.add(t1);
        frame.add(btn);

    }

    public static void main(String[] args) {

        new OddEven();
    }

}
