/// I'm defending option 13 (because I'm 28 on the list, and the number 13 is lucky)
class Node<T> {
    T data;
    Node<T> left, right;

    Node(T data) {
        this.data = data;
    }
}

public class Protect<T extends Comparable<T>> {
    private Node<T> bace;
    int fullNodeCount=0;

    Protect() {
        bace = null;
    }


    //Adding an element to the tree
    public void adding(T data) {
        bace = adding(bace, data);
    }

    private Node<T> adding(Node<T> bace, T data) {
        if (bace == null) {
            return new Node<T>(data);
        }

        else if (data.compareTo(bace.data) < 0) {
            bace.left = adding(bace.left, data);
        }

        else if (data.compareTo(bace.data) > 0) {
            bace.right = adding(bace.right, data);
        } 

        else {}

        return bace;
    }


    //Determining the number of full nodes in the tree
    public  int fullNode(){
        fullNodeCount = 0;
        fullNodeLoop(bace);
        
        return  fullNodeCount;
    }
    private  void  fullNodeLoop(Node<T> bace){
        if (bace!=null){
            fullNodeLoop(bace.left);
            if (bace.left != null && bace.right != null)
                fullNodeCount++;
            fullNodeLoop(bace.right);
        }
    }

}