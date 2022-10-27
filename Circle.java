
package pr3;
 public  class Circle extends pr1.Shape 
{
    double a;
    public Circle(double a)
    {
        super(a);
        this.a=a;
    }
   public double area()
   {
       System.out.println("The area of circle is ");
       double pi=3.14;
       return pi*a*a;
   }
}
