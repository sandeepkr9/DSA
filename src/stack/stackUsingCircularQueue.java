package stack;

public class stackUsingCircularQueue {
    private int front,rear,size;
    private int capacity;
    private int[] arr;
    public stackUsingCircularQueue(int capacity){
        this.capacity=capacity;
        front=size=0;
        rear=capacity-1;
        arr=new int[this.capacity];
    }

    public boolean isFull(){
        return (size==capacity);
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public void push(int x){
        if (isFull()){
            return;
        }
        rear=(rear+1)%capacity;
        arr[rear]=x;
        size++;
    }

    public void pop(){
        if (isEmpty())
            return;
        front=(front+1)%capacity;
        size--;
    }

    public int top(){
        if (isEmpty())
            return -1;
        return arr[front];
    }

    public int getSize(){
        if (isEmpty())
            return -1;
        return size;
    }

    public static void main(String[] args) {
        stackUsingCircularQueue scq=new stackUsingCircularQueue(10);
        scq.push(10);
        scq.push(20);
        scq.push(30);
        scq.push(40);
        scq.pop();
        System.out.println(scq.top());
        System.out.println(scq.getSize());
        scq.pop();
        scq.push(50);
        System.out.println(scq.getSize());
        System.out.println(scq.top());
    }
}
