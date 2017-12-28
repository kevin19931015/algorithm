package com.kevin.one;

public class SimpleStack<T> {
    private int N;
    private T[] t;
    public SimpleStack(int cap) { t =  (T[])new Object[cap]; }
    public boolean isEmpty(){return N==0;}
    public int getSize(){return N;}
    public void push(T i){t[N++]=i;}
    public T pop(){return t[--N];}
}
