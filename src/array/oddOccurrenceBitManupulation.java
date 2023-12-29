package array;

public class oddOccurrenceBitManupulation {
    static int getOddOccurrenceBitManupulation(int[] arr,int size){
        int res=0;
        for (int i=0; i<size;i++){
            res=res^arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        oddOccurrenceBitManupulation obm=new oddOccurrenceBitManupulation();
        int[] arr=new int[]{12,23,34,44,5,23,34,5,44,12,12};
        int n=arr.length;
        System.out.println(obm.getOddOccurrenceBitManupulation(arr,n));
    }
}
