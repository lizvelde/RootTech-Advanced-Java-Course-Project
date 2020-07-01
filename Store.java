//Class (Store) containing categories (Carts) is implemented with a Deqeue
public class Store<E>
{
    public static class Node<E>
    {
        private E cart;
        private Node prev, next;

        public Node(E cart, Node prev, Node next)
        {
            this.cart = cart;
            this.prev = prev;
            this.next = next;
        }

        public E getCart()
        {
            return cart;
        }

        public void setCart(E cart)
        {
            this.cart = cart;
        }


        public Node getPrev()
        {
            return prev;
        }

        public void setPrev(Node prev)
        {
            this.prev = prev;
        }

        public Node getNext()
        {
            return next;
        }

        public void setNext(Node next)
        {
            this.next = next;
        }
    }

    private Node front;
    private Node back;
    private int numOfCarts;

    public Store()
    {
        front = new Node(null, null, null);
        back = new Node(null, front, null);
        front.setNext(back);
        numOfCarts = 0;
    }

    public void addFirst(E e)
    {
        Node n = new Node(e, front, front.getNext());
        Node next = front.getNext();
        front.setNext(n);
        next.setPrev(n);
        numOfCarts+=1;
    }

    public void addLast(E e)
    {
        Node n = new Node(e, back.getPrev(),back);
        Node prev = back.getPrev();
        back.setPrev(n);
        prev.setNext(n);
        numOfCarts+=1;
    }

    public E removeFirst()
    {
        if(size > 0)
        {
            E val = (E) front.getNext().getCart();
            Node n = front.getNext().getNext();
            front.setNext(n);
            n.setPrev(front);
            numOfCarts-=1;
            return val;
        }
        return null;
    }

    public E removeLast()
    {
        if(size > 0)
        {
            E val = (E) back.getPrev().getCart();
            Node n = back.getPrev().getPrev();
            back.setPrev(n);
            n.setNext(back);
            numOfCarts-=1;
            return val;
        }
        return null;
    }

    public E getFirst()
    {
        if(size > 0)
        {
            return (E) front.getNext().getCart();
        }
        return null;
    }

    public E getLast()
    {
        if(size > 0)
        {
            return (E) back.getPrev().getCart();
        }
        return null;
    }
}
