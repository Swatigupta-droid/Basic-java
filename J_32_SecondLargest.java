public class J_32_SecondLargest {
    public static int secondLargest(int arr[]){
        int max = -2147483648;
        int s_max = -2147483648;
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i+1] > arr[i]){
                s_max = max;
                max = arr[i+1];
            }
        }
        return s_max;
    }

    public static void main(String[] args) {
    
        //int arr[] = {2, 7, 8, 1, 9};
        int arr [] = {1,1,1,1,1,1,1}; 
        System.out.println(secondLargest(arr));
    }
    
}
