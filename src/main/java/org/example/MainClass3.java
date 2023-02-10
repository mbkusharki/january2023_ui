package org.example;

public class MainClass3
{
    public int max(int X, int Y)
    {
        if (X > Y)
            return X;
        else
            return Y;

    }
    public int Multiplication(int K, int P)
    {
        return K*P;
    }
    public int Subtraction(int K, int P){
        return K-P;

    }
    public int Division(int K, int P){
        return K/P;
    }
    public int Division(){
        return 20/2;
    }
    public static void main(String[] args)
    {
        //Create an Object of MainClass2
        MainClass3 lateef = new MainClass3();
        System.out.println(lateef.max(100,30));
        System.out.println(lateef.Multiplication(6,7));
        System.out.println(lateef.Division(10,2));
        System.out.println(lateef.Subtraction(100,90));
        System.out.println(lateef.Division());
    }
}
