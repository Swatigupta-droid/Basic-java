import java.io.*;
class Library
{
    int acc_num;
    String title;
    String author;
    public void input()throws IOException
    {
    BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input accession number");
    acc_num=Integer.parseInt(y.readLine());
    System.out.println("Input title of the book");
    title=y.readLine();
    System.out.println("Input name of the author");
    author=y.readLine();
}
    public void compute()throws IOException
    {
        double fine=0.00;int dl;
         BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Input number of days late");
         dl=Integer.parseInt(y.readLine());
         fine=fine+dl*2;
         System.out.println("fine charged = "+fine);
        }
        public void display()
        {
            System.out.println("Accession number          Title          Author");
            System.out.println(acc_num+"          "+title+"          "+author);
        }
        public static void main(String args[])throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader y = new BufferedReader(in);
        
        Library obj= new Library();
        obj.input();
        obj.compute();
        obj.display();
    }
    
    
}
           
        
    
