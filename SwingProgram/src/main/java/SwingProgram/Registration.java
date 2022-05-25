/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingProgram;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Dell
 */
public class Registration extends JFrame {

    JFrame f;
    JLabel lname, laddress, lcontact, lnationality;
    JCheckBox hob1, hob2, hob3, hob4;
    JRadioButton lmale, lfemale;
    ButtonGroup gender;
    JButton btn, clear;
    JComboBox com;
    JTextField name, address, conact;
    String nation[] = {"Nepal", "India", "china", "korea", "indonesia", "pakistan", "france"};

    public Registration() {
        f = new JFrame();
        f.setLayout(new GridLayout());
        f.setSize(400, 600);
        f.setVisible(true);
        f.setTitle("regitration ");
        f.setLayout(new GridLayout(10, 2, 20, 20));
        f.setSize(300, 300);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lname = new JLabel("Name");
        laddress = new JLabel("Address");
        lcontact = new JLabel("contact ");
        lnationality = new JLabel("Nationality");

        lmale = new JRadioButton("Male");
        lfemale = new JRadioButton("Female");
        gender = new ButtonGroup();
        gender.add(lmale);
        gender.add(lfemale);

        hob1 = new JCheckBox("Cycling");
        hob2 = new JCheckBox("Reading ");
        hob3 = new JCheckBox("Coding ");
        hob4 = new JCheckBox("Travelling ");

        name = new JTextField();
        address = new JTextField();
        com = new JComboBox(nation);
        conact = new JTextField();

        btn = new JButton("Save");
        clear = new JButton("Clear");

        f.add(lname);
        f.add(name);
        f.add(laddress);
        f.add(address);
        f.add(lcontact);
        f.add(conact);
        f.add(lnationality);
        f.add(com);
        f.add(lmale);
        f.add(lfemale);
        f.add(hob1);
        f.add(hob2);
        f.add(hob3);
        f.add(hob4);

        f.add(btn);
        f.add(clear);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

                String name_value = name.getText();
                String address_value = address.getText();
                String contact_value = conact.getText();
                String nation = (String) com.getItemAt(com.getSelectedIndex());
                String g;
                Connection con = null;
                Statement st = null;

                if (lmale.isSelected()) {
                    g = lmale.getText();
                } else {
                    g = lfemale.getText();
                }

                String hobies = "";
                if (hob1.isSelected()) {
                    hobies = hobies.concat(hob1.getText()+",");
                }
                if (hob2.isSelected()) {
                     hobies = hobies.concat(hob3.getText()+",");
                }
                if (hob3.isSelected()) {
                     hobies = hobies.concat(hob4.getText()+",");
                }
                if (hob4.isSelected()) {
                     hobies = hobies.concat(hob4.getText()+",");
                }

                if (name_value.isEmpty()) {
                    JOptionPane.showMessageDialog(f, "name cant be empty");
                    return;
                }

                if (contact_value.isEmpty()) {
                    JOptionPane.showMessageDialog(f, "contact cant be empty");
                    return;

                }
                if (contact_value.length() < 10) {
                    JOptionPane.showMessageDialog(f, "Number must be of 10 digit ");
                    return;

                }

                if (address_value.isEmpty()) {
                    JOptionPane.showMessageDialog(f, "address cant be empty");
                    return;

                }

                if (com.getSelectedItem() == null) {

                    JOptionPane.showMessageDialog(f, "select any country ");
                    return;
                }

                if (g.isEmpty()) {
                    JOptionPane.showMessageDialog(f, "select gender");
                    return;
                }
                if (hobies.isEmpty()) {
                    JOptionPane.showMessageDialog(f, "hoby cant be empty");
                    return;
                }

                try {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_vaccinationsystem", "root", "");

                    String sql = "INSERT Into children (name,address,contact,"
                            + "gender,hobbies,nationality) values(?,?,?,?,?,?)";
                    System.out.println("sql" + sql);
                    PreparedStatement preparedStatement = con.prepareStatement(sql);
                    preparedStatement.setString(1, name_value);
                    preparedStatement.setString(2, address_value);
                    preparedStatement.setString(3, contact_value);

                    preparedStatement.setString(4, g);
                    preparedStatement.setString(5, hobies);

                    preparedStatement.setString(6, nation);
                    int i = preparedStatement.executeUpdate();
                    if (i > 0) {
                        JOptionPane.showMessageDialog(f, "new data added");
                    } else {
                        JOptionPane.showMessageDialog(f, "an error occured ");
                    }

                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                } finally {
                    try {
                        con.close();
                        System.out.println("finished");
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                }

            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                int a = JOptionPane.showConfirmDialog(f, "are you sure ? ");
                if (a == JOptionPane.YES_OPTION) {
                    name.setText("");

                    address.setText("");
                    conact.setText("");

                    hob1.setSelected(false);
                    hob2.setSelected(false);
                    hob3.setSelected(false);
                    hob4.setSelected(false);
                    lmale.setSelected(false);
                    lfemale.setSelected(false);
                }

            }
        });
    }

    public static void main(String[] args) {
        new Registration();

    }

}
