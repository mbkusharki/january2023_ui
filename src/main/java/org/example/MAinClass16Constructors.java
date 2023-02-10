package org.example;

public class MAinClass16Constructors
{
    int modelYear;
    String modelName;
    public MAinClass16Constructors(int year, String name)
    {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        MAinClass16Constructors alice = new MAinClass16Constructors(2023, "Audi");
        System.out.println(alice.modelName + " " + alice.modelYear);
    }
}
