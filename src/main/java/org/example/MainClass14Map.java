package org.example;

import java.util.HashMap;
import java.util.Map;

public class MainClass14Map
{
    public static void main(String[] args) {
        //Creating object for map
        Map<String, Integer> map = new HashMap<>();
        map.put("Lateef", 30);
        map.put("Muhammad", 40);
        map.put("Selena", 25);
        map.put("Bob", 60);
        map.put("Tomiwa", 70);
        map.put("Alice", 35);
        System.out.println(map.get("Muhammad"));

        //Print out all entries in a Map
        for (Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
