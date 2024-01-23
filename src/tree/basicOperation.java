package tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class basicOperation {
    public static void printParent(int node,Vector<Vector<Integer>> adj,int parent){
        if (parent==0){
            System.out.println(node+"->Root");
        }else
            System.out.println(node+"->"+parent);
        for (int i=0;i<adj.get(node).size();i++){
            if (adj.get(node).get(i)!=parent){
                printParent(adj.get(node).get(i),adj,node);
            }
        }
    }
    public static void printChildren(int Root, Vector<Vector<Integer>> adj){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(Root);
        int vis[]=new int[adj.size()];
        Arrays.fill(vis,0);
        while (queue.size()!=0){
            int node= queue.peek();
            queue.remove();
            vis[node]=1;
            System.out.println(node+"->");
            for (int i=0;i<adj.get(node).size();i++){
                if (vis[adj.get(node).get(i)]==0){
                    System.out.print(adj.get(node).get(i)+"      ,");
                    queue.add(adj.get(node).get(i));
                }
            }
        }
    }
    public static void printNodeLeaf(int Root,Vector<Vector<Integer>> adj){
        for (int i=1;i<adj.size();i++){
            if (adj.get(i).size()==1 && i!=Root){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void printDegree(int Root,Vector<Vector<Integer>> adj){
        for (int i=1;i<adj.size();i++){
            System.out.print(i+" : ");
            if (i==Root){
                System.out.println(adj.get(i).size());
            }else {
                System.out.println(adj.get(i).size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int N=7,Root=1;
        Vector<Vector<Integer>> adj=new Vector<>();
        for (int i=0;i<N+1;i++) {
            adj.add(new Vector<Integer>());
        }
            adj.get(1).add(2);
            adj.get(2).add(1);
            adj.get(1).add(3);
            adj.get(3).add(1);
            adj.get(1).add(4);
            adj.get(4).add(1);
            adj.get(2).add(5);
            adj.get(5).add(2);
            adj.get(2).add(6);
            adj.get(6).add(2);
            adj.get(4).add(7);
            adj.get(7).add(4);
            printParent(Root,adj,0);
            printChildren(Root,adj);
            printDegree(Root,adj);
            printNodeLeaf(Root,adj);

    }
}
