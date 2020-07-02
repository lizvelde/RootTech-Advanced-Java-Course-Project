//Class (Store) containing categories (Carts) is implemented with a Queue
public class Store<E> 
{
    private E[] carts;
    private int frontIdx;
    private int numOfCarts;

    public Store()
    {
        carts = (E[]) new Object[5];
        frontIdx = 0;
        numOfCarts = 0;
    }

    public int lengthOfLine()
    {
        return numOfCarts;
    }

    public boolean isEmpty()
    {
        if(lengthOfLine() == 0)
        {
            return true;
        }
        return false;
    }

    public void addCart(E cart)
    {
        int index = ((frontIdx + numOfCarts) % carts.length);
        if(numOfCarts < carts.length)
        {
            carts[index] = cart;
            numOfCarts++;
        }
    }

    public E removeCart()
    {
        E cartAtFront = carts[frontIdx];
        array[frontIdx] = null;
        frontIdx++;
        numOfCarts--;
        return cartAtFront;

    }

    public E first()
    {
        return carts[frontIdx];
    }
    
    public int findProduct(char p)
    {
        boolean check = true;
        while(check) 
        {
            for (int i = 0; i < carts.length; i++) 
            {
                if (carts[i] == null) 
                {
                    i = carts.length;
                } else 
                    {
                    if (carts[i].productName().equals(p)) 
                    {
                        return i;
                    }
                }
            }
            check = false;
        }
        return -1;
    }
}
