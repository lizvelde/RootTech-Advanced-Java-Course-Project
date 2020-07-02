import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println ("(Project Name)");

        // initialize
        Products firstProduct = new Products();
        Products secondProduct = new Products();

        // set the variables within
        firstProduct.setProductName("FirstProductName");
        firstProduct.setPrice(9.0);

        secondProduct.setProductName("SecondProductName");
        secondProduct.setPrice(8.0);

        // get price of products
        firstProduct.getPrice();
        secondProduct.getPrice();

        // ask user for input
        while (true){
            Scanner scanner = new Scanner (System.in);
            System.out.println("Enter <y> to remove first product: ");
            System.out.println("Enter <z> to remove second product: ");
            String removeProduct = scanner.nextLine();
            
            Cart firstProductRemove = new Cart ();
            Cart secondProductRemove = new Cart ();

            if (removeProduct == "y" || removeProduct == "<y>") {
                Cart.removeProducts(1, "hello");
            } else {
                Cart.removeProducts(101, "Helvfcjkkvrlo");
            }

            

    
        }
        


        /*Scanner scanner = new Scanner (System.in);

        System.out.println("Let's declare the amount of products! \n");

        System.out.print("Enter first product name: ");
        String firstNameOfProduct = scanner.nextLine();

        System.out.print("Enter second product name: ");
        String secondNameOfProduct = scanner.nextLine();

        System.out.print("How much "+ firstNameOfProduct + " do you have? \n");
        double firstAmount = scanner.nextDouble();

        System.out.print("How much "+ secondNameOfProduct +" do you have? \n");
        double secondAmount = scanner.nextDouble(); */

        

    }    
}