package com.crazyloong.cat.Algorithms;

/**
 * 累加器
 */
public class Accumulator {
    //累加次数
    private int num = 0;
    //累加综合
    private double sum = 0.0;
    //平均值
    private double mu = 0.0;

    public void addDataValue(double val){
        num++;
        sum += val;
        mu = sum / num;
    }

    public double mean(){
        return mu;
    }


}
