import java.io.*;
class Fruitjuice
{
    int product_code;
    String flavour;
    String pac_type;
    int pack_size;
    int product_price;
    
    public Fruitjuice()
    {
        product_code=0;
        flavour=" ";
        pac_type=" ";
        pack_size=0;
        product_price=0;
    }
    public void input()
    {
        
         
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader y = new BufferedReader(in);
        System.out.println("Input product code");
       
        System.out.println("Input flavour");
      
        System.out.println("Input pack type");
       
        System.out.println("Input pack size");
       
        System.out.println("Input product price");
       
    }
    public void discount()
    {
    product_price=product_price-10;
}
public void display()
{
    System.out.println(" product code= "+product_code);
    System.out.println("flavour= "+flavour);
    System.out.println("pack type= "+pac_type);
    System.out.println("pack size= "+pack_size);
    System.out.println("product price+ "+product_price);
}
}
    
    
        