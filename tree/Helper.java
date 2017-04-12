package tree;

import java.util.Scanner;

/**
 * Created by d1mys1klapo4ka on 13.04.2017.
 */
public class Helper {

    Tree tree = new Tree();
    Scanner scanner = new Scanner(System.in);

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

        return scanner.nextLine();
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
