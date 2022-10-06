
public class J_33_rorateArrayBY_K_position {

    public static void reverseArr(int arr[], int low, int high){
        int mid = (low+high)/2;
        int temp;
    
        for( int i = low,x=0; i <= mid; i++,x++){
            temp = arr[i];
            arr[i] = arr[high-x];
            arr[high-x] = temp;
        }
        // 1 2 3 4 5 6 7 8 9 
        // 1 2 3 9 5 6 7 8 4
        // 1 2 3 9 8 6 7 5 4
        // 1 2 3 9 8 7 6 5 4
    }

    public static void leftRotate(int arr[], int k){
        reverseArr(arr, k, arr.length-1);
        reverseArr(arr, 0, k-1);
        reverseArr(arr, 0, arr.length-1);
    }

    public static void showArr(int arr[]){
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }System.out.println();
    }
    
    public static void main(String[] args) {
        //           0 1 2 3 4 5 6 7 8 9
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        leftRotate(arr, 4);
        showArr(arr);
        
    }
    
}
