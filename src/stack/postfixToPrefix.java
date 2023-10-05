package stack;

import java.util.Stack;

public class postfixToPrefix {
    static boolean isOperator(char c){
        switch (c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }

    static String postfixToPrefix(String exp){
        Stack<String> s=new Stack<>();
        for (int i=0; i<exp.length(); i++){
            if (isOperator(exp.charAt(i))){
                String op1=s.peek();
                s.pop();
                String op2=s.peek();
                s.pop();
                String temp=op1+op2+exp.charAt(i);
                s.push(temp);
            }else
                s.push(exp.charAt(i)+"");
        }
        String ans=" ";
        for (String i:s){
            ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {
        String exp="abc/-ak+l-*";
        System.out.println(postfixToPrefix(exp));
    }
}
