package stack;

import java.util.Stack;

public class postfixToInfix {
    static boolean isOperand(char c){
        return (c>='a' && c<='z')||(c>='A' && c<='Z');
    }

    static String getInfix(String exp){
        Stack<String> s=new Stack<>();
        for (int i=0; i<exp.length(); i++){
            if (isOperand(exp.charAt(i))){
                s.push(exp.charAt(i)+"");
            }
            else {
                String op1=s.peek();
                s.pop();
                String op2=s.peek();
                s.pop();
                s.push("("+op1+exp.charAt(i)+op2+")");
            }
        }
        return s.peek();
    }

    public static void main(String[] args) {
        String exp="ab*c+";
        System.out.println(getInfix(exp));
    }
}
