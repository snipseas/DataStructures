package Lab9;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    private Node root;
    public void insert(int data) {
        root = insertRec(root, data);
    }
    private Node insertRec(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = insertRec(current.left, data);
        } else if (data > current.data) {
            current.right = insertRec(current.right, data);
        }
        return current;
    }
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }
    private void inorderRec(Node current) {
        if (current == null) return;
        inorderRec(current.left);
        System.out.print(current.data + " ");
        inorderRec(current.right)  ;
    }
}

class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] values = {8, 7, 12, 15, 2, 5};
        for (int v : values) {
            tree.insert(v);
        }
        tree.inorder();
    }
}
