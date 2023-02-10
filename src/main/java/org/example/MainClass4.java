package org.example;

public class MainClass4
{
    public static void main(String[] args)
    {
        MainClass2 mainClass2 = new MainClass2();
        System.out.println(mainClass2.max(200,30));

//      Logical operators

        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a!=b);
        System.out.println(c!=b);
        System.out.println(!(a>b));
    }
}
