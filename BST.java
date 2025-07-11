class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BST {
    Node root;

    public BST() {
        this.root = null;
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            insertRec(root, newNode);
        }
    }

    private void insertRec(Node current, Node newNode) {
        if (newNode.data < current.data) {
            if (current.left == null) {
                current.left = newNode;
            } else {
                insertRec(current.left, newNode);
            }
        } else {
            if (current.right == null) {
                current.right = newNode;
            } else {
                insertRec(current.right, newNode);
            }
        }
    }

    private void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }
}
