package Queue;

import java.util.Stack;

public class dequeueOperationCostly {
    static class Queue{
        Stack<Integer> stack1;
        Stack<Integer> stack2;
    }

    static void push(Stack<Integer> top, int data){
        top.push(data);
    }

    static int pop(Stack<Integer> top){
        if (top.isEmpty())
            return -1;
        return top.pop();
    }

    static void enqueue(Queue queue, int data){
        push(queue.stack1,data);
    }

    static int dequeue(Queue queue){
        int data;
        if (queue.stack1.isEmpty() && queue.stack2.isEmpty()){
            return -1;
        }
        if (queue.stack2.isEmpty()){
            while (!queue.stack1.isEmpty()){
                data=pop(queue.stack1);
                push(queue.stack2,data);
            }
        }
        data=pop(queue.stack2);
        return data;
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.stack1=new Stack<>();
        queue.stack2=new Stack<>();
        enqueue(queue,10);
        enqueue(queue,20);
        enqueue(queue,30);
        System.out.println(dequeue(queue));
        enqueue(queue, 40);
        System.out.println(dequeue(queue));
    }
}
