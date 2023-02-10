package org.example;

public class MainClass1
{
    public static void main(String[] args) {
        int A = 2;
        String B = "Hello World";
        System.out.println(A);
        System.out.println(B);

//        Use "+" sign to concatenate
        System.out.println(A + " " + B);

        //Addition
        int C = 5;
        int D = A + C;
        System.out.println(D);

        //Subtraction
        int E = 20-3;
        System.out.println(E);

        // Adding E and D
        System.out.println(E + D);

        //Multiplication
        int G = C*A;
        System.out.println(G);

//        Division
        int H = G/A;
        System.out.println(H);

        //Modulos
        int I = C%A;
        System.out.println(I);
    }
}
