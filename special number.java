import java.io.*;
class special
{
  public static void main( String args[])throws IOException
  {
      InputStreamReader in=new InputStreamReader(System.in);
      BufferedReader y=new BufferedReader(in);
      
      int n;
      System.out.println("Enter a number");
      {
          n=Integer.parseInt(y.readLine());
        }
        int x=n,s,r=0,i;
        while(n>0)
        {
            s=n%10;
            int p=1;
        
        for(i=1;i<=s;i++)
            {
                p=p*i;
            }   
            r=r+p;
            n=n/10;
        }
        if(x==r)
        {
            System.out.println( "it is a special number");
        }
        else
        {
            System.out.println("it is not a special number");
        }
        
    }
}
  