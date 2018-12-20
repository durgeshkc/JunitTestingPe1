package com.stackroute.unittest.pe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {

    public static boolean checkForRange(int total)
    {
        if(total>15)
            return true;
        else
            return false;
    }

    public static int getTotal(ArrayList<Integer> numbers)
    {
        int total = 0;
        for (int element : numbers)
        {
            if(element%2==0)
                total = total + element;
        }
        return total;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String [] tokens = sc.nextLine().split("\\s");

        int flag=1;
        for (int i = 0; i < tokens.length; i++)
        {
            try
            {
//                Integer.parseInt(input);
                numbers.add(Integer.parseInt(tokens[i]));
            }
            catch(NumberFormatException ex)
            {
                System.out.println("Error! Invalid Input");
                flag=0;
            }
        }
        Collections.sort(numbers);
        Collections.reverse(numbers);   // reverse order
        System.out.println(numbers);

        if(flag==1)
        {
            int total = getTotal(numbers);
            System.out.println("Sum of Even Numbers is= " + total );
            if(checkForRange(total))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
