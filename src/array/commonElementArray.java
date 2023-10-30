package array;

public class commonElementArray {
    static void findIntersection(int arr1[], int arr2[], int m, int n, int temp[], int k[]){
        int i=0,j=0;
        while(i<m && j<n){
            if (arr1[i]<arr2[j]){
                i++;
            }else if (arr2[j]<arr1[i]){
                j++;
            }else {
                temp[k[0]]=arr1[i];
                i++;
                j++;
                k[0]++;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[]={12,23,34,45,56};
        int arr2[]={34,567,78,89};
        int arr3[]={13,23,34,45};
        int n1=arr1.length;
        int n2= arr2.length;
        int n3=arr3.length;
        int temp[]=new int[10000];
        int ans[]=new int [10000];
        int k[]={0};
        findIntersection(arr1,arr2,n1,n2,temp,k);
        int tempSize=k[0];
        k[0]=0;
        findIntersection(arr3,temp,n3,tempSize,ans,k);
        for(int i=0;i<k[0];i++){
            System.out.println(ans[i]);
        }
        System.out.println();
    }
}
