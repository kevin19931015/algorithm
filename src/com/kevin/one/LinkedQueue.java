package com.kevin.one;

import java.util.Iterator;

public class LinkedQueue<T> implements Iterable<T>{

    private class Node{
        public T item;
        public Node next;
    }
    private Node first;
    private Node last;
    private int N;
    public boolean isEmpty(){return N==0;}
    public int size(){return N;}
    public void push(T item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        if(isEmpty())first=last;
        else  oldlast.next = last;
        N++;
    }
    public T pop(){
        T item = first.item;
        first = first.next;
        N--;
        if(isEmpty()) last=null;
        return item;
    }
    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<T>{

        private Node next = first;
        @Override
        public boolean hasNext() {
            return next!=null;
        }

        @Override
        public T next() {
            T item = next.item;
            next = next.next;
            return item;
        }
    }
}
