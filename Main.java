import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println ("(Project Name)");

        Scanner scanner = new Scanner (System.in);

        System.out.println("Let's declare the amount of products! \n");

        System.out.print("Enter first product name: ");
        String firstNameOfProduct = scanner.nextLine();

        System.out.print("Enter second product name: ");
        String secondNameOfProduct = scanner.nextLine();

        System.out.print("How much "+ firstNameOfProduct + " do you have? \n");
        double firstAmount = scanner.nextDouble();

        System.out.print("How much "+ secondNameOfProduct +" do you have? \n");
        double secondAmount = scanner.nextDouble();

        Products firstProduct = new Products();
        Products secondProduct = new Products();



    }    
}