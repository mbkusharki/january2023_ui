package org.example;

public class MainClass2
{
    public int max(int X, int Y)
    {
        if (X > Y)
            return X;
        else
            return Y;

    }
    public static void main(String[] args)
    {
        //Create an Object of MainClass2
        MainClass2 mainClass2 = new MainClass2();
        System.out.println(mainClass2.max(100,30));
    }

}
