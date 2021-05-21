


import java.io.*;
class prime
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader y = new BufferedReader(in);
        
        int s=0,i,j,c=0,f;
        for(i=1;i<=100;i++)
        {
            f=i;
            for(j=1;j<=i;j++)
            {
                if(f % j==0)
                {
                    
                c++;
                
            
            }
               
            if(c==2)
            {
                
                s=s+f;
            }
            
            
            System.out.println(s);
        }
    }
  }
}
                