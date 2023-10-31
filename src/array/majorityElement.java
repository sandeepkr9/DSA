package array;

public class majorityElement {
    static boolean isMajority(int arr[],int n, int x){
        int i,last=0;
        last=(n%2==0)?n/2:n/2+1;
        for (i=0;i<last;i++){
            if (arr[i]==x && arr[i+n/2]==x)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,4,5,5,5,6};
        int n= arr.length;
        int x=5;
        if (isMajority(arr,n,x)==true)
            System.out.println(x+"appears more than"+n/2+"th of the time");
        else
            System.out.println(x+"appears less than"+n/2+"th of the time");
    }
}
