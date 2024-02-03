package tree;

public class InorderMorrisTraversal {
    static class Node {
        int key;
        Node left, right;

        Node(int data) {
            key = data;
            left = right = null;
        }
    }

    Node root;

    public void Inorder() {
        Node curr = root;
        while (curr != null) {
            if (curr.left == null) {
                System.out.print(curr.key +" ");
                curr = curr.right;
            } else {
                Node temp = curr.left;
                while (temp.right != null && temp.right != curr)
                    temp = temp.right;
                    if (temp.right == null) {
                        temp.right = curr;
                        curr = curr.left;
                    } else {
                        temp.right = null;
                        System.out.print(curr.key + " ");
                        curr = curr.right;
                    }

            }
        }
    }

    public static void main(String[] args) {
        InorderMorrisTraversal tree = new InorderMorrisTraversal();
        tree.root = new Node(9);
        tree.root.right = new Node(8);
        tree.root.left = new Node(7);
        tree.root.left.left = new Node(6);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(4);
        tree.root.right.left = new Node(3);
        tree.Inorder();
    }
}
