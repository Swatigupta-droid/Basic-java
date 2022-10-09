// Java code for Max
// Water Container


class Area{

	public static int maxArea(int A[], int len)
	{
		int l = 0;
		int r = len -1;
		int area = 0;
	
		while (l < r)
		{
			
			area = Math.max(area,Math.min(A[l], A[r]) * (r - l));		
			if (A[l] < A[r])
				l += 1;
			else
				r -= 1;
		}
		return area;
	}
	
	public static void main(String[] args)
	{
		int a[] = {1, 5, 4, 3};
		int b[] = {3, 1, 2, 4, 5};
	
		int len1 = 4;
		System.out.print( maxArea(a, len1)+"\n" );
	
		int len2 = 5;
		System.out.print( maxArea(b, len2) );
	}
}


