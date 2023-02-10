package task8Java;

public class multiplesTask
{
    public static void main(String[] args)
    {
        //initialise the string variables
        String multiple_three =  "Multiple of Three", multiple_five = "Multiple of Five",
                multiple_three_five = "Multiple Three and Five";
        for (int i = 1; i <= 100; i++)
        {
            if (i % 15 == 0)
            {
                System.out.println(multiple_three_five);
            }
            else if (i % 3  == 0 )
            {
                System.out.println(multiple_three);
            }
            else if (i % 5== 0)
            {
                System.out.println(multiple_five);
            } else System.out.println(i);
        }
    }
}
