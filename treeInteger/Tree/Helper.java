package treeInteger.Tree;

import java.util.Scanner;

/**
 * Created by d1mys1klapo4ka on 13.04.2017.
 */
public class Helper {

    Scanner scanner = new Scanner(System.in);

    /**
     * Предназначен для получения целочисленного значения.
     * @return int
     */
    int getInt() {

        while (true) {
            try {
                return Integer.parseInt(getString());
            } catch (NumberFormatException nfe) {
                System.out.println("Введите целое число.");
            }
        }
    }

    /**
     * Предназначен для считывания сроки с клавиатуры
     * и присваивания ее переменной.
     * @return String
     */
    String getString(){

        return scanner.nextLine();
    }

    /**
     * Предназначен для получения вещественного числа.
     * @return double
     */
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
