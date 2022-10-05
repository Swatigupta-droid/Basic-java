
public class J_26_SwapAlternate {

    public static void showArr(int arr[]){
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void swapAlternate(int arr[]){
        int temp,arrlen;
        if(arr.length%2==0){
            arrlen=arr.length;
        }else{
            arrlen=arr.length-1;
        }
        for (int i = 0; i < arrlen; i += 2) {
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static int factorial( int num){
        int ans;
        if(num>=1){
            ans = num*factorial(num-1);
            return ans;
        }
        return 1 ;
    }

    // public static int factorial2( int num){
        
    //     if(num>=1){
    //         return num*factorial2(num-1);
    //     }
    //     return 1;
    // }

    public static void main(String[] args) {
    
        int arr[] = {1,2,3,4,5,6};
        int arr2[] = {1,2,3,4,5,6,7};
        // System.out.println(factorial(4));
        swapAlternate(arr2);
        showArr(arr2);
    }
    
}
