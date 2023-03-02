public class Test {
    public static void main(String[] args) {
        Binary_tree bt = new Binary_tree();

        bt.insert(6);
        bt.insert(4);
        bt.insert(1);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);

        Binary_tree bt2 = new Binary_tree();

        bt2.insert("tree");
        bt2.insert("notttree");
        bt2.insert("somethinglarge");
        bt2.insert("not");

        Binary_tree bt3 = new Binary_tree(bt2);

        System.out.println("\nПолучение размеров bt bt2 bt3");

        System.out.println(bt.size);
        System.out.println(bt2.size);
        System.out.println(bt3.size);

        System.out.println("\nbt2");
        bt2.inorder();
        System.out.println("\nИ его размер\n"+bt2.size);
        System.out.println("\nbt3 скопированный с bt2");
        bt3.inorder();
        System.out.println("\nИ его размер\n"+bt3.size);


        System.out.println("Поиск в bt2 элементов tree somethinglarge notttree bad (bad нет в bt2)");
        System.out.println(bt2.search("tree")+" "+bt2.search("somethinglarge")+" "+bt2.search("notttree")+" "+bt2.search("bad"));

        bt3.deleteAll();
        System.out.println("\nbt3 после удаления всего:");
        bt3.inorder();
        System.out.println("\nИ его размер"+"\n"+bt3.size);

    }
}
