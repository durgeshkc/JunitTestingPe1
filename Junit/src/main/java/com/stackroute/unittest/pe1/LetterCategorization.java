package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class LetterCategorization {
    public static boolean isUpperCase(char ch)
    {
        if ((ch >= 65 && ch <= 90))
            return true;
        else
            return false;
    }

    public static boolean isLowerCase(char ch)
    {
        if ((ch >= 97 && ch <= 122))
            return true;
        else
            return false;
    }

    public static boolean isADigit(char ch)
    {
        if (ch >= 48 && ch <= 57)
            return true;
        else
            return false;
    }


    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);

        if (isUpperCase(ch))
            System.out.println ( " Upper Case ");

        if (isLowerCase(ch))
            System.out.println ( " Lower Case ");
            // CHECKING FOR DIGITS
        else if (isADigit(ch))
            System.out.println(" Digit ");

            // OTHERWISE SPECIAL CHARACTER
        else
            System.out.println ( " Special Character ");
    }


}
