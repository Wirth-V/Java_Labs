public class myList<E>
{
	public myList()
	{
		super();
	}
	public myList(myList myList)
	{
		this.head = myList.head;
		this.tail = myList.tail;
		this.n = myList.n;
	}
	nodeList head; 
	nodeList tail; 
	int n;
	public class nodeList<E>
	{
		public nodeList()
		{
			super();
		}
		E data;
		nodeList next;
	}
	public void add_first(E data)
	{
		nodeList a = new nodeList();
		a.data = data;
		if(head == null) 
		{
			head = a; 
			tail = a;
		}
		else 
		{
			a.next = head;
			head = a; 
		}
		n++;
	}
	public void printList()
	{   
		nodeList t = head;
		while (t != null)
		{
			System.out.print(t.data + " ");
			t = t.next;
		}
	}
	public void add_index(int x, E data)
	{
		if (x>n) 
		{
			System.out.println("Resize.");
			return;
		}
		int j = 0;
		nodeList<E> a = new nodeList<E>();
		nodeList<E> b = new nodeList<E>();
		nodeList<E> tmp = new nodeList<E>();
		a = head;
		while(a.next != null)
		{
			a = a.next ;
		}
		a.next=b;
		a = head;
		for (j = 0; j < x;j++) 
		{
			a = a.next;
		}
		b.data = a.data;
		a.data = data;
		n++;
		while(a.next != null) 
		{
			a = a.next;
			tmp.data = a.data;
			a.data = b.data;
			b.data = tmp.data;
		}
	}
}