package tree;

import java.util.Scanner;

/**
 * Created by d1mys1klapo4ka on 30.03.2017.
 */
public class Tree {

    final static String DEFAULT_NAME = "sprout";
    final static double DEFAULT_HEIGHT = 1.0;
    private String name;
    private double height;
    private static int count;

    Scanner scanner = new Scanner(System.in);

    public static int getCount() {
        return count;
    }

    public void minCount(){
        count--;
    }

    public String getName(){
        return name;
    }

    public double getHeight(){
        return height;
    }

    public Tree(){}

    public Tree(String name){
        this(name, DEFAULT_HEIGHT);
    }

    public Tree(String name, double height){
        this.name = name;
        this.height = height;
        count++;
    }

    public String toString(){
        return this.name + " Height: " + this.height;
    }
//    public void printInformation(){
//        System.out.println("Name: " + this.name + " Height: " + this.height);
//    }

    int getInt() {

        while (true) {
            try {
                return Integer.parseInt(getString());
            } catch (NumberFormatException nfe) {
                System.out.println("Введите целое число.");
            }
        }
    }

    String getString(){

            return name = scanner.nextLine();
    }

    double getDouble(){

        while (true) {
            try {
                return Double.parseDouble(getString());
            } catch (NumberFormatException nfe) {
                System.out.println("Введите вещественное число.");
            }
        }
    }
}
