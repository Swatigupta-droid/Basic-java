import java.io.*;
class ParkingLot
{
    int vno;
    int hours;
    double bill;
    
    public  void input()throws IOException
    {
     
    BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input the vehicle number");
    vno = Integer.parseInt(y.readLine());
    System.out.println("Input the number of hours");
    hours = Integer.parseInt(y.readLine());
}
public void calculate()
{
    if(hours<=0)
    {
        System.out.println("WRONG INPUT");
        System.exit(0);
    }
    else if((hours>0)&&(hours<=1))
   {
       bill = hours*3.0;
       System.out.println("PARKING CHARGES = "+ bill);
    }
    else
    {
    bill = 3.0+(hours-1)*3;
    System.out.println("PARKING CHARGES + "+bill);
}
}
public void display()
{
System.out.println("vehicle number = "+vno);
System.out.println("total time = "+hours);
System.out.println("total charges = "+bill);
}
public static void main(String args[])throws IOException
{
 ParkingLot obj = new ParkingLot();
 obj.input();
 obj.calculate();
 obj.display();
 System.out.println();
}
}