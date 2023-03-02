//Ivanov
public class testList 
{
	public testList()
	{
		super();
	}

	public static void main(String[] args) 
	{
		int z = 2;
		testList testList = new testList();
		myList l = new myList();
		l.add_first("128");
		l.add_first("237");
		l.add_first("536");
		l.add_first("535");
		l.add_first("534");
		l.add_first("533");
		l.add_first("532");
		l.add_first("531");
		l.printList();
		System.out.println();
		l.add_index(2, "333");
		l.printList();
	}
}