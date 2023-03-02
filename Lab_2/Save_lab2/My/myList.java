//Variant_25
public class myList <E> {

    E data; 
    
    myList head, next, last;    
    
    int n; 
 
    public myList(){}  

    public myList (myList list){
        this.head = list.head;
        this.next = list.next;
        this.n = list.n;
    }

    //adding an item to the top of the list
    public void add_first(E data) { 
        myList a = new myList();  
        a.data = data;    
                                          
        if (head == null) {              
            head = a;               
            last = a;
        }
        else {
            a.next = head;          
            head = a;
        }

        n++;
    }

    //adding an element element to a given list position
    public void add_element(int x, E data)
	{
		myList a = new myList();
		myList b = new myList();
		myList c = new myList(); //need to castling value

		a = head;

		while( a.next != null ){
			a = a.next ;
		}

		a.next=b;
		a = head;

		for ( int i = 0; i < x; i++ ){
			a = a.next;
		}

		b.data = a.data;
		a.data = data;
		n++;

		while( a.next != null ) {
			a = a.next;
			c.data = a.data;
			a.data = b.data;
			b.data = c.data;
		}

        //Exception
        if ( x > n ) 
		{
			System.out.println("The position is too big");
			return;
		}
	}
    

    public int how_many_elements() {              
       return n;
    }

    
    //printing a list
    public void print_list() {          
        myList a = head;

        System.out.println("");
        System.out.print("Elements of list: ");

        while (a != null) {
            System.out.print(a.data + " ");
            a = a.next;
        }

        System.out.println("");
    }
}
