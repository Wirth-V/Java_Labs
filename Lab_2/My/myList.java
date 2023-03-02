public class myList <E> {

    E data; //может быть переменная произвольного типа
    
    myList head, next, last;    //ссылку на первый элемент списка, последний элемент списка и последний элемент списка, соовтетсвенно 
    
    int n; // n - число элементов списка
 
    //конструкторы копирования
    public myList(){}            

    public myList (myList copying){
        this.head = copying.head;
        this.next = copying.next;
        this.n = copying.n;
    }

    //добавление элемента в начало списка
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

    //в конец списка
    public void add_last(E data) {      
        myList a = new myList();
        a.data = data;

        if (last == null) {
            head = a;
            last = a;
        }
        else {
            last.next = a;
            last = a;
        }
        n++;
    }


    //удаление элемента из начала списка
    public void delit_first() {
    
        if (head == null) {
            System.out.println("The first element equal null.");
        }

        else {
            myList a = head;
            head = a.next;
            a.data = null;
            n--;
        }
    }

    //удаление элемента по значению
    public void delit_element(E data) {             


        //При пустом
        if (head == null & last == null) {          
            System.out.println("This element  is empty.");
            return;
        }

        myList a = head;

        while (a.data != data) {
            a = a.next;

            //отсутсвие в списке
            if (a == null){                           
                System.out.println("Absence from the list.");
                return;
            }

            // один в скписке
            if (a == head & a == last){   
                a.data = null;
                head = null;
                last = null;
                return;
            }

            //первый в списке
            if (a == head){                     
                head = a.next;
                n--;
                return;
            }

            //последний в списке
            if (a.next == last){               
                if ((a.next).data == data) {
                    last = a;
                    a.next = null;
                    n--;
                    return;
                }
            }

            // остальные 
            if (a.next != null) {               
                if ((a.next).data == data) {
                    a.next = a.next.next;
                    n--;
                    return;
                }
            }
        }

    }

    //получение числа элементов в списке
    public int how_many_elements() {              
       return n;
    }

    //очистка списка (удаление всех элементов)
    public void delit_list() {             
        myList a = head;

        while (a != null) {
            a.data = null;
            a = a.next;
        }

        head = null;
        last = null;
        n = 0;
    }


    public void print_list() {             //печать списка
        myList a = head;

        System.out.print("Elements of list: ");

        while (a != null) {
            System.out.print(a.data + " ");
            a = a.next;
        }

        System.out.println("");
    }
}
