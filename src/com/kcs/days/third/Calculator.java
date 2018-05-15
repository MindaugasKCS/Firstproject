package com.kcs.days.third;

public class Calculator {
    public double suma(double numb1, double numb2){
        return numb1 +numb2;
    }

    public double minus(double numb1, double numb2){
        return numb1 - numb2;
    }

    public double division (double numb1, double numb2){
        return numb1 /numb2;
    }
    public double multiplication(double numb1, double numb2){
        return numb1 *numb2;
    }
    public double pow (double numb1, int degree){
        return Math.pow(numb1, degree);
    }
}
