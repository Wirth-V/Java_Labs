class Node<T> {
    T data;
    Node<T> left, right;

    Node(T data) {
        this.data = data;
    }
}

public class BST<T extends Comparable<T>> {
    private Node<T> root;
    int fullNodeCount=0;

    BST() {
        root = null;
    }

    public void insert(T data) {
        root = insert(root, data);
    }

    private Node<T> insert(Node<T> root, T data) {
        if (root == null) {
            return new Node<T>(data);
        }
        else if (data.compareTo(root.data) < 0) {
            root.left = insert(root.left, data);
        }
        else if (data.compareTo(root.data) > 0) {
            root.right = insert(root.right, data);
        } else {}

        return root;
    }

    public  int findFullNode(){
        fullNodeCount = 0;
        findFullNodeLoop(root);
        return  fullNodeCount;
    }
    private  void  findFullNodeLoop(Node<T> root){
        if (root!=null){
            findFullNodeLoop(root.left);
            if (root.left != null && root.right != null)
                fullNodeCount++;
            findFullNodeLoop(root.right);
        }
    }

}