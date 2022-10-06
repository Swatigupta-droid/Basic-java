public class J_31_pushZeroTOEnd {

    static void showArr(int arr[]){
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void pushZeroes(int arr[]){
        int temp;
        int i =0,j=0;
        while(j<arr.length){
            if(arr[j]==0){
                j++;
            }
            else{
                temp=arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j++;
            }
        }

    }

    public static void main(String[] args) {
    
        int arr[] = {0, 2, 0, 1, 3, 0, 4, 0, 0};
        showArr(arr);
        pushZeroes(arr);
        showArr(arr);
    }
    

}
