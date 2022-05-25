/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author Dell
 */
public class Students extends Person {
    String batch;
    String roll;
    String dob;
    String address;

    public Students(String batch,String roll, String faculty, int gpa,String prevCollege,String name, String address, String dob) {
        this.batch = batch;
        this.roll = roll;
        this.dob = dob;
        this.address = address;
        super.faculty = faculty;
        super.gpa = gpa;
        super.prevCollege = prevCollege;
        super.name = name;

    }
    void getDetails(){
        System.out.println("Students details id ");
        System.out.println("name  = " + name );
        System.out.println("address = " + address);
        System.out.println("date of birth = " + dob);
        System.out.println("faculty = " + faculty);
        System.out.println("roll = " + roll);
        System.out.println("batch = " + batch);
        System.out.println("gpa = " + gpa);
        System.out.println("previous college = " + prevCollege);
        
    }

}
