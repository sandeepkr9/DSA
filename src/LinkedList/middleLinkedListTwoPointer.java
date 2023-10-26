package LinkedList;

public class middleLinkedListTwoPointer {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }

    public void push(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }

    public void printList(){
        Node pnode=head;
        while(pnode!=null){
            System.out.println(pnode.data);
            pnode=pnode.next;
        }
        System.out.println("null");
    }

    public void printMiddle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        middleLinkedListTwoPointer tp=new middleLinkedListTwoPointer();
        for (int i=5;i>=1;--i){
            tp.push(i);
            tp.printList();
            tp.printMiddle();
        }
    }
}
