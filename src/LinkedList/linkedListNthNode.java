package LinkedList;

public class linkedListNthNode {
    static Node head;
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

    static int getNth(int i){
        Node curr=head;
        int count=0;
        while(curr!=null){
            if (count==i)
                return curr.data;
            count++;
            curr=curr.next;
        }
        assert false;
        return 0;
    }

    public static void main(String[] args) {
        linkedListNthNode lnn=new linkedListNthNode();
        lnn.push(10);
        lnn.push(20);
        lnn.push(30);
        lnn.push(40);
        System.out.println(lnn.getNth(2));
    }
}
