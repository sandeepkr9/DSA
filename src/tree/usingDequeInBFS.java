package tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class usingDequeInBFS {
    static class Node{
        int key;
        Node left,right;
        Node(int data){
            key=data;
            left=right=null;
        }
    }

    Node root;

    void printSpiral(Node node){
        Deque<Node> deque=new ArrayDeque<>();
        deque.push(root);
        boolean rev=true;
        while (!deque.isEmpty()){
            int n=deque.size();
            if (rev==false){
                while (n-->0){
                    if (deque.peekFirst().left!=null)
                        deque.offerLast(deque.peekFirst().left);
                    if (deque.peekFirst().right!=null)
                        deque.offerLast(deque.peekFirst().right);
                    System.out.print(deque.pollFirst().key+" ");
                }
                rev=!rev;
            }else {
                while (n-->0){
                    if (deque.peekLast().right!=null)
                        deque.offerFirst(deque.peekLast().right);
                    if (deque.peekLast().left!=null)
                        deque.offerFirst(deque.peekLast().left);
                    System.out.print(deque.pollLast().key+" ");
                }
                rev=!rev;
            }
        }
    }

    public static void main(String[] args) {
        usingDequeInBFS dequeInBFS=new usingDequeInBFS();
        dequeInBFS.root=new Node(1);
        dequeInBFS.root.left=new Node(2);
        dequeInBFS.root.right=new Node(3);
        dequeInBFS.root.left.left=new Node(4);
        dequeInBFS.root.left.right=new Node(5);
        dequeInBFS.root.right.right=new Node(6);
        dequeInBFS.root.right.left=new Node(7);
        dequeInBFS.printSpiral(dequeInBFS.root);
    }
}
