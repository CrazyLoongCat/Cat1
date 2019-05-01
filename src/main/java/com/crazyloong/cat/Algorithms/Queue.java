package com.crazyloong.cat.Algorithms;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<Item> implements Iterable<Item>{
    private Node<Item> first;
    private int n;

    public Queue(){
        first = null;
        n = 0;
    }


    private static class Node<Item>{
        private Item item;
        private Node<Item> next;
    }

    /**
     * 添加元素
     * @param item
     */
    public void enqueue(Item item){
        Node<Item> next = new Node();
        next.item = item;
        next.next = first;
        first = next;
        n++;
    }

    /**
     * 删除最早添加的元素
     * @return
     */
    public Item dequeue(){
        Node<Item> newfirst = first.next;
        Item item= first.item;
        first = newfirst;
        return item;
    }


    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return n;
    }
    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator(first);
    }

    private static class QueueIterator<Item> implements Iterator<Item>{
        private Node<Item> current;

        private QueueIterator(Node<Item> node){
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
