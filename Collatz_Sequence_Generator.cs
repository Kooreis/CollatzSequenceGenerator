using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter a number: ");
        int number = Convert.ToInt32(Console.ReadLine());

        while (number != 1)
        {
            Console.Write(number + " ");
            if (number % 2 == 0)
            {
                number = number / 2;
            }
            else
            {
                number = 3 * number + 1;
            }
        }
        Console.Write(number);
    }
}