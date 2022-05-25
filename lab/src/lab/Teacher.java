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
public class Teacher extends Person {
    int salary;
    String  subject;
    
    public Teacher(String faculty, int gpa,String prevCollege,String name,int salary, String subject){
        this.faculty = faculty;
        this.gpa    = gpa;
        this.name = name;
        this.prevCollege = prevCollege;
        this.salary = salary;
        this.subject = subject;
    }
    
    void getDetails(){
        System.out.println("The teacher details is as follow: ");
        System.out.println("name = " + name);
        System.out.println("faculty = " + faculty);
        System.out.println("prevCollege = " + prevCollege);
        System.out.println("gpa = " + gpa);
        System.out.println("salary  = " + salary );
        System.out.println("subject = " + subject);
        
    }
}
