
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Teacher extends Person {
    int yearOfExperience, salary ;
    String major;
    public Teacher(int exp, int salary, String major, String name, String gender){
        super(name,gender);
        this.yearOfExperience = exp;
        this.salary = salary;
        this.major = major;
    }
    public static void main(String[] args) {
        Teacher t = new Teacher(12, 120000, "computer sciece ", "ram", "male");
        t.getDtails();
    }
    
    public void getDtails(){
        System.out.println("name "+super.name+"\n gender "+super.gender+"\n year of exp "+yearOfExperience+"\n salary "+
        salary+"\n major "+major);
    }
    
}
