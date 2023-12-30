package array;

import java.util.HashSet;

public class firstRepeatUsingHashset {
    static int printFirstRepeatHashset(int[] arr){
        int min=-1;
        HashSet<Integer> hs=new HashSet<>();
        for (int i=arr.length-1;i>=0;i--){
            if (hs.contains(arr[i])){
                min=i;
            }else {
                hs.add(arr[i]);
            }
        }
        if (min != -1){
            System.out.println(arr[min]);
        }else {
            System.out.println("There is no repeating element");
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,4,6,2,4,4};
        int n= arr.length;
        printFirstRepeatHashset(arr);
    }
}
