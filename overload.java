import java.io.*;
class overload
{
    public static void Series(int no)
    {
      int s=1,i;
      for(i=5;i<=no;i+=4)
      s=s+1/i;
    
    System.out.println(s);
}


    public static void series(int a, int n)
{
    int j=2,sq,i; double p,su=0;
for(i=1;i<=n;i++)
{
 sq=i*i;
 if(j<=n)
 j=j+3;
 p=Math.pow(a,j);
 su = su+ sq/p;
}
 System.out.println(su);
}
 
  public static void main (String args[])throws IOException
{
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader y = new BufferedReader(in);
    
    int a1,n1,no1;
    System.out.println("enter a no.");
    no1=Integer.parseInt(y.readLine());
    Series(no1);
    System.out.println("enter 2 no.");
    n1=Integer.parseInt(y.readLine());
    a1=Integer.parseInt(y.readLine());
    series(a1,n1);
}

}

        