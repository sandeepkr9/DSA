package Queue;

import java.util.Stack;

public class functionCallStack {
    static class Queue{
        Stack<Integer> stack1;
    }

    static void push(Stack<Integer> top, int data){
        top.push(data);
    }

    static int pop(Stack<Integer> top){
        if (top==null)
            return -1;
        return top.pop();
    }

    static void enqueue(Queue queue,int data){
        push(queue.stack1,data);
    }

    static int dequeue(Queue queue){
        int data, res=0;
        if (queue.stack1.isEmpty()){
            return -1;
        }else if (queue.stack1.size()==1){
            return pop(queue.stack1);
        }else {
            data=pop(queue.stack1);
            res=dequeue(queue);
            push(queue.stack1, data);
            return res;
        }
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.stack1=new Stack<>();
        enqueue(queue,10);
        enqueue(queue,20);
        enqueue(queue,30);
        System.out.println(dequeue(queue));
    }
}
