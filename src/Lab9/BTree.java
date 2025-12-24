
public static class BTree {

    private Node root;

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public BTree() {
        root = null;
    }

    public BTree doubleValues() {
        BTree tree = new BTree();
        doubleValuesHelper(this.root, tree);
        return tree;
    }

    private void doubleValuesHelper(Node cur, BTree tree) {
        if (cur == null) {
            return;
        }
        int doubledValue = cur.data * 2;
        tree.add(doubledValue);
        doubleValuesHelper(cur.left, tree);
        doubleValuesHelper(cur.right, tree);
    }

    public void add(int data) {
        root = add(root, data);
    }

    private Node add(Node cur, int data) {
        if (cur == null){
            return new Node(data);
        }
        if (data < cur.data){
            cur.left = add(cur.left, data);
        }
        else if (data > cur.data){
            cur.right = add(cur.right, data);
        }

        return cur;
    }

    public void printinorder() {
        printinorderhelper(root);
        System.out.println();
    }

    private void printinorderhelper(Node node) {
        if (node != null) {
            printinorderhelper(node.left);
            System.out.print(node.data + " ");
            printinorderhelper(node.right);
        }
    }

}



    public static void main(String[] args) {
        BTree tree = new BTree();

        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);


        System.out.print("original: ");
        tree.printinorder();

        BTree doubledTree = tree.doubleValues();

        System.out.print("2x: ");
        doubledTree.printinorder();
    }




