package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class VowelConsonant {

    public static boolean isProperString(String str)
    {
        if(!str.matches ("[a-zA-Z]+"))
        {
//           System.out.println("Error! Given Input is not alphabet");
           return false;
        }
        else
            return true;
    }

    public static boolean checkForVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' ||ch=='E' || ch=='I' ||ch=='O' || ch=='U'){
//            System.out.println(ch+ "-->Vowel");
            return true;
        }
        else
            return  false;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int flag=0;

        if(!isProperString(str))
        {
            System.out.println("Error! Given Input is not alphabet");
        }
        else
        {
            for(int i=0;i<str.length();i++)
            {
                if(checkForVowel(str.charAt(i)))
                {
                    System.out.println(str.charAt(i)+ "-->Vowel");
                }
                else
                {
                    System.out.println(str.charAt(i)+ "-->Consonant");
                }

            }
        }

    }
}



