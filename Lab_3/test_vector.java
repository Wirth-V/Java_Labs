public class test_vector {
    public static void main(String[] args) {
        myVector first = new myVector();

        first.add("Hello");
        first.add(5);
        first.add(2.15);
        first.add("ku");

        myVector second = new myVector(first);

        first.del();

        first.add("ku");
        first.add(3.14);

        first.del(3);

        first.add(12, 7);

        first.clear();

        for (int i = 0; i < second.arr.length; i++)
            System.out.printf("%d %s\n", i,  second.arr[i]);
    }
}
