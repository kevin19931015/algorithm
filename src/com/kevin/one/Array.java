package com.kevin.one;

public class Array {

    //获取数组最大值
    public static double getMaxOfArray(double[] doubles){
        double d = doubles[0];
        for(int i=1;i<doubles.length;i++){
            if(d<doubles[i]){
                d=doubles[i];
            }
        }
        return d;
    }
    //计算数组平均值
    public static double getAverageOfArray(double[] doubles){
        double sum = 0;
        for(int i=0;i<doubles.length;i++){
            sum+=doubles[i];
        }
        return sum/doubles.length;
    }
    //复制数组
    public static double[] getCopyOfArray(double[] doubles){
        double[] doubles1 = new double[doubles.length];
        for(int i=0;i<doubles.length;i++){
            doubles1[i]=doubles[i];
        }
        return doubles1;
    }
    //颠倒数组顺序
    public static double[] disOrder(double[] doubles){
        int length = doubles.length;
        double tmp;
        for(int i=0;i<length/2;i++){
            tmp = doubles[i];
            doubles[i]=doubles[length-i-1];
            doubles[length-i-1]=tmp;
        }
        return doubles;
    }
    //方阵相乘
    public static double[][] matrixMultiply(double[][] a,double[][] b){
        int len =a.length;
        double[][] c = new double[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                for(int k=0;k<len;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
}
