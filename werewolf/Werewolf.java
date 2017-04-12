package werewolf;

import java.util.Scanner;


/**
 * Created by d1mys1klapo4ka on 01.04.2017.
 */
public class Werewolf {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    String text = scanner.nextLine();
    scanner.close();
    String[] werewolf = text.split(" ");

        for (int i = 0, n = werewolf.length; i < n; i++) {
            StringBuffer abc = new StringBuffer(werewolf[i]);
            abc.reverse();
            System.out.println(abc);
        }
    }
}
