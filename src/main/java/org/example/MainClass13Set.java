package org.example;

import com.sun.source.doctree.SeeTree;


import java.util.HashSet;
import java.util.Set;

public class MainClass13Set
{
    public static void main(String[] args)
    {
        Set<String> cars = new HashSet<>();
        cars.add("Toyota");
        cars.add("Ferari");
        cars.add("Nissan");
        cars.add(" ");
        cars.add("Landrover");
        cars.add("Mercedez");
        cars.add("Mercedez");
        for (String i: cars)
            System.out.println(i);
        System.out.println(cars);
    }
}
