package array;

import java.util.HashMap;
import java.util.Map;

public class mostFrequent {
    static int freq(int arr[], int n){
        Map<Integer, Integer> m=new HashMap<>();
        for (int i=0; i<n; i++){
            int key=arr[i];
            if (m.containsKey(key)){
                int freq=m.get(key);
                freq++;
                m.put(key,freq);
            }else {
                m.put(key,1);
            }
        }
        int max=0,
        res=-1;
        for (Map.Entry<Integer,Integer>val:m.entrySet()){
            if (max< val.getValue()){
                res= val.getKey();
                max=val.getValue();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={10,40,20,30,20,10,90,10};
        int n= arr.length;
        System.out.println(freq(arr,n));
    }
}
