package Queue;

public class kQueue {
    int k;
    int n;
    int[] arr;
    int[] front;
    int[] rear;
    int[] next;
    int free;

    kQueue(int k,int n){
        this.k=k;
        this.n=n;
        this.arr=new int[n];
        this.front=new int[k];
        this.rear=new int[k];
        this.next=new int[n];

        for (int i=0;i<k;i++){
            front[i]=rear[i]=-1;
        }

        free=0;
        for (int i=0;i<n-1;i++){
            next[i]=i+1;
        }
        next[n-1]=-1;
    }

    private boolean isEmpty(int i){
        return front[i]==-1;
    }

    private boolean isFull(int i){
        return free==-1;
    }

    private void enqueue(int item, int i){
        if (isFull(i)){
            System.out.println("Overflow");
            return;
        }
        int nextFree=next[free];
        if (isEmpty(i)){
            rear[i]=front[i]=free;
        }
        else {
            next[rear[i]]=free;
            rear[i]=free;
        }
        next[free]=-1;
        arr[free]=item;
        free=nextFree;
    }

    private int dequeue(int i){
        if (isEmpty(i)){
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        int index=front[i];
        front[i]=next[index];
        next[index]=free;
        free=index;
        return arr[index];
    }

    public static void main(String[] args) {
        int k=3,n=10;
        kQueue kq=new kQueue(k,n);
        kq.enqueue(15,2);
        kq.enqueue(10,2);
        kq.enqueue(3,1);
        kq.enqueue(6,1);
        kq.enqueue(24,0);
        kq.enqueue(12,0);
        System.out.println(kq.dequeue(2));
        System.out.println(kq.dequeue(1));
        System.out.println(kq.dequeue(0));
    }
}
