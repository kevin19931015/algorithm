package com.kevin.one;

import java.util.Iterator;

public class Test {
    public  static void main(String[] args){
        double[] doubles = {1.0,2,6,3,8,4,7};
        //获取最大值
        System.out.println(Array.getMaxOfArray(doubles));
        //获取平均值
        System.out.println(Array.getAverageOfArray(doubles));
        //复制数组
        double[] doubles1 = Array.getCopyOfArray(doubles);
        for (double d:doubles1){
            System.out.print(d+" ");
        }
        System.out.println();
        //颠倒数组
        doubles = Array.disOrder(doubles);
        for (double d:doubles){
            System.out.print(d+" ");
        }
        System.out.println();
        //方阵相乘
        double[][] doubles2 = {{1,2,3},{4,5,6},{7,8,9}};
        double[][] doubles3 = Array.matrixMultiply(doubles2,doubles2);
        for(int i=0;i<doubles3.length;i++){
            for(int j=0;j<doubles3[i].length;j++){
                System.out.print(doubles3[i][j]+" ");
            }
            System.out.println();
        }
        //素数测试
        System.out.println(Math.isPrime(6));
        //计算平方根
        System.out.println(Math.sqrt(72900));
        //字符串表达式
        System.out.println(Math.Evaluate("(((4*(1+2))-9)/10)"));
        //SimpleStack类测试
        SimpleStack ss = new SimpleStack(0);
        ss.push("a");
        ss.push("b");
        ss.push("c");
        ss.push(1);
        for(Object s :ss){
            System.out.println(s);
        }
    }
}
