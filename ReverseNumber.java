import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int n, rev=0,rem;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		 n =s.nextInt();
		 
		 while(n!=0) 
		 {
			 
			 // formula to calculate reverse of a number. 
			 rem = n % 10; 
			 rev = rev * 10 + rem;
			 n = n / 10;
		 }		 

			 System.out.println("Reversed Number is: "+rev);

		 s.close();
	}

}
