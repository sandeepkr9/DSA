package Queue;

public class DequeDoublyLinkedList {
    static class Node{
        int data;
        Node prev,next;
        static Node getNode(int data){
            Node newNode=new Node();
            newNode.data=data;
            newNode.next=newNode.prev=null;
            return newNode;
        }
    }

    static class Deque{
        int size;
        Node front,rear;
        Deque(){
           size=0;
           front=rear=null;
        }

        boolean isEmpty(){
            return (front==null);
        }

        int size(){
            return size;
        }

        void insertFront(int data){
            Node newNode=new Node();
            if(newNode==null){
                System.out.println("Stack Overflow");
            }else{
                if (front==null){
                    rear=front=newNode;
                }else{
                    newNode.next=front;
                    front.prev=newNode;
                    front=newNode;
                }
                size++;
            }
        }

        void insertRear(int data){
            Node newNode=new Node();
            if (newNode==null){
                front=rear=newNode;
            }else{
                if (rear==null)
                    rear=front=newNode;
                else {
                    newNode.prev=rear;
                    rear.next=newNode;
                    rear=newNode;
                }
            }
            size++;
        }

        void deleteFront(){
            Node newNode=new Node();
            if (front==null)
                System.out.println("Underflow");
            else{
                Node temp=front;
                front=front.next;
                if (front==null)
                    rear=null;
                else{
                    front.prev=null;
                }
                size--;
            }
        }

        void deleteRear(){
            Node newNode=new Node();
            if (front==null)
                System.out.println("Underflow");
            else {
                Node temp=rear;
                rear=rear.prev;
                if (rear==null)
                    front=null;
                else rear.next=null;
            }
            size--;
        }

        int getFront(){
            if (isEmpty())
                return -1;
            return front.data;
        }

        int getRear(){
            if (isEmpty())
                return -1;
            return rear.data;
        }

        void erase(){
            rear=null;
            while(front!=null){
                Node temp=front;
                front=front.next;
            }
            size=0;
        }
    }

    public static void main(String[] args) {
        Deque dq=new Deque();
        dq.insertRear(5);
        dq.insertFront(10);
        dq.insertRear(12);
        dq.insertFront(15);
        dq.deleteRear();
        dq.insertRear(13);
        System.out.println(dq.getFront());
    }
}
