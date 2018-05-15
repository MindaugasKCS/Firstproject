package com.kcs.days.second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SecondTask secondTask = new SecondTask();

       while (true) {
           System.out.println("Pasirikikite kokios figuros plota skaiciuosite:\n 1 - Trikampis\n 2 - Staciakampis\n 3 - Kvaddratas\n 4 - Apskritimas\n 0 Baigti darba");
           int selectedMenuItem = (int)getCorectNumber(scanner);
           switch (selectedMenuItem) {
               case 1:
                   secondTask.triangle(scanner);
                   break;
               case 2:
                   secondTask.staciakampis(scanner);
                   break;
               case 3:
                   secondTask.kvadratas(scanner);
                   break;
               case 4:
                   secondTask.apskritimas(scanner);
                   break;
               case 0:
                   System.exit(0);
               default:
                   System.out.println("Neradome veiksmo pakartikite");
                   break;
           }
       }
    }

    private void triangle (Scanner scanner){
        System.out.println( "Iveskite a statini");
        double a = getCorectNumber(scanner);
        System.out.println( "Iveskite b statini");
        double b = getCorectNumber(scanner);
        System.out.println( "Trikampio plotas" +((a*b)/2));


    }
    private void staciakampis(Scanner scanner){
        System.out.println( "Iveskite a statini");
        double a = getCorectNumber(scanner);
        System.out.println( "Iveskite b statini");
        double b = getCorectNumber(scanner);
        System.out.println( "Staciakampio plotas" +(a*b));
    }
    private void kvadratas (Scanner scanner) {
        System.out.println("Iveskite a statini");
        double a = getCorectNumber(scanner);
        System.out.println("Iveskite b statini");
        double b = getCorectNumber(scanner);
        System.out.println("Kvadrato plotas" + (a * b));

    }
    private void apskritimas (Scanner scanner) {
        System.out.println("Iveskite r spinduli");
        double r = getCorectNumber(scanner);
        System.out.println("Kvadrato plotas" + (r*r)* 3.14);

    }
    private static double getCorectNumber(Scanner scanner){
        double result;
        while(true){
            try{
                result = scanner.nextDouble();
    /*            if (result < 1 || result >4){
                    throw new InputMismatchException("Blogas diapazonas");
                }*/
                break;
            }catch (InputMismatchException e){
                System.out.println("Blogas formatas pakartoti");
                scanner.nextLine();
            }
        }
        return result;
    }
}
