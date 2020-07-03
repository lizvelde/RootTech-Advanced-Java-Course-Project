public class Cart {
    private static class Node{
        private Products element;
        private Node next, prev;
        public Node (Products product, Node p, Node n){
            element = product;
            prev = p;
            next = n;

        }

        public Products getElement(){
            return element;
        }

        public void setElement(Products product){
            element = product;
        }

        public Node getPrev(){
            return prev;
        }

        public void setPrev(Node prev){
            this.prev = prev;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node next){
            this.next = next;
        }
    }
    private Node header, trailer;
    private int size;
    private int amount;

    public Cart(){
        header = new Node(null, null, null);
        trailer = new Node(null, null, null);
        header.setNext(trailer);
        size = 0;
    }

    public int getAmount(Products product){
        Node n = header.getNext();
        int amount = 0;
        while(n != null){
            if(n.getElement().getProductName() == product.productName()){
                amount++;
            }
		n = n.getNext();
        }
        return amount;
    }

    public int totalProducts(){
        return size;
    }
	
    public boolean isEmpty(){
	if(size() == 0){
	    return true;
	}
	return false;
    }

    public void addProducts(int amount, Products product){
        for(int i = 0; i <= amount; i++){
            Node n = header.getNext();
            Node newItem = new Node (product, header, header.getNext());
            header.setNext(newItem);
            n.setPrev(newItem);
            size++;
        }
    }

    public void removeProducts(int amount, Products product){
        Node n = header.getNext();
        int count = 0;
        while (count <= amount){
            if(n.getElement() == product){
                Node temp = n;
                n = null;
                n.getPrev().setNext(n.getNext());
                n.getNext().setPrev(temp.getPrev());
                count++;
                size--;
            }
        }
    }

    public double totalCost(){
        Node n = header.getNext();
        double total = 0;
        while(n != null){
            total += n.getElement().getPrice();
            n = n.getNext();
        }
        return total;
    }

	public static void removeProducts(int i, String string) {
	}

	public static void secondProductRemove(int i, String string) {
	}

}
