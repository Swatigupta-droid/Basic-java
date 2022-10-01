import java.util.Scanner;

//In this part we will finally execute code that will get us all details of a product
//We will use scanner class of Java to get input and we will make few products to test

public class SuperMarket {
    public static void main(String[] args) throws Exception {
        //declare or make object input fron the Scanner to record input data
        Scanner input = new Scanner(System.in);

        //make object fron our SuperMarket class
        SupermarketM apple = new SupermarketM("Fiji Apples.", "Grown and picked straight from the Fiji mountain in nepal.", 500, 1.6);
        SupermarketM chocolate = new SupermarketM("Hershey's Milk Chocolate Bar.", "Chocolate var, Gluten Free, Soy Free, Nuts Free.", 45, 0.5);
        SupermarketM chips = new SupermarketM("Pringles Honey Barbeque Flavored.", "Imported from france, Gluten Free", 380, 0.7);
        //asking customer what they want to buy
        System.out.println("Welcome to our store we are selling the following: Apples, Chocolate, Chips");
        //declaring the cariable to store the answer
        String answer = input.next();
        //using if else statement to get specific answer
        if(answer.equalsIgnoreCase("apple"))
        {
            apple.makeProduct();
        }
        else if(answer.equalsIgnoreCase("chocolate"))
        {
            chocolate.makeProduct();
        }
        else if(answer.equalsIgnoreCase("chips"))
        {
            chips.makeProduct();
        }
        //if answer is not of the any above it will print the following:
        else
        {
            System.out.println("Sorry we don't have "+answer+" in stock :(");
        }
        //good practice to close your scanner when not in use
        input.close();

    }
}
