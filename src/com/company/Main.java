package com.company;

import java.util.LinkedHashMap;
import java.util.function.BiConsumer;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<String, EnergyLevel> stringHashMap = new LinkedHashMap<>();
        String[] strings = {"eggs","bacon","bread","tea"};

        for(String string : strings){
            int ran = (int) (Math.random() * 3);
            EnergyLevel level = EnergyLevel.values()[ran];
            stringHashMap.put(string, level);
        }

        BiConsumer<String, EnergyLevel> BiConsumer = (k, v) ->  System.out.println(k+" "+v) ;
        stringHashMap.forEach(BiConsumer);
    }
}
