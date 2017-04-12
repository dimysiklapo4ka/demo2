package treeInteger.Tree;

import java.util.ArrayList;

/**
 * Created by d1mys1klapo4ka on 12.04.2017.
 */
public class Menu {

    final static String GET_NAME = "Введите название дерева: ";
    final static String GET_HEIGHT = "Введите высоту дерева: ";

    Tree tre = new Tree();
    Helper helper = new Helper();
    ArrayList<Tree> tree = new ArrayList<Tree>();

    /**
     * Метод отображает меню пользовательского интерфейса.
     */
    void showMenu(){

        System.out.println("1) Посмотреть состояние базы.");
        System.out.println("2) Добавить несколько одинаковых деревьев.");
        System.out.println("3) Добавить одино дерево.");
        System.out.println("4) Очистить базу.");
        System.out.println("5) Удалить все деревья с заданным названием.");
        System.out.println("6) Удалить одино дерево по названию и высоте.");
        System.out.println("0 - Выход");
    }

    /**
     * Проверяет коректно ли осуществили ввод знвчения пунктов меню.
     * @param i должен входить в диапазон пользовательского интерфейса.
     * @return boolean true если ввод осуществлен корректно
     * false при вводе ложного значения.
     */
    boolean isValidMenu(int i){
        if (i < 0 | i > 6){
            return false;
        }else {
            return true;
        }
    }

    /**
     * Выполняет действия указанные пользователем согласно пунктов меню.
     * @param num Выбор нужного действия
     */
    void vali2dator(int num){

        switch (num){

            case 1:{
                for (Tree tr: tree) {
                    System.out.println(tr);
                }
                System.out.println();
                System.out.println("Общее количество деревьев на складе: " + tre.getCount());
                System.out.println();
                break;
            }
            case 2:{
                System.out.print(GET_NAME);
                String name = helper.getString();
                System.out.print(GET_HEIGHT);
                double height = helper.getDouble();
                System.out.print("Введите необходимое количество деревьев: ");
                for (int i = 0, n = helper.getInt(); i < n; i++){
                    tree.add(new Tree(name, height));
                }
                System.out.println();
                break;
            }
            case 3:{
                System.out.print(GET_NAME);
                String name = helper.getString();
                System.out.print(GET_HEIGHT);
                double height = helper.getDouble();
                tree.add(new Tree(name, height));
                System.out.println();
                break;
            }
            case 4:{
                tree.clear();
                break;
            }
            case 5:{
                System.out.println(GET_NAME);
                String name = helper.getString();
                int i = 0;
                while ( i < tre.getCount()){
                    if (name.equals(tree.get(i).getName())){
                        tree.remove(tree.get(i));
                        tre.minCount();

                    }else {
                        i++;
                    }
                }
                System.out.println();
                break;
            }
            case 6:{
                System.out.print(GET_NAME);
                String name = helper.getString();
                System.out.print(GET_HEIGHT);
                double height = helper.getDouble();
                int i = 0;
                while ( i < tre.getCount()) {
                    if (name.equals(tree.get(i).getName()) && height == tree.get(i).getHeight()) {
                        tree.remove(tree.get(i));
                        tre.minCount();
                        break;
                    }
                    else {
                        i++;
                    }
                }
                System.out.println();
                break;
            }
        }
    }
}
