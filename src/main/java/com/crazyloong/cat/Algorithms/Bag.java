package com.crazyloong.cat.Algorithms;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item> {
    //包中的第一个元素
    private Node<Item> first;
    //包中的总数
    private int n;

    public Bag(){
        first = null;
        n = 0;
    }

    private static class Node<Item>{
        private Item item;
        private Node<Item> next;
    }

    public void add(Item item){
        Node<Item> oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return n;
    }

    @Override
    public Iterator<Item> iterator() {

        return new BagIterator(first);
    }

    private static class BagIterator<Item> implements Iterator<Item>{

        private Node<Item> current;

        private BagIterator(Node<Item> node){
            current = node;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
