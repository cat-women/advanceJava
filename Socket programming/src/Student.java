/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Student extends Person {

    String faculty, previousCollege;
    int gpa;

    /**
     *
     * @param faculty
     * @param prevcollege
     * @param gpa
     */
    public Student(String faculty, String prevcollege, int gpa, String name, String gender) {
        super(name, gender);
        this.gpa = gpa;
        this.faculty = faculty;
        this.previousCollege = prevcollege;
    }

    public void getDetail() {
        System.out.println("name " + super.name + "\n gender " + super.gender + "\nfacultu " + faculty + "\n pre collee "
                + previousCollege + "\n gpa " + gpa);
    }

    public static void main(String[] args) {
        Student s = new Student("bca", "xavier", 4, "cat women", "female");
        s.getDetail();

    }
}

