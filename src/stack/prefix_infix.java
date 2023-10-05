package stack;

import java.util.Stack;

public class prefix_infix {
    static boolean isOperator(char x){
        switch(x){
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

    public static String convert(String s){
        Stack<String> stack=new Stack<>();
        int len=s.length();
        for (int i=len-1; i>=0; i--){
            char c=s.charAt(i);
            if (isOperator(c)){
                String op1=stack.pop();
                String op2=stack.pop();
                String temp="("+op1+c+op2+")";
                stack.push(temp);
            }
            else{
                stack.push(c+"");
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String s="*-ab/-cdo";
        System.out.println("Infix "+convert(s));
    }
}
