

import java.io.IOException;

class Node<E>{                   
    E value;                    
    Node next;                  

    public Node(){}            

    public Node(E value){      
        this.value = value;    
        this.next = null;      
    }

    public Node(E value, Node next){  
        this.value = value;           
        this.next = next;             
    }

    public E getValue(){                
        return value;
    }

    public void setValue(E value){      
        this.value = value;

    }

    public Node getNext(){      
        return next;
    }

    public void setNext(Node next){ 
        this.next = next;
    }
}

public class myList<E> {   
    private Node fe;       
    private Node le;       
    int length = 0;       

    public myList(){    

    }


    public myList (myList copying){
        this.fe = copying.fe;
        this.le = copying.le;
        this.length = copying.length;
    }

    public void add (E element){                 
        if(fe != null) {                           
            Node newNode = new Node(element);      
            newNode.setNext(fe);                   
            fe = newNode;                          
            length++;                              
        }
        else {                                     
            Node newNode = new Node(element);
            fe = newNode;                          
            le = newNode;                          
            length++;
        }

    }

    public void addLast(E element){
        if(le != null){
            Node newNode = new Node(element);
            le.setNext(newNode);
            le = newNode;
            length++;
        }
        else{
            le = new Node(element);
            length++;
        }
    }

    public void removeFirst() throws Exception {
        if(fe == null) {
            throw new Exception("List is empty");
        }
        else {
            fe = fe.getNext();
            length--;
        }
    }

    public void removeAtValue(E valueToRemove) throws Exception{
        Node tmp = fe;
        int exc = length;
        while(tmp != null){
            if(tmp.getNext().value == valueToRemove) {
                tmp.setNext(tmp.getNext().getNext());
                length--;
                break;
            }
            tmp = tmp.next;
        }
        if(exc == length)
            throw new Exception("Value to remove not found");
    }

    public int getLength(){
        return length;
    }

    public void clear(){
        fe = null;
        le = null;
        length = 0;
    }
                                     
    public String toString(){                       
        String str = "";                             
        Node tmp = fe;                               
        while(tmp != null){                          
            str += tmp.value + " ";
            tmp = tmp.next;
        }
        return str;
    }


}


