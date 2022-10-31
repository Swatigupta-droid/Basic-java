// Java Program to find first
// n terms of Golomb sequence.
import java.util.*;

class GFG
{
	public static int findGolomb(int n)
	{
		
		// base case
		if (n == 1)
			return 1;
	
		// Recursive Step
		return 1 + findGolomb(n -
		findGolomb(findGolomb(n - 1)));
	}
	
	
	// Print the first n term of
	// Golomb Sequence
	public static void printGolomb(int n)
	{
		
		// Finding first n terms of
		// Golomb Sequence.
		for (int i = 1; i <= n; i++)
			System.out.print(findGolomb(i) +
									" ");
	}
	
	// Driver Code
	public static void main (String[] args)
	{
		int n = 9;
		
		printGolomb(n);
	}
}


