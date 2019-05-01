package com.crazyloong.cat.Algorithms;

import edu.princeton.cs.algs4.Count;

/**
 * 计数器
 */
public class Counter implements Comparable<Counter>{

    //计数器ID
    private final String id;
    //计数值
    private int count = 0;

    public Counter(String id){
        this.id = id;
    }

    public void increment(){
        count++;
    }

    public int tally(){
        return count;
    }

    @Override
    public String toString(){
        return id+":"+count;
    }

    @Override
    public boolean equals(Object x){
        if (x == null) return false;
        if (this == x) return true;
        if (this.getClass() != x.getClass()) return false;
        Counter that = (Counter) x;
        if (this.count != that.count) return false;
        if (this.id != that.id) return false;
        return true;
    }

    @Override
    public int compareTo(Counter that) {
        if (this.count < that.count) {
            return -1;
        } else if (this.count > that.count) {
            return 1;
        }
        return 0;
    }

    /**
     * 比较两个计数器的大小
     * @param x
     * @param y
     * @return
     */
    public static Counter max(Counter x, Counter y){
        if (x.tally() > y.tally()){
            return x;
        } else {
            return y;
        }
    }
}
