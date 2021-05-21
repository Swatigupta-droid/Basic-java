import java.io.*;
class BookFair
{
    String bname;
    double price;
    
    public BookFair()
    {
    bname=" ";
    price=0.00;
}
public void input()throws IOException
{
BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input book name");
bname=y.readLine();
System.out.println("Input price");
price=Integer.parseInt(y.readLine());
}
public void calculate()
{
   
    
     if(price<=1000)
    {
        price=price-price*0.02;
    }
    else if((price>1000)&&(price<=3000))
    {
        price=price-price*0.1;    
    }
    else
    {
       price=price-price*0.15; 
    }
}
public void display()
{
    System.out.println(" "+bname+" - "+price);
}
public static void main(String args[])throws IOException
{
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader y = new BufferedReader(in);
    BookFair obj= new BookFair();
    obj.input();
    obj.calculate();
    obj.display();
}
}


