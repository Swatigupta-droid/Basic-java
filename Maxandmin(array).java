import java.io.*;
class array1

{
    public static void main(String args[])throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader y = new BufferedReader(in);
        int i,max=0,min=0;
        int n[]= new int[10];
        System.out.println("enter 10 numbers in an array");
        for(i=0;i<10;i++)
        {
            n[i]=Integer.parseInt(y.readLine());
        }
        for(i=0;i<10;i++)
        {
        if(n[i]>max)
        {
        max=n[i];
    }
        
        else
        {
        min=n[i];
    }
    }
    System.out.println("the largest number is ="+max);
    System.out.println("the smallest number is="+min);
}
}
        