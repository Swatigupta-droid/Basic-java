import java.io.*;
class ElectricBill
{
    String n;
    int units;
    double bill;
    public void accept()throws IOException
    {
    BufferedReader y= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input name of the customer");
    n=y.readLine();
    System.out.println("Input number of units consumed");
    units=Integer.parseInt(y.readLine());
}
public void calculate()
{
    double rent=0.00;
    if(units<=100)
    {
        bill= bill+(units*2);
    }
    else if((units>100)&&(units<=300))
    {
        bill=bill+(100*2)+(units-100)*3;
    }
    else
    {
        rent=rent+200+600+(units-300)*5;
        bill=bill+rent*(2.5/100);
    }
}
    public void print()
    {
        System.out.println(" NAME OF THE CUSTOMER - "+n);
        System.out.println(" NUMBER OF UNITS CONSUMED - "+units);
        System.out.println(" BILL AMOUNT - "+bill);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader in = new  InputStreamReader(System.in);
        BufferedReader y = new BufferedReader(in);
        ElectricBill obj= new ElectricBill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
    
    