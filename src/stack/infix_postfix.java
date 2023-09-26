package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class infix_postfix {
    static int prec(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static String infixToPostfix(String exp){
        String res=new String("");
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0; i<=exp.length();++i){
            char c=exp.charAt(i);
            if (Character.isLetterOrDigit(c)){
                res+=c;
            }
            else if(c=='('){
                stack.push(c);
            }
            else if (c==')'){
                while (!stack.isEmpty()){
                    if (stack.peek()!='('){
                        res+=stack.peek();
                        stack.pop();
                    }
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && prec(c)<=prec(stack.peek())){
                    res+=stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            if (stack.peek()=='(') {
                return "Invalid Expression";
            }
            return res+=stack.peek();
            stack.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        String exp="a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
}
