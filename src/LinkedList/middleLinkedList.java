package LinkedList;

public class middleLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(Node next,int data){
            this.data=data;
            this.next=next;
        }
    }

    void push(Node headd, int data){
        Node node=new Node(headd,data);
        head=node;
    }

    void printList(Node head){
        while(head != null){
            System.out.println(head.data);
            head=head.next;
        }
        System.out.println("null");
    }

    void printMiddle(Node head){
        int count=0;
        Node mid=head;
        while (head!=null){
            if ((count % 2)==1)
                mid=mid.next;
            ++count;
            head=head.next;
        }
        if (mid != null)
            System.out.println(mid.data);
    }

    public static void main(String[] args) {
        middleLinkedList ml=new middleLinkedList();
        for (int i=5; i>=1; i--){
            ml.push(head,i);
            ml.printList(head);
            ml.printMiddle(head);
        }
    }
}
