package LinkedList;

public class lengthLinkedListIterative {
    private static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    static void push(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }

    static int getCount(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp= temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        lengthLinkedListIterative lli=new lengthLinkedListIterative();
        lli.push(10);
        lli.push(20);
        lli.push(30);
        lli.push(40);
        System.out.println(lli.getCount());
    }
}
