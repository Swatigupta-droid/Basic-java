
import java.io.*;
class array
{
    public static void main (String args[])throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader y=new BufferedReader(in);
        int i,j,maxpos=0,temp;
        int n[] = new int[10];
        System.out.println("enter 10 numbers in array");
        
        for(i=0;i<10;i++)
        {
        n[i]=Integer.parseInt(y.readLine());
    }
    for(i=0;i<9;i++)
    {
    maxpos = i;
    for(j=i+1;j<10;j++)
    {
        if(n[j]>n[maxpos])
        {
            maxpos=j;
        }
    }
    temp=n[i];
    n[i]=n[maxpos];
    n[maxpos]=temp;
}
System.out.println("content of array after sorting");
System.out.println("n[]");
for(i=0;i<10;i++)
{
    System.out.println(n[i]);
}
}
}

    
    
    
    
    
    
    