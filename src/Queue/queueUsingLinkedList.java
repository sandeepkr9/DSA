package Queue;

import java.util.Queue;

public class queueUsingLinkedList {
    static class Node{
        int key;
        Node next;
        public  Node(int key){
            this.key=key;
            this.next=null;
        }
    }
    Node front,rear;
    public queueUsingLinkedList(){
        this.front=this.rear=null;
    }

    void enqueue(int key){
        Node temp=new Node(key);
        if (this.rear==null){
            this.front=this.rear=temp;
            return;
        }
        this.rear.next=temp;
        this.rear=temp;
        return;
    }

    void dequeue(){
        if (this.front==null)
            return;
        Node temp=this.front;
        this.front=this.front.next;
        if (this.front==null)
            this.rear=null;
    }

    public void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        dequeue();
        enqueue(50);
        System.out.println((front!=null)?(front).key:-1);
        System.out.println((rear!=null)?(rear).key:-1);
    }
}
