package stack;

import java.util.Stack;

public class specialStack {
    int min=-1;
    static int demoVal=9999;
    Stack<Integer> stack=new Stack<>();

    void push(int val){
        if (stack.isEmpty() || val<min){
            min=val;
        }
        stack.push(val*demoVal+min);
        System.out.println("pushed: "+val);
    }

    int pop(){
        if (stack.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int val=stack.pop();
        if (!stack.isEmpty())
            min=stack.peek()%demoVal;
        else {
            min=-1;
        }
        System.out.println("popped: "+val/demoVal);
        return val/demoVal;
    }

    int peek(){
        return stack.peek()/demoVal;
    }
    void getMin(){
        System.out.println("Min: "+min);
    }

    public static void main(String[] args) {
        specialStack stack=new specialStack();
        int arr[]={1,4,6,3,7,9,12,};

        for (int i=0;i< arr.length;i++){
            stack.push(arr[i]);
            stack.getMin();
        }
        System.out.println();
        for (int i=0; i< arr.length;i++){
            stack.pop();
            stack.getMin();
        }
    }
}
