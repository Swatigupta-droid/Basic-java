public class mergeSort {
    public static int[] merge2sortedArray(int[] arr1 , int[] arr2){ // returns a combined sorted array
        int n = arr1.length;
        int m = arr2.length;
        int[] sum = new int[n + m];
        if(n == 0 || m == 0 ){
            if(n == 0)
            return arr1;
            else
            return arr2;
        }
        int i = 0 , j = 0, k = 0;
        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                sum[k++] = arr1[i++];
            }else{
                sum[k++] = arr2[j++];
            }
        }
        while(i < n){
            sum[k++] = arr1[i++];
        }
        while(j < m){
            sum[k++] = arr2[j++];
        }
        return sum;
    }
    public static int[] mergesort(int[] arr ,int si , int ei){
        int mid = (si+ei)/2; // finding our mid
        if(si == ei){
            return new int[]{arr[si]}; // it will insert sorted element one by one in an array
        }    
        int[] left = mergesort(arr, si, mid);// recursive call for left half.
        int[] right = mergesort(arr, mid+1, ei); // recursive call for right half.

        return merge2sortedArray(left, right);// combining the left and right sorted array
    }
    public static void main(String[] args){
        int[] arr = {-12,2,34,-29,34,13,-1,0,36,25};
        int n = arr.length;
        int[] ans = mergesort(arr,0,n-1);
        for(int i = 0 ; i < ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }



}

