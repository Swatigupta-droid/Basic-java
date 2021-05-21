import java.io.*;
class scb
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader y = new BufferedReader(in);
        String s1;int i,len;char ch1 , ch2;
        System.out.println("enter a sentence");
        s1=y.readLine();
        s1=" "+s1;
        s1=s1.toUpperCase();
        len=s1.length();
        for(i=0;i<len;i++)
        {
            ch1=s1.charAt(i);
            if(ch1==' ')
            {
                ch2=s1.charAt(i+1);
                
                System.out.print(ch2+".");
            }
        }
    }
    }
                