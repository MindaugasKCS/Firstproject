package com.kcs.days.Fuorth;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {


        Map<String, Integer> number = new HashMap<>();

        number.put("Andrius", 22);
        number.put("Jonas", 12);
        number.put("Kaziukas", 33);
        number.put("Andrius", 45);

        for(String s : number.keySet()){
            System.out.println("key: " + s + " value " +number.get(s) );
        }
    }
}
