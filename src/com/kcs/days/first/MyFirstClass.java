package com.kcs.days.first;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args){
        MyFirstClass myFirstClass = new MyFirstClass();{

            float ff = 5.6f;

            myFirstClass.notSatticmethod("Value");
            System.out.println(sayHi());
            myFirstClass.checThisNumber(50);
            System.out.println("Please insert a number");
            Scanner scaner = new Scanner(System.in);

            try {
                int numb = scaner.nextInt();
                System.out.println("Yuor number is -> " + numb);
            }catch (InputMismatchException e){
                System.out.println("Ivedete ne skaiciu");
            }

        }
    }

    private void notSatticmethod(String name){
        System.out.println(name);
        sayHi();

    }

    private static String sayHi(){


        return " Hi Andrius";
    }

    private void checThisNumber(int numb){
        if(numb >10 && numb < 60){
            System.out.println("Daugiau");
        }
         else if((numb >15)){
            System.out.println("Daugiau uz 15");
        }
        else{
            System.out.println("maziau");
        }
    }

}
