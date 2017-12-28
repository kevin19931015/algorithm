package com.kevin.one;

import java.util.Iterator;
import java.util.function.Consumer;

public class SimpleStack<T> implements Iterable<T>{
    //栈中实际元素数量
    private int N;
    //底层数组
    private T[] elements;
    //构造函数
    public SimpleStack(int cap) { elements =  (T[])new Object[cap<10?10:cap]; }
    //判断是否为空
    public boolean isEmpty(){return N==0;}
    //获取元素数量
    public int getSize(){return N;}
    //增加一个元素
    public void push(T element){
        if(elements.length==N)resize(2*N);
        elements[N++]=element;
    }
    //栈中拉取一个元素
    public T pop(){
        T t = elements[--N];
        elements[N]=null;
        if(N==elements.length/4) resize(elements.length/2);
        return t;
    }
    //调整底层数组大小
    public void resize(int newSize){
        T[] newElements = (T[]) new Object[newSize];
        for(int i=0;i<elements.length;i++){
            newElements[i]=elements[i];
        }
        elements = newElements;
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T>{

        private int i = N;

        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public T next() {
            return elements[--i];
        }
    }
}
