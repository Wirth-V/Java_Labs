public class Test {
    public static void main(String[] args) {
        Protect x = new Protect();

        x.adding(10);
        x.adding(7);
        x.adding(15);
        x.adding(13);
        x.adding(20);
        x.adding(9);
        x.adding(17);
        x.adding(4);
        x.adding(8);
        x.adding(1);
        x.adding(6);
        x.adding(5);

        System.out.println(x.fullNode());

    }
}
