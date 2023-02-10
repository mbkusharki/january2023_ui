package org.example;

import java.util.ArrayList;
import java.util.List;

public class MainClass12List
{
    public static void main(String[] args)
    {
        List<String> cars = new ArrayList<>();
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
