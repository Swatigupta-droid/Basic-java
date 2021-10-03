import java.io.*;
class t12question6
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader y = new BufferedReader(in);
        
        String s;char ch=' ',ch2=' ';int i,c=0,l=0;
        System.out.println("Input a sentence");
        {
        s=y.readLine();
        }
        s=s.toUpperCase();
    l=s.length();
    for(i=0;i<l-1;i++)
    {
        ch=s.charAt(i);
        ch2=s.charAt(i+1);
        if((int)ch==(int)ch2)
        {
            c++;
         
}

}
 System.out.println(c);
}   
}    
