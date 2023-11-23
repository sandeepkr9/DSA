package array;

public class minAbsSumPair {
    public static void minAbsSumPair(int arr[], int size){
        int count=0;
        int low,rear,min,sum;
        if (size<2){
            System.out.println("Invalid Input");
            return;
        }
        low=0;
        rear=1;
        min=arr[0]+arr[1];
        for(int i=0;i<size;i++){
            for (int j=i+1; j<size;j++){
                sum=arr[i]+arr[j];
                if (Math.abs(min)>Math.abs(sum)){
                    min=sum;
                    low=i;
                    rear=j;
                }
            }
        }
        System.out.println("Elements whose sum is minimum are "+arr[low]+" "+arr[rear]);
    }

    public static void main(String[] args) {
        int arr[]={1,4,23,56,78};
        minAbsSumPair(arr,5);
    }
}
