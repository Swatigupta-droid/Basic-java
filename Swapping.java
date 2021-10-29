//Write a Program to Swap Two Numbers

import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a,b,temp;
		System.out.println("Enter two numbers you want to swap");
		System.out.println("Enter value of A : ");
		a=sc.nextInt();
		System.out.println("Enter value of B : ");
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swapped value of A is : "+a);	
		System.out.println("Swapped value of B is : "+b);	

		sc.close();
	}
}
