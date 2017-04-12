package tree;

import java.util.ArrayList;

/**
 * Created by d1mys1klapo4ka on 12.04.2017.
 */
public class Menu {

    Tree tre = new Tree();
    ArrayList<Tree> tree = new ArrayList<Tree>();

    void showMenu(){

        System.out.println("1) Посмотреть состояние базы.");
        System.out.println("2) Добавить несколько одинаковых элементов.");
        System.out.println("3) Добавить один элемент.");
        System.out.println("4) Очистить базу.");
        System.out.println("5) Удалить семью.");
        System.out.println("6) Удалить один элемент.");
        System.out.println("q - Выход");
    }

    boolean isValidMenu(int i){
        if (i < '1' | i > '6' & i != 'q'){
            return false;
        }else {
            return true;
        }
    }



    void vali2dator(int num){

        switch (num){

            case '1':{
                for (Tree tr: tree) {
                    System.out.println(tr);
                }
                System.out.println("Общее количество деревьев на складе: " + tre.getCount());

                break;
            }
            case '2':{
                System.out.print("Введите название дерева: ");
                String name = tre.getString();
                System.out.print("Введите высоту дерева: ");
                double height = tre.getDouble();

                for (int i = 0, n = tre.getInt(); i < n; i++){
                    tree.add(new Tree(name, height));
                }
                break;
            }
            case '3':{
                System.out.print("Введите название дерева: ");
                String name = tre.getString();
                System.out.print("Введите высоту дерева: ");
                double height = tre.getDouble();
                tree.add(new Tree(name, height));
                break;
            }
            case '4':{
                tree.clear();
                break;
            }
            case '5':{
                System.out.println("Введите название дерева.");
                String name = tre.getString();
                int i = 0;
                while ( i < tre.getCount()){
                    if (name.equals(tree.get(i).getName())){
                        tree.remove(tree.get(i));
                        tre.minCount();

                    }else {
                        i++;
                    }
                }
                break;
            }
            case '6':{
                System.out.print("Введите название дерева: ");
                String name = tre.getString();
                System.out.print("Введите высоту дерева: ");
                double height = tre.getDouble();
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
                break;
            }
        }
    }
}
