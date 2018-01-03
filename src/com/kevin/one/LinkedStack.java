package com.kevin.one;

public class LinkedStack<T> {
    private class Node{
        public T item;
        public Node next;
    }
    private Node first;
    private int N;
    public boolean isEmpty(){return N==0;}
    public int size(){return N;}
    public void push(T item){
        Node oldnode = first;
        first = new Node();
        first.item = item;
        first.next = oldnode;
        N++;
    }
    public T pop(){
        T item = first.item;
        first = first.next;
        N--;
        return item;
    }
}
