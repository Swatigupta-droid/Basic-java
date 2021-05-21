import java.io.*;
class t12question5
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
BufferedReader y = new BufferedReader(in);

int age;String gender; double ti,tax=0.00;
System.out.println(" Enter the age of the customer");
{
    age=Integer.parseInt(y.readLine());
}
System.out.println("Enter the gender of the customer");
{
    gender=y.readLine();
}


if((age>65)||(gender.equalsIgnoreCase("female")))
{
    System.out.println(" wrong category" );
    System.exit(0);
}
else
{
    System.out.println("Enter taxable income");
{
    ti=Double.parseDouble(y.readLine());
} 
    if(ti<=160000)
    {
        tax=0.00;
        System.out.println("tax = "+tax);
    }
    else if((ti>160000)&&(ti<=500000))
    {
        tax=(ti-160000)*0.1;
        System.out.println("tax = "+tax);
    }
    else if((ti>500000)&&(ti<=800000))
    {
        tax=((ti-500000)*0.2)+34000;
        System.out.println("tax = "+tax);
    }
    else
    {
        tax=((ti-800000)*0.3)+94000;
        System.out.println("tax = "+tax);
    }
}
}}