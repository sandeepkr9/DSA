package LinkedList;

public class linkedListSearchRecursive {
    private static Node head;
    static class Node{
        int key;
        Node next;
        Node(int d){
            key=d;
            next=null;
        }
    }

    static void push(int key){
        Node node=new Node(key);
        node.next=head;
        head=node;
    }

    static boolean search(Node head, int key){
        if (head==null){
            return false;
        }
        if (head.key==key){
            return true;
        }
        return search(head.next,key);
    }

    public static void main(String[] args) {
        linkedListSearchRecursive lsr=new linkedListSearchRecursive();
        lsr.push(10);
        lsr.push(20);
        lsr.push(30);
        lsr.push(40);
        System.out.println(lsr.search(head, 30));
    }
}
