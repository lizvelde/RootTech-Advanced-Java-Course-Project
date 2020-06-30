// making the object class the products class 
// that has getters and setters for the cost

// and have getAmount and setAmount

// each person has a cart

// Class: Cart Category: Products Obj: Cost

// we can have that stores class that you talked about and have a queue
// like lines at a grocery store or whatever

/*  
so the object class is the products, category is the carts, and the class with all the categories is the queue
for dividing this up do we want to make each person make their own class

and like the person with the object class can do the main method

jdimonte you said you could do the queue right? 

lizeth: i could do the carts

me: products and main
*/

public class Products {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }
}