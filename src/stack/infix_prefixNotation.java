package stack;

import java.util.Stack;

public class infix_prefixNotation {
    static boolean isAlpha(char c){
        if (c>='a' && c<='z' || c>='A' && c<='Z'){
            return true;
        }
        return false;
    }

    static boolean isDigit(char c){
        if (c>='0' && c<='9'){
            return true;
        }
        return false;
    }

    static boolean isOperands(char c){
        return (!isAlpha(c) && !isDigit(c));
    }

    static int getPriority(char C){
        if (C=='-' || C=='+')
            return 1;
        else if(C=='*' || C=='/')
            return 2;
        else if (C=='^')
            return 3;
        return 0;
    }

    static String rev(char str[], int start, int end){
        char temp;
        while (start<end){
            temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(str);
    }

    static String infixToPostfix(char[] in1){
        String in='('+String.valueOf(in1)+')';
        int l=in.length();
        Stack<Character> cs=new Stack<>();
        String out="";
        for (int i=0; i<l; i++){
            if (isAlpha(in.charAt(i)) || isDigit(in.charAt(i))){
                out+=in.charAt(i);
            }else if (in.charAt(i)=='(')
                cs.add('(');
            else if (in.charAt(i)==')'){
                while (cs.peek() != '('){
                    out+=cs.peek();
                    cs.pop();
                }
                cs.pop();
            }
            else{
                if (isOperands(cs.peek())){
                    while ((getPriority(in.charAt(i))<getPriority(cs.peek())) || (getPriority(in.charAt(i)) <= getPriority(cs.peek()) && in.charAt(i)=='^')){
                        out+=cs.peek();
                        cs.pop();
                    }
                    cs.add(in.charAt(i));
                }
            }
        }
        while (!cs.empty()){
            out+=cs.pop();
        }
        return out;
    }

    static String infixToPrefix(char[] in){
        int l=in.length;
        String in1=rev(in,0,l-1);
        in=in1.toCharArray();
        for (int i=0;i<l;i++){
            if (in[i]=='('){
                in[i]=')';
                i++;
            }else if (in[i]==')'){
                in[i]='(';
                i++;
            }
        }

        String prefix=infixToPostfix(in);
        prefix=rev(prefix.toCharArray(),0,l-1);
        return prefix;
    }

    public static void main(String[] args) {
        String s=("x+y*z/w+u");
        System.out.println(infixToPrefix(s.toCharArray()));
    }
}
