package array;

public class sumEqualsZero {
    static void sumEqualZero(int arr[],int len){
        int count=0;
        int min, minL, minR, sum;
        if (len<2){
            System.out.println("Invalid Input");
            return;
        }
        minL=0;
        minR=1;
        min=arr[0]+arr[1];
        for (int i=0;i<len;i++){
            for (int j=i+1;j<len;j++){
                sum=arr[i]+arr[j];
                if (Math.abs(min)>Math.abs(sum)){
                    min=sum;
                    minL=i;
                    minR=j;
                }
                System.out.println(arr[minL]+" "+arr[minR]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,6,-80,60,85};
        int len= arr.length;
        sumEqualZero(arr,len);
    }
}
