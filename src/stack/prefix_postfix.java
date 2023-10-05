package stack;

import java.util.Stack;

public class prefix_postfix {
    static boolean isOperator(char x){
        switch (x){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }

    static String prefixToPostfix(String exp){
        Stack<String> stack=new Stack<>();
        int len=exp.length();
        for (int i=len-1;i>=0;i--){
            if (isOperator(exp.charAt(i))){
                String op1=stack.peek();
                stack.pop();
                String op2=stack.peek();
                stack.pop();
                String temp=op1+op2+exp.charAt(i);
                stack.push(temp);
            }else
                stack.push(exp.charAt(i)+"");
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String exp="*-ab-/cde";
        System.out.println("postfix "+prefixToPostfix(exp));
    }
}
