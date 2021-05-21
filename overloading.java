import java.io.*;
class overloading
{
    public static void display(String str,char chr)
{
 int l,i;char b = ' ';
l=str.length();
str=str+" ";
if(chr=='e')

for(i=0;i<l;i++)
{
if(i%2==0)
{

System.out.println(str.charAt(i));

}
else
{
System.out.println(str.charAt(i+1));
}
break;
}
}
public static void Display(String str,int p)
{
    
if(p==1)
System.out.println(str.indexOf('a'));
else
System.out.println(str.lastIndexOf('a'));

}

public static void main(String args[])throws IOException
{
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader y = new BufferedReader(in);
   
    String str1;char chr1;
    
    System.out.println("enter a string ");
    
    str1= y.readLine();

    System.out.println("enter a char");
    
    chr1= (char)(y.read());

   



     String str2;int p1;

    System.out.println("enter a string ");
    
    str2 = y.readLine();

    System.out.println("enter an int");
    
    p1 = Integer.parseInt(y.readLine());
 display(str1,chr1);
    
    Display(str2, p1);


}
}
    




