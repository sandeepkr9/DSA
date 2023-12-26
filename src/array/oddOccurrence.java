package array;

import java.util.HashMap;

public class oddOccurrence {
    static int getOddOccurrence(int[] arr, int size){
        HashMap<Integer,Integer> map=new HashMap();
        for (int i=0;i<size;i++){
            if (map.containsKey(arr[i])){
                int val=map.get(arr[i]);
                map.put(arr[i], val+1);
            }else
                map.put(arr[i], 1);
        }
        for (Integer a:map.keySet()){
            if (map.get(a)%2!=0){
                return a;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={45,7,8,23,45,23,45,23};
        int size= arr.length;
        System.out.println(getOddOccurrence(arr,size));
    }
}
