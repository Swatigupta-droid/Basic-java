public class SupermarketM{

    //create variables for our project
private String Label;
private String Disc;
private int Weight;
private double Price;
//this will be public to be easy accessible and it dosen't affect since its not priv info and applies to all products
public static double VAT = 0.10;

//intialize all these variables use new variables for each and create similar name to dont get confused, i will add m before
public SupermarketM(String mLabel, String mDisc, int mWeight, double mPrice)
{
    this.Label = mLabel;
    this.Disc = mDisc;
    this.Weight = mWeight;
    this.Price = mPrice;
    //notice we dont add public variable as i can access easily since its public
}
//we will make a get method here for each variable, no void here because we are returning a value to be stored
public String getLabel() {
    return Label;
}
public String getDisc() {
    return Disc;
}
public double getPrice() {
    return Price;
}
public static double getVAT() {
    return VAT;
}

public void setLabel(String new_label) {
    Label = new_label;
}
public void setDisc(String new_disc) {
    Disc = new_disc;
}
public void setPrice(double new_price) {
    Price = new_price;
}

public static void setVAT(double new_VAT) {
    VAT = new_VAT;
}

public void makeProduct(){
    String product;
    Double tax = Price * VAT;

    product = "Product name: "+Label+" Description: "+Disc+" Weight: "+Weight+"g"+" Price:BD "+Price+" VAT:BD "+tax;
 
    System.out.println(product);
}

}