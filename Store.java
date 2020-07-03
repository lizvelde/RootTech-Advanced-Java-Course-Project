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
        for (int i = frontIdx; i < carts.length+frontIdx; i++) 
        {
            if (carts[i].size()>0) 
            {
                pr = charts[i].next();
                while(pr)
                {
                    if (pr.productName().equals(p)) 
                    {
                        return i;
                    }
                    else
                        pr = charts[i].next()
                }
            }
        }
        return -1;
    }
}
