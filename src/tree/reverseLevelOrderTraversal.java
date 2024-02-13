package tree;

public class reverseLevelOrderTraversal {
    static class Node{
        int key;
        Node left,right;
        Node(int data){
            key=data;
            left=right=null;
        }
    }
    Node root;

    void printGivenLevel(Node node,int lev){
        if (node ==null)
            return;
        if (lev==0)
            System.out.print(node.key+" ");
        else if(lev>0){
            printGivenLevel(node.left, lev-1);
            printGivenLevel(node.right,lev-1);
        }
    }

    int height(Node node){
        if (node==null)
            return 0;
        else {
            int leftHeight=height(node.left);
            int rightHeight=height(node.right);
            if (leftHeight>rightHeight)
                return leftHeight+1;
            else
                return rightHeight+1;
        }
    }

    void reverseLevelOrder(Node node){
        int h=height(node);
        for (int i=0;i<=h;i++){
            printGivenLevel(node,i);
        }
    }

    public static void main(String[] args) {
        reverseLevelOrderTraversal rlo=new reverseLevelOrderTraversal();
        rlo.root=new Node(9);
        rlo.root.left=new Node(8);
        rlo.root.right=new Node(7);
        rlo.root.left.left=new Node(6);
        rlo.root.left.right=new Node(5);
        rlo.root.right.right=new Node(4);
        rlo.root.right.left=new Node(3);
        rlo.reverseLevelOrder(rlo.root);
    }
}
