import java.util.Scanner;

public class Fibonacci{

    private static int fibonacci(int num){
        if(num == 1){
            return 0;
        }else if(num == 2 || num == 3){
            return 1;
        }

        return fibonacci(num  - 1) + fibonacci(num  - 2);
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the # of the fibonacci sequence: ");
        int number = in.nextInt();
        System.out.println(fibonacci(number));
    }    

}
