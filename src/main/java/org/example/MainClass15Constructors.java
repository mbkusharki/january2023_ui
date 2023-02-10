package org.example;

public class MainClass15Constructors
{
    //Declaring class/member variable
    int x;
    public MainClass15Constructors(int y)
    {
       x = y;
    }

    public static void main(String[] args)
    {
        MainClass15Constructors myObj = new MainClass15Constructors(10);
        System.out.println(myObj.x);
    }
}
