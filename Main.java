//import java.util.Scanner;

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