package array;

public class oddOccurence {
    static int getOddOccurence(int arr[],int size){
        for (int i=0; i<size; i++){
            int count=0;
            for (int j=0; j<size; j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count%2!=0)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={32,45,7,8,23,45,23,45,23};
        int n= arr.length;
        System.out.println(getOddOccurence(arr,n));
    }
}
