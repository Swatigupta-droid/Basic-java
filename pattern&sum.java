import java.io.*;
class menu
 {
     public static void main(String args[])throws IOException
     {
         InputStreamReader in= new InputStreamReader(System.in);
         BufferedReader y= new BufferedReader(in);
         int ch;
         System.out.println("menu");
         System.out.println("1.  0,3,8,15,24,.........n terms");
         System.out.println("2.  s=1/2 + 3/4 + 5/6 + 7/8.......19/20");
         System.out.println(" enter user choice ");
         ch=Integer.parseInt(y.readLine());
         
         switch(ch)
         {
             case 1:
             {
                 int n,i,s=3,p=0;
                 System.out.println("enter the number of terms");
                 n=Integer.parseInt(y.readLine());
                 for(i=0;i<n;i++)
                 {
                     p=p+s;
                     s=s+2;
                     System.out.print(p+",");
                    }
                }
                    break;
                
               case 2:
             {
               int i,a=2;double s=0.00;
               for(i=1;i<=19;i+=2)
               {
                   s=s+i/a;
                  a=a+2;
                }
                System.out.println("sum= "+s);
            }
                
                         Default :    
            
                           System.out.println(" ");
            
                        
                          
                          

    }
  }
}