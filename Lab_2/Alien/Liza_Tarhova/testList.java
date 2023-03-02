public class testList {
    public static void main(String[] args) {
        System.out.println("Test: void list.");
        myList linkedList = new myList();
        linkedList.removeFirst();
        linkedList.getNumberOfElements();

        System.out.println("Test: fill in the list.");
        linkedList.addFirst("234");
        linkedList.addFirst("345");
        linkedList.addFirst("456");
        linkedList.addFirst("Beginning");
        linkedList.addLast("123");
        linkedList.addLast("012");
        linkedList.addLast("End");
        linkedList.printList();
        linkedList.getNumberOfElements();

        System.out.println("Test: delete the first.");
        linkedList.removeFirst();
        linkedList.printList();
        linkedList.getNumberOfElements();

        System.out.println("Test: delete an element.");
        linkedList.removeElement("1234");
        linkedList.printList();
        linkedList.getNumberOfElements();
        linkedList.removeElement("End");
        linkedList.printList();
        linkedList.getNumberOfElements();
        linkedList.removeElement("234");
        linkedList.printList();
        linkedList.getNumberOfElements();

        System.out.println("Test: delete the list.");
        linkedList.removeList();
        linkedList.printList();
        linkedList.getNumberOfElements();

        System.out.println("\n Test: exceptions and other cases.");
        linkedList.removeFirst();
        linkedList.removeElement(1);
        linkedList.printList();
        linkedList.getNumberOfElements();
        System.out.println("");
        linkedList.addLast("End");
        linkedList.printList();
        linkedList.getNumberOfElements();
        System.out.println("");
        linkedList.removeFirst();
        linkedList.printList();
        linkedList.getNumberOfElements();
    }
}