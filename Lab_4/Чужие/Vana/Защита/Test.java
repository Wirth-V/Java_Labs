public class Test {
    public static void main(String[] args) {
        BST bt = new BST();

        bt.insert(10);
        bt.insert(7);
        bt.insert(15);
        bt.insert(13);
        bt.insert(20);
        bt.insert(9);
        bt.insert(17);
        bt.insert(4);
        bt.insert(8);
        bt.insert(1);
        bt.insert(6);
        bt.insert(5);

        System.out.println(bt.findFullNode());

    }
}
