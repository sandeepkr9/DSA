package array;

import java.util.HashMap;
import java.util.Map;

public class duplicateElement {
    static void findDuplicate(int arr[], int len){
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        boolean dup=false;
        for (int i=0; i<len; i++) {
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey());
                dup=true;
            }
            if (!dup){
                System.out.println(-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 40, 5, 6, 5, 11, 12, 11 };
        int len = arr.length;
        findDuplicate(arr, len);
    }
}
