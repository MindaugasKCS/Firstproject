/*Onutei sunkei sekasi mokytis matematiką ir ji neturi skaičiuotuvo, padėkite Onutei ir sukurkite skaičiuotuvą kuris atliktu:
a.       Sumos
        b.      Skirtumo
        c.       Dalybos, nepamirškite, kad dalyba iš nulio negalima!
        d.      Daugybos
        e.       Kėlimas laipsniu
        Skaičiuoto veiksmų skaičiavimai turi būti atskiroje klasėje. Onutei negalima leisti įvesti blogą skaičių ir netinkamą operaciją reikia prašyti pakartoti įvedimą.
        Onutė įvedinės veiksmus tokiu formatu : „12 + 12“, „50 - 15“ ir t.t.
        Onutei sunkei sekasi mokytis matematiką ir ji neturi skaičiuotuvo, padėkite Onutei ir sukurkite skaičiuotuvą kuris atliktu:
        a.       Sumos
        b.      Skirtumo
        c.       Dalybos, nepamirškite, kad dalyba iš nulio negalima!
        d.      Daugybos
        e.       Kėlimas laipsniu
        Skaičiuoto veiksmų skaičiavimai turi būti atskiroje klasėje.
        Onutei negalima leisti įvesti blogą skaičių ir netinkamą operaciją reikia prašyti pakartoti įvedimą.
        Onutė įvedinės veiksmus tokiu formatu : „12 + 12“, „50 - 15“ ir t.t.*/
package com.kcs.days.third;

import java.util.InputMismatchException;
import java.util.Scanner;


            public class FirstTask {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println( "Iveskite skaicius ir veiksma tarp ju pvz: „12 + 12“ ");

                    String line = scanner.nextLine();

                    String [] items =line.split(" ");
                    Calculator calculator = new Calculator();
                    double numb1, numb2;
                    int degree;
                    if (items.length ==3){
                        switch (items[1]){
                            case "+":
                                numb1 = getCorectNumber(items[0],scanner,"Iveskite pirma skaiciu");
                                numb2 = getCorectNumber(items[2],scanner,"Iveskite antra skaiciu");
                                System.out.println( "Suma " + calculator.suma(numb1, numb2));
                                break;
                            case "-":
                                numb1 = getCorectNumber(items[0],scanner,"Iveskite pirma skaiciu");
                                numb2 = getCorectNumber(items[2],scanner,"Iveskite antra skaiciu");
                                System.out.println( "Atimtis " + calculator.minus(numb1, numb2));
                                break;
                            case " / ":
                                numb1 = getCorectNumber(items[0],scanner,"Iveskite pirma skaiciu");
                                numb2 = getCorectNumber(items[2],scanner,"Iveskite antra skaiciu");
                                System.out.println( "Dalyba " + calculator.division(numb1, numb2));
                                break;
                            case "*":
                                numb1 = getCorectNumber(items[0],scanner,"Iveskite pirma skaiciu");
                                numb2 = getCorectNumber(items[2],scanner,"Iveskite antra skaiciu");
                                System.out.println( "Daugyba " + calculator.multiplication(numb1, numb2));
                                break;
                            case "^":
                                numb1 = getCorectNumber(items[0],scanner,"Iveskite pirma skaiciu");
                                degree = (int) getCorectNumber(items[2],scanner,"Iveskite antra skaiciu");
                                System.out.println( "Kelia laipsniu " + calculator.pow(numb1, degree));
                                break;
                            default:
                                System.out.println( "Nera tokio veiksmo mergyt");
                        }
                    }else{
                        System.out.println("Nepasiseke bandyk dar karta");
                    }
                }

                private static double getCorectNumber(String numb, Scanner scanner, String text){
                    double result;
                    try{
                        result = Double.parseDouble(numb);
                    }catch (NumberFormatException e){
                        while(true){
                            System.out.println( text);
                            try{
                                result = scanner.nextDouble();
                                break;
                            }catch (InputMismatchException ex){
                                System.out.println( "Prasau iveskite skaiciu");
                                scanner.nextLine();
                            }

                        }
                    }


                    return result;
        }
}
