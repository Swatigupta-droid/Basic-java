import java.util.Scanner;

public class Full_Pyramid_Star_pattern {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n;
			
			System.out.println("Enter a number: ");
			n = sc.nextInt();
			
			System.out.println("Full Pyramid Star Pattern created.\n");
			
			for(int i=1 ; i<=n;i++)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=2*i-1;j++)
				{
					System.out.print("*");
				}
				
				System.out.print("\n");
			}
			
			sc.close();	
	}

}
