//Class (Store) containing categories (Carts) is implemented with a Deqeue
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

    public int size()
    {
        return numOfCarts;
    }

    public boolean isEmpty()
    {
        if(size() == 0)
        {
            return true;
        }
        return false;
    }

    public void enqueue(E cart)
    {
        int index = ((frontIdx + numOfCarts) % carts.length);
        if(numOfCarts < carts.length)
        {
            carts[index] = cart;
            numOfCarts++;
        }
    }

    public E dequeue()
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
}
