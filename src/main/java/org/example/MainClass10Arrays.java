package org.example;

public class MainClass10Arrays
{
    public static void main(String[] args)
    {
        String[] languages = {"English", "French", "Spanish", "Yoruba", "Igbo", "Hausa", "Ibibio"};

        System.out.println("First Language is : " + languages[0]);
        System.out.println("Third Language is : " + languages[2]);

        System.out.println("The lenght of my languages array is : " + languages.length);

//        System.out.println(languages[7]);

        //printout all the items in the array using for - each loop

        for (String i: languages)
        {
            System.out.println(i);
        }

        for (int k = 0; k < languages.length; k++)
        {
            System.out.println(languages[k]);
        }
    }
}
