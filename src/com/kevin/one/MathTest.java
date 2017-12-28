package com.kevin.one;

public class MathTest {
    //判断一个数是不是素数
    public static boolean isPrime(int number){
        if(number<2)
            return false;
        /*
         *遍历小于number的数值寻找number的约数，如果除了1和本身，没有其他约数，则为素数。
         * 不需要从2遍历到number,只需要遍历2到sqrt(number)
         * 因为对于所有数字，它的约数都是两两对应的，且分布sqrt(number)两边
         * 比如50约数1,2,5,10,25,50,分布在7的两边1,2,5 < 7 < 10,25,50
         * 如果在2到7之间没有约数，则7到50(50除外)之间肯定也没有约数。
         * 所以只需要遍历2到7，大大减少了循环的次数
         */
        for(int i=2;i*i<=number;i++){
            if(number%i==0)
                return false;
        }
        return true;
    }
    //求平方根
    public static double sqrt(double c){
        if(c<0)return Double.NaN;
        double err = 1e-15;
        double t=c;
        while(Math.abs(t-c/t)>err*t){
            t=(c/t+t)/2.0;
        }
        return t;
    }
}
