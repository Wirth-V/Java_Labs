class Node<T> {
    T data;
    Node<T> left, right;

    Node(T data) {
        this.data = data;
    }
}

public class Binary_tree<T extends Comparable<T>> {
    private Node<T> root;
    int size=0;

    Binary_tree() {
        root = null;
    }

    public Binary_tree(Binary_tree another) {
        this.root = another.root;
        this.size=another.size;
        cloneTree(another.root);
    }

    public Node<T> cloneTree(Node<T> root) {
        if (root == null) return null;
        Node<T> newNode = new Node<T>(root.data);
        newNode.left = cloneTree(root.left);
        newNode.right = cloneTree(root.right);
        return newNode;
    }

    public void insert(T data) {
        root = insert(root, data);
        size++;
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


    public void delete(T data) {
        root = delete(root, data);
        size--;
    }

    public void deleteAll() {
        this.root = null;
        this.size=0;
    }

    private Node<T> delete(Node<T> root, T data) {
        if (root == null) {
            return null;
        }
        else if (data.compareTo(root.data) < 0) {
            root.left = delete(root.left, data);
        }
        else if (data.compareTo(root.data) > 0) {
            root.right = delete(root.right, data);
        }
        else {
            if (root.left == null && root.right == null) {
                return null;
            }
            else if (root.right == null) {
                return root.left;
            }
            else if (root.left == null) {
                return root.right;
            }
            else {
                root.data = findMax(root.left);
                root.left = delete(root.left, root.data);
            }
        }

        return root;
    }


    private T findMax(Node<T> root) {
        while (root.right != null) {
            root = root.right;
        }

        return root.data;
    }

    boolean search(T data) {
        Node<T> addroot=this.root;
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

    void inorder() { //доп. методы для проверки
        inorder_Recursive(root);
    }

    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.data + " ");
            inorder_Recursive(root.right);
        }
    }
}
