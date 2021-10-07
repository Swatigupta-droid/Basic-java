import java.util.Scanner;

public class Half_Pyramid_Star_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Enter number: ");
		n = sc.nextInt();
		
		System.out.println("Half Pyramid Star Pattern created.\n");
		
		for(int i=1; i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(" * ");
			}
			System.out.print("\n");
		}
		
		sc.close();	
	}

}
