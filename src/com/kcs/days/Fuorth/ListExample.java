package com.kcs.days.Fuorth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add (12);
        numbers.add (333);
        numbers.add (44);
        List<String> names = new LinkedList<>();
        names.add ("Andrius");
        names.add ("Jonas");
        names.add ("Gintas");
        printList(numbers);
    }
    private static void printList (List<Integer> numbers){
        System.out.println( numbers.size());
        System.out.println( numbers.isEmpty());
        System.out.println( numbers.contains(333));
        for (Integer number : numbers){
            System.out.println( number);
        }
        numbers.forEach(System.out:: println);
    }
}
