public class Test_binary_tree {
    public static void main(String[] args) {

        Binary_tree x_1 = new Binary_tree();
        Binary_tree x_2 = new Binary_tree();

        x_1.insert(6);
        x_1.insert(4);
        x_1.insert(1);
        x_1.insert(5);
        x_1.insert(7);
        x_1.insert(9);

        x_2.insert("My");
        x_2.insert("work");
        x_2.insert("is");
        x_2.insert("long");

        //Копирование x_2 в x_3
        Binary_tree x_3 = new Binary_tree(x_2);

        System.out.println("");

        System.out.print("Размер x_1:");
        System.out.println(" " + x_1.size);

        System.out.println("");

        System.out.print("Размер x_2:");
        System.out.println(" " + x_2.size);

        System.out.println("");

        System.out.print("Размер x_3:");
        System.out.println(" " + x_3.size);

        System.out.println("");

        System.out.print("Есть ли элемент is в x_2? - ");
        System.out.println(x_2.search("is"));

        System.out.println("");

        System.out.print("Есть ли элемент keel в x_2? - ");
        System.out.println(x_2.search("keel"));

        System.out.println("");

        //Удаление x_3
        x_3.deleteAll();
        System.out.println("Новый размер x_3: "+x_3.size);

        System.out.println("");

    }
}
