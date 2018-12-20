package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ConditionalCheck {
    public static boolean checkEven(long num)
    {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean liesInRange(long num)
    {
        if(num > 20 && num < 30)
            return true;
        else
            return false;
    }

    public static void main(String args[])  {

        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        boolean checkForEven = checkEven(num);

        boolean inRange = liesInRange(num);

        if ((num % 2 != 0) && (num > 20 && num < 30))
        {
            System.out.println("Tom");
        }
        if ((num % 2 == 0) && (num > 20 && num < 30))
        {
            System.out.println("Jerry");
        }
    }
}

