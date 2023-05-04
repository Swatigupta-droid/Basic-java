import java.util.Scanner;

public class BasicCalculator
{
public static void main(String args[])
{
    float a, b, res;
    char select, ch;
    Scanner scan = new Scanner(System.in);

    do
    {
        System.out.print("(1) Addition\n");
        System.out.print("(2) Subtraction\n");
        System.out.print("(3) Multiplication\n");
        System.out.print("(4) Division\n");
	System.out.print("(5) Quadratic\n");
        System.out.print("(6) Exit\n\n");
        System.out.print("Enter Your Choice : ");
        choice = scan.next().charAt(0);

        switch(select)
        {
           case '1' : 
		System.out.print("Enter Two Numbers : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                res = a + b;
                System.out.print("Result = " + res);
                break;
           case '2' : 
		System.out.print("Enter Two Numbers : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                res = a - b;
                System.out.print("Result = " + res);
                break;
           case '3' : 
		System.out.print("Enter Two Numbers : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                res = a * b;
                System.out.print("Result = " + res);
                break;
           case '4' : 
		System.out.print("Enter Two Numbers : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                res = a / b;
                System.out.print("Result = " + res);
                break;
	   case '5' : 
		System.out.print("Enter Value of a : ");
		double a = scan.nextDouble();
		System.out.print("Enter Value of b : ");
		double b = scan.nextDouble();
		System.out.print("Enter Value of c : ");
		double c = scan.nextDouble();
		double d = b * b - 4.0 * a * c;
		if (d > 0.0)
		{
			double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
			System.out.println("The Roots Are " + r1 + " and " + r2;
		}
		else if (d == 0.0)
		{
			double r1 = -b / (2.0 * a);
			System.out.println("The Root Is " + r1);
		}
		else
		{
			System.out.println("Roots Are Not Real");
		}
           case '6' : 
		System.exit(0);
                break;
           default : System.out.print("Wrong Input");
        }
    }while(choice != 6);       
}
