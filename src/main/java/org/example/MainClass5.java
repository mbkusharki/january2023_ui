package org.example;

public class MainClass5 {
    public static void main(String[] args)
    {
        int x = 10;
        int sumA = 10 + 20;
        int sumB = sumA + 30;
        System.out.println(sumA);
        System.out.println(sumB);
        System.out.println(myValueForX());
        //Logical And
        System.out.println(x<10 && x<20);

        //Logical OR
        System.out.println(x<10 || x<20);

        //Logical NOT
        System.out.println(!(x<10 && x<20));
    }
    private static int myValueForX(){
        return 10;
    }
}
