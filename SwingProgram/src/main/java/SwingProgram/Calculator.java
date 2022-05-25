/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingProgram;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Dell
 */
public class Calculator extends JFrame {

    JTextField t1, t2, t3, t4;
    JLabel l1, l2, l3, l4, result;
    JButton b1, add, sub;
    JFrame frame;

    Calculator() {
        frame = new JFrame();
        frame.setTitle("calculator");
      //  frame.setBounds(100, 200, 300, 400);
       
        frame.setSize(300, 400);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1 = new JLabel("principle ");
        l2 = new JLabel("time ");
        l3 = new JLabel("Rate ");
        l4 = new JLabel("simple interest ");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);

        frame.setLayout(new FlowLayout());

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);

        frame.add(t4);
        add = new JButton("add");
        sub = new JButton("sub");

        frame.add(add);
        frame.add(sub);

        b1 = new JButton("compute");

        frame.add(b1);

        result = new JLabel("result here ");

        frame.add(result);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                int p = Integer.parseInt(t1.getText());
                int t = Integer.parseInt(t2.getText());
                int r = Integer.parseInt(t3.getText());

                float result = p * t * r / 100;

                t4.setText("simple interest " + result);

            }
        });

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

                int priciple = Integer.parseInt(t1.getText());
                int time = Integer.parseInt(t2.getText());
                int rate = Integer.parseInt(t3.getText());
                int sum = priciple + time + rate;
                result.setText("the sum is" + sum);

            }
        });

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

                int priciple = Integer.parseInt(t1.getText());
                int time = Integer.parseInt(t2.getText());
                int rate = Integer.parseInt(t3.getText());
                int aub = rate - time;
                result.setText("the sub is " + aub);

            }
        });

    }

    public static void main(String[] args) {
       new Calculator();
    }

}
