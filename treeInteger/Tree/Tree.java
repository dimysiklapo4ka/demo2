package treeInteger.Tree;

/**
 * Created by d1mys1klapo4ka on 30.03.2017.
 */
public class Tree {

    private String name;
    private double height;
    private static int count;

    /**
     * Возвращает счетчик деревьев.
     * @return count
     */
    public static int getCount() {
        return count;
    }


    public void minCount(){
        count--;
    }

    /**
     * Возвращает наименование дерева.
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * Возвращает высоту дерева.
     * @return height
     */
    public double getHeight(){
        return height;
    }

    /**
     * Конструктор по умолчанию.
     * Предназначен для создания экземпляра класса без параметров.
     */
    public Tree(){}

    /**
     * Создает экземпляр класса с нужными нам параметрами Наименование и Высота.
     * @param name
     * @param height
     */
    public Tree(String name, double height){
        this.name = name;
        this.height = height;
        count++;
    }

    /**
     * Переопределяет стандартный метод toString и выводит информацию с Наименованием и Высотой.
     * @return String
     */
    public String toString(){
        return this.name + " Высота дерева: " + this.height;
    }
}
