package LinkedList;

import java.util.Vector;

public class linkedListSearch {
    static class Node{
        int key;
        Node next;
        Node(int key){
            this.key=key;
            this.next=null;
        }
    }

    static void push(Node[] ref,int key){
        Node node=new Node(key);
        node.next=ref[0];
        ref[0]=node;
    }

    public static void main(String[] args) {
        Node[] head=new Node[1];
        int x=21;
        push(head,11);
        push(head,20);
        push(head,30);
        push(head,40);

        Vector<Integer> vector=new Vector<>();
        Node temp=head[0];
        while (temp!=null){
            vector.add(temp.key);
            temp=temp.next;
        }
        int i=vector.indexOf(x);
        if (i==-1){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
