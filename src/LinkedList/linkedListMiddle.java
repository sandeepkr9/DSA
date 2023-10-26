package LinkedList;

import java.util.ArrayList;

public class linkedListMiddle {
    static class Node{
        int data;
        Node next;
    }

    static void push(Node[] head, int data){
        Node node = new Node();
        node.data=data;
        node.next=head[0];
        head[0]=node;
    }

    public static void main(String[] args) {
        Node[] head=new Node[1];
        linkedListMiddle lm=new linkedListMiddle();
        for (int i=5; i>0; i--)
            lm.push(head,i);
        ArrayList<Integer> arr=new ArrayList<>();
        Node curr=head[0];
        while(curr !=null){
            arr.add(curr.data);
            curr=curr.next;
        }
        System.out.println(arr.get(arr.size()/2));
    }
}
