/* 
It looks like the order for that class is a bit reversed

You should be initializing the firstProduct and secondProduct at the 
start of that class and from that initializing the variables within it afterwards

At its current state, the two Products have no initialized variables other than its name
*/

public class Products {
    private String productName;
    private double price;

    public String productName() {
        return productName;
    }

    public void setProductName(String newProductName) {
        this.productName = newProductName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice (double newPrice){
        this.price = newPrice;
    }

}