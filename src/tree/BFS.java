package tree;

public class BFS {
    static class Node{
        int key;
        Node left,right;
        Node(int data){
            key=data;
            left=right=null;
        }
    }
    Node root;

    int height(Node root){
        if (root==null)
            return 0;
        else{
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            if (leftHeight>rightHeight){
                return leftHeight+1;
            }else
                return rightHeight+1;
        }
    }

    void printCurrentLevel(Node root,int lev){
        if (root==null)
            return;
        if (lev==1){
            System.out.print(root.key+" ");
        }else if (lev>1){
            printCurrentLevel(root.left,lev-1);
            printCurrentLevel(root.right,lev-1);
        }
    }

    public BFS(){
        root=null;
    }

    void printLevelOrder(){
        int h=height(root);
        for (int i=0;i<=h;i++){
            printCurrentLevel(root,i);
        }
    }

    public static void main(String[] args) {
        BFS bfs=new BFS();
        bfs.root=new Node(1);
        bfs.root.left=new Node(2);
        bfs.root.right=new Node(3);
        bfs.root.left.left=new Node(4);
        bfs.root.right.left=new Node(5);
        bfs.root.right.right=new Node(6);
        bfs.printLevelOrder();

    }
}
