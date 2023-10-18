package Queue;

import java.util.Stack;

public class QStack {
    static class Queue{
        static Stack<Integer> s1=new Stack<Integer>();
        static Stack<Integer> s2=new Stack<>();
        static void enqueue(int data){
            while(!s1.isEmpty())
                s2.push(s1.pop());
            s1.push(data);
            while (!s2.isEmpty())
                s1.push(s2.pop());
        }

        static int dequeue(){
            if (s1.isEmpty())
                return -1;
            int data=s1.peek();
            s1.pop();
            return data;
        }
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);
        System.out.println(queue.dequeue());
    }
}
