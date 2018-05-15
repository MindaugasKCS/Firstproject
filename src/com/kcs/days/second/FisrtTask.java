package com.kcs.days.second;

import java.sql.SQLOutput;

public class FisrtTask {
    private static final String PALINDROME_1 = "KOL EINU SUNIE LOK";// cia konstantos//
    private static final String PALINDROME_2 = "ARGI TEN NE TIGRA";
    private static final String PALINDROME_3 = "SEDK UZU KEDES";

    public static void main(String[] args) {
        String[] palindromeMas = {PALINDROME_1, PALINDROME_2,PALINDROME_3};
        for (String p: palindromeMas  ){
            if (istWordIsPalindrome(p.replaceAll(" ", ""))){

            }else{
                System.out.println( "Nepolindromas");
            }
        }

       /*boolean isPalindrome =istWordIsPalindrome("kol einu sunie lok".replaceAll(" ", ""));
       if (isPalindrome){
           System.out.println("Tai yra polindromas");
       }else{
           System.out.println("Tai nera polindromas");
       }*/
    }
    private static boolean istWordIsPalindrome(String word){
        boolean isPalindrome = true;
        for (int i =0; i < word.length(); i++){
            char a = word.charAt(i);
            char b = word.charAt(word.length()-1 -i);

            if(a != b){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
