import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {

        System.out.println ("(Project Name)");

        // initialize
        final Products firstProduct = new Products();
        final Products secondProduct = new Products();

        // set the variables within
        firstProduct.setProductName("FirstProductName");
        firstProduct.setPrice(9.0);

        secondProduct.setProductName("SecondProductName");
        secondProduct.setPrice(8.0);

        // get price of products
        firstProduct.getPrice();
        secondProduct.getPrice();

        // get total cost
        final Cart totalCost = new Cart ();
        totalCost.totalCost();
        System.out.print("Total Cost:" + totalCost.totalCost());

        // return the length of line
        System.out.print("Length of line");
        System.out.print(Store.lengthOfLine());

        // is cart empty
        System.out.print("Is cart empty?");
        System.out.print(Store.isEmpty());

        // add cart
        System.out.print(Store.addCart());

        // find product
        System.out.print(Store.FirstProductName());

        // ask user for input
        while (true){
            final Scanner scanner = new Scanner (System.in);
            System.out.println("Enter <y> to remove first product: ");
            System.out.println("Enter <z> to remove second product: ");
            final String removeProduct = scanner.nextLine();
            
            final Cart firstProductRemove = new Cart ();
            final Cart secondProductRemove = new Cart ();

            if (removeProduct == "y" || removeProduct == "<y>") {
                Cart.removeProducts(1, "hello");
            } else {
                Cart.removeProducts(101, "Helvfcjkkvrlo");
            }
    
        }
        
    }    
}