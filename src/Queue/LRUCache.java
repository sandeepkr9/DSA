package Queue;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {
    private Deque<Integer> doublyQueue;
    private HashSet<Integer> hashSet;
    private final int cache_size;

    LRUCache(int cap){
        doublyQueue = new LinkedList<>();
        hashSet = new HashSet<>();
        cache_size=cap;
    }

    public void refer(int page){
        if (!hashSet.contains(page)){
            if (doublyQueue.size()==cache_size){
                int last=doublyQueue.removeLast();
                hashSet.remove(page);
            }
        }else{
            doublyQueue.remove();
        }
        doublyQueue.push(page);
        hashSet.add(page);
    }

    public void Display(){
        Iterator<Integer> itr=doublyQueue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        LRUCache lru=new LRUCache(100);
        lru.refer(10);
        lru.refer(20);
        lru.refer(30);
        lru.refer(40);
        lru.Display();
    }
}
