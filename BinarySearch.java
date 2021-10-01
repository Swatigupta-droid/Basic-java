public class BinarySearch{

    public static boolean findNumber(int arr[], int target){

        int high = arr.length;
        int low = 0;
        while(low <= high){
            int mid = low + (high-low) / 2;

            if(arr[mid] == target){
                return true;
            } 
            else if(arr[mid] < target){
                low = mid + 1;
            }
            
            else if(arr[mid] > target){
                high = miw - 1;
            }
        }
        return false;
    }

    public static void main(String args[]){

        //Array should always be in sorted order for binary search

        int arr[] = { 1, 3, 5, 6, 8, 9 };
        System.out.println("Enter the number to be searched");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(findNumber(arr, target));
    }
}