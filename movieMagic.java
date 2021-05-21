import java.io.*;
class movieMagic
{
    int year;
    String title;
    float rating;
    
    public movieMagic()
    {
        year=0;
        title=" ";
        rating=0.0F;
    }
    public void accept(String args[])throws IOException
    {
         InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader y = new BufferedReader(in);
        System.out.println("Input year");
        year=Integer.parseInt(y.readLine());
        System.out.println("Input title");
        title=y.readLine();
        System.out.println("Input rating");
        rating=Float.parseFloat(y.readLine());
    }
    public void display()
    {
     
     if(rating<2.0)
     {
     System.out.println("FLOP");
    }
     if ((rating>2.0)&&(rating<3.5))
     {
     System.out.println("SEMI-HIT");
    }
     if ((rating>3.5)&&(rating<4.5));
     {
     System.out.println("HIT");
    }
     if((rating<4.5)&&(rating>5.0))
     {
     System.out.println("SUPER HIT");
    }
    System.out.println(title);
     System.out.println(rating);
}
public static void main(String args[])throws IOException
{
    movieMagic obj= new movieMagic();
    obj.display();
   
}
}
     
        

     