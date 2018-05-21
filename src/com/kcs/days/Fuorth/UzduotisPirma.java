package com.kcs.days.Fuorth;

import java.util.ArrayList;
import java.util.List;

public class UzduotisPirma {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add ("Andrius");
        names.add ("Mindaugas");
        names.add ("Edita");
        names.add ("Zygimantas");
        names.add ("Jonas");

        for (String name: names ){
            if (   name.length() > 6 ){
                System.out.println(name);
            }
        }
        getFirst(names);
        getLast(names);
    }
    private static String getFirst(List<String> names){
        System.out.println( "Pirmas vardas : " + names.get(0));
        return names.get(0);

    }
    private static String getLast(List<String> names){
        System.out.println( "Paskutinis vardas : " + names.get(names.size()-1));
    return names.get(names.size()-1);
    }
}
