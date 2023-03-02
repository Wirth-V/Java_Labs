//Variant_25

public class testList {	
	public static void main(String[] args) throws Exception {
	
		testList test = new testList();

		myList list = new myList();

		//adding an item to the top of the list
		list.add_first("world!\n");
		list.add_first(" Hellow,");
		list.add_first("345");
		list.add_first("123");

		//printing a list
		list.print_list();

		//adding an element element to a given list position
		list.add_element(3, "dear");

		//printing a list
		list.print_list();
	}
}