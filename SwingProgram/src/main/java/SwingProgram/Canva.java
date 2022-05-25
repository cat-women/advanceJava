/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingProgram;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class Canva extends JPanel {
    
    public void paint(Graphics g)
    {
        g.drawOval(100, 100, 100, 100);
        g.drawLine(150, 150, 100, 100);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Draw a circle");
        f.getContentPane().add(new Canva());
        
        f.setSize(250, 250);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
