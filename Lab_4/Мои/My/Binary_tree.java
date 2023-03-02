class Node<T> {
    T data;
    Node<T> left, right;

    Node(T data) {
        this.data = data;
    }
}

public class Binary_tree<T extends Comparable<T>> {
    private Node<T> base;
    int size = 0;

    Binary_tree() {
         base = null;
    }

    public Binary_tree(Binary_tree other) {
        this.base = other.base;
        this.size=other.size;
        copy(other.base);
    }

    //
       public void insert(T data) {
        base = insert(base, data);
        size++;
    }


    private Node<T> insert(Node<T> base, T data) {
        if (base == null) {
            return new Node<T>(data);
        }
        else if (data.compareTo(base.data) < 0) {
            base.left = insert(base.left, data);
        }
        else if (data.compareTo(base.data) > 0) {
            base.right = insert(base.right, data);
        } else {}

        return base;
    }

    public Node<T> copy(Node<T> base) {
        if (base == null) return null;
        Node<T> newNode = new Node<T>(base.data);
        newNode.left = copy(base.left);
        newNode.right = copy(base.right);
        return newNode;
    }

     boolean search(T data) {
        Node<T> addroot=this.base;
        addroot = searchLoop(addroot, data);
        if (addroot != null)
            return true;
        else
            return false;
    }

    private Node<T> searchLoop(Node<T> root2, T data) {
        if (root2 == null || data.compareTo(root2.data) == 0) {
            return root2;
        }
        if (data.compareTo(root2.data) < 0) {
            return searchLoop(root2.left, data);
        }
        return searchLoop(root2.right, data);
    }
 
    public void delete(T data) {
        base = delete(base, data);
        size--;
    }

    public void deleteAll() {
        this.base = null;
        this.size = 0;
    }

    private Node<T> delete(Node<T> base, T data) {
        if (base == null) {
            return null;
        }

        else if (data.compareTo(base.data) < 0) {
            base.left = delete(base.left, data);
        }

        else if (data.compareTo(base.data) > 0) {
            base.right = delete(base.right, data);
        }

        else {
            if (base.left == null && base.right == null) {
                return null;
            }

            else if (base.right == null) {
                return base.left;
            }

            else if (base.left == null) {
                return base.right;
            }

            else {
                base.data = findMax(base.left);
                base.left = delete(base.left, base.data);
            }
        }

        return base;
    }


    private T findMax(Node<T> base) {

        while (base.right != null) {
            base = base.right;
        }

        return base.data;
    }

}
