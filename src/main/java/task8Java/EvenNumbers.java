package task8Java;

public class EvenNumbers
{
    public static void main(String args[])
    {
        int num=21;
        System.out.print("List of even numbers from 1 to "+num+": ");
        for (int i=1; i<=num; i++)
        {
//logic to check if the number is even or not
//if i%2 is equal to zero, the number is even
            if (i%2==0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
