public class myList <E> {
    public myList() {
        super();
    }
    E data;                             //может быть переменная произвольного типа
    myList next;                        //указатель на следующий элемент
    myList head;                        //указатель на первый элемент списка
    myList tail;                        //указатель на последний элемент списка
    int numberOfElements;               // кол-во элементов в списке

    public void addFirst(E data) {       //добавить в начало списка
        myList element = new myList();    //создаём новый элемент
        element.data = data;              //указатель на следующий элемент автоматически null
        if (head == null) {               //если пуст, то указываем ссылки начала и конца на новый эл-т
            head = element;               //т.е. список теперь состоит из одного элемента
            tail = element;
        }
        else {
            element.next = head;          //иначе новый элемент теперь ссылается на "бывший" первый
            head = element;
        }
        numberOfElements++;
    }

    public void addLast(E data) {       //добавить в конец списка
        myList element = new myList();
        element.data = data;
        if (tail == null) {
            head = element;
            tail = element;
        }
        else {
            tail.next = element;
            tail = element;
        }
        numberOfElements++;
    }

    public void getNumberOfElements() {              //печать количества эл-тов списка
        System.out.println("\t Number of elements: " + numberOfElements);
    }

    public void removeFirst() {             //удаление первого эл-та списка
        if (head == null) {
            System.out.println("\t Impossible to delete an element. The list is null.");
        }
        else {
            myList element = head;
            head = element.next;
            element.data = null;
            numberOfElements--;
        }
    }

    public void removeElement(E data) {             //удаление любого эл-та списка
        if (head == null & tail == null) {          //пустой
            System.out.println("\t Impossible to delete an element. The list is null.");
            return;
        }
        myList element = head;
        while (element.data != data) {
            element = element.next;
            if (element == null){                           //нет в списке
                System.out.println("\t Impossible to delete an element. This value isn't in the list.");
                return;
            }
            else if (element == head & element == tail){    //единственный
                element.data = null;
                head = tail = null;
                return;
            }
            else if (element == head){                      //первый
                head = element.next;
                numberOfElements--;
                return;
            }
            else if (element.next == tail){                //последний
                if ((element.next).data == data) {
                    tail = element;
                    element.next = null;
                    numberOfElements--;
                    return;
                }
            }

            else if (element.next != null) {                //любой другой
                if ((element.next).data == data) {
                    element.next = element.next.next;
                    numberOfElements--;
                    return;
                }
            }
        }

    }

    public void removeList() {             //удаление списка
        myList element = head;
        while (element != null) {
            element.data = null;
            element = element.next;
        }
        head = null;
        tail = null;
        numberOfElements = 0;
    }


    public void printList() {             //печать списка
        myList element = head;
        System.out.print("\t Elements of list: ");
        while (element != null) {
            System.out.print(element.data + " ");
            element = element.next;
        }
        System.out.println("");
    }
}