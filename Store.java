//Class (Store) containing categories (Carts) is implemented with a Deqeue
public class Store<E> 
{
    private E[] carts;
    
    private int front;
    private int numOfCarts;

    public Store()
    {
        carts = (E[]) new Object[5];
        front = 0;
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
        int index = ((front + numOfCarts) % carts.length);
        if(numOfCarts < carts.length)
        {
            carts[index] = cart;
            numOfCarts++;
        }
    }

    public E dequeue()
    {
        E cartAtFront = carts[front];
        array[front] = null;
        front++;
        numOfCarts--;
        return cartAtFront;

    }

    public E first()
    {
        return carts[front];
    }
}
