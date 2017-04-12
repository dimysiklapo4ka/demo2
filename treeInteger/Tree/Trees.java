package treeInteger.Tree;

/**
 * Created by d1mys1klapo4ka on 30.03.2017.
 * @version 0.0.0.4
 */
public class Trees {

    public static void main(String[] args) {

        Menu menu = new Menu();
        Helper helper = new Helper();

        int menuNumber;
        while (true) {
              do {
                  menu.showMenu();

                  menuNumber = helper.getInt();

              } while (!menu.isValidMenu(menuNumber));

                  if (menuNumber == 0) {
                      break;
                  }
                  menu.vali2dator(menuNumber);

          }
        }

}

