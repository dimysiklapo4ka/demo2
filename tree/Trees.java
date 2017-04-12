package tree;

import java.io.IOException;


/**
 * Created by d1mys1klapo4ka on 30.03.2017.
 */
public class Trees {

    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();

        char menuNumber, ignore;
      while (true) {
              do {
                  menu.showMenu();

                  menuNumber = (char) System.in.read();

                  do {
                      ignore = (char) System.in.read();
                  } while (ignore != '\n');

              } while (!menu.isValidMenu(menuNumber));

                  if (menuNumber == 'q') {
                      break;
                  }
                  menu.vali2dator(menuNumber);

          }
      }

}

