package org.example;

public class MAinClass17Constructors
{
    int age;
    String firstName;
    String lastName;
    public MAinClass17Constructors(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args)
    {
        //create an object of a class of a different class
        MAinClass16Constructors cars = new MAinClass16Constructors(2020, "Honda");
        System.out.println(cars.modelName + " " + cars.modelYear);


        MAinClass17Constructors myStudent = new MAinClass17Constructors("Medinat", "Abdulsalam", 26);
        System.out.println(myStudent.age);
        System.out.println(myStudent.lastName);
    }

}
