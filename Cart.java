package com.company;

public class Cart {
    private static class Node{
        private Products element;
        private Node next;
        public Node (Products p, Node n){
            element = p;
            next = n;

        }

        public Products getCost(){
            return element;
        }

        public void setCost(Products p){
            element = p;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node next){
            this.next = next;
        }
    }
    private Node head, tail;
    private int size;
    private int amount;

    public Cart(){
        head = null;
        tail = null;
        size = 0;
    }

    public Node getFirst(){
        if(size == 0){
            return null;
        }
        return head;
    }

    public Node getLast(){
        if(size == 0){
            return null;
        }
        return tail;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount (int amount){
        this.amount = amount;
    }
}
