public class testList {
    public static void main(String[] args) throws Exception {

        myList testList = new myList();
        
        testList.add_first("123");
        testList.add_first("Hellow");

        testList.add_last("World");
        testList.add_last("456");

        testList.add_last("It's ");
        testList.add_last("my ");

        testList.print_list();
        System.out.println("Num of elements:" + testList.how_many_elements());

        System.out.println("");

        myList copy = new myList(testList);
        
        System.out.println("Copy our list:");
        copy.print_list();
        System.out.println("Num of elements:" + copy.how_many_elements());

        System.out.println("");

        System.out.println("Delete first elements:");
        testList.delit_first();

        testList.print_list();
        System.out.println("Num of elements:" + testList.how_many_elements());

        System.out.println("");

        System.out.println("Deleting element by value");
        testList.delit_element("my ");

        testList.print_list();
        System.out.println("Num of elements:" + testList.how_many_elements());

        System.out.println("");

        System.out.println("Deleting element by value");
        testList.delit_element("456");

        testList.print_list();
        System.out.println("Num of elements:" + testList.how_many_elements());

        System.out.println("");
        System.out.println("Delit All");

        testList.delit_list();

        testList.print_list();
        System.out.println("Num of elements:" + testList.how_many_elements());

        System.out.println("");
        System.out.println("Exceptions:");

        testList.delit_first();
        testList.delit_element("World");

        testList.print_list();
       

    }
}
