/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
abstract class AbstractClass {

    abstract void eat();

    abstract String drink();

}

interface Shape {

    double area(double length, double breath, boolean isCirlc);

    void shape();

}

class Rectangle implements Shape {

    @Override
    public double area(double length, double breath, boolean isCirlc) {
        if (!isCirlc) {
            double result;
            result = 2 * length * breath;
            return result;
        } else {
            return 0;
        }
    }

    @Override

    public void shape() {
        System.out.println("this is reactangle  ");
    }

    public void parentMethod() {
        System.out.println("this is parent method ");
    }
}

class Circle implements Shape {

    @Override
    public double area(double length, double breath, boolean isCirlc) {
        if (isCirlc) {
            double result = 2 * 3.14 * Math.sqrt(length);
            return result;
        } else {
            return 0;
        }
    }

    @Override
    public void shape() {
        System.out.println("this is circle  ");

    }

}

public class Abstraction extends AbstractClass {

    @Override
    void eat() {
        System.out.println("We are eating pizza");

    }

    @Override
    String drink() {
        return "cocacoal";

    }

    public void sleep() {
        System.out.println("we sleep");
    }

    public static void main(String[] args) {
        Abstraction obj = new Abstraction();
        obj.eat();
        System.out.println("we are driking " + obj.drink());
        obj.sleep();

        Rectangle r = new Rectangle();
        System.out.println("the areis " + r.area(1.1, 2.4, false));
        r.shape();
        
        Circle c = new Circle();
        System.out.println("are of circle is"+c.area(12, 0, true));
        c.shape();
    }

}
