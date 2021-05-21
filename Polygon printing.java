import java.io.*;
class t12question7
{
    public static void polygon(int n,char ch)
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void polygon(int x,int y)
    {
        int i,j;
        for(i=1;i<=y;i++)
        {
            for(j=1;j<=x;j++)
            {
                System.out.print(" @ ");
            }
            System.out.println();
        }
    }
    public static void polygon()
    {
        int i,j;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String args[])throws IOException
{
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader y = new BufferedReader(in);
   
        int n1,x1,y1;char ch1;
        System.out.println("Input side of square");
        n1=Integer.parseInt(y.readLine());
        System.out.println("Input length of rectangle");
        x1 = Integer.parseInt(y.readLine());
        System.out.println("Input breadth of rectangle");
        y1 = Integer.parseInt(y.readLine());
        System.out.println("Input the content of square");
        ch1=(char)(y.read());
        polygon(n1,ch1);
        polygon(x1,y1);
        polygon();
    }
}
        