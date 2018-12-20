package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class LastNCharactersRepeating {
    public static String lastNCharac(String input1,int input2)
    {
        char[] temp = input1.toCharArray();
        int n=temp.length-input2;
        String lastNCharacters="";

        for(int i=n;i<=temp.length-1;i++)
        {
            lastNCharacters=lastNCharacters+temp[i];
        }
        return lastNCharacters;
    }

    public static String getResult(String input1,int input2,String lastNCharacters)
    {
        char[] temp = input1.toCharArray();
        int n=temp.length-input2;
        String newString=input1;
        for(int j=1;j<=n;j++)
        {
            newString=newString+lastNCharacters;
        }
        return newString;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String input1 = sc.next();
        int input2 = sc.nextInt();

        String lastNCharacters = lastNCharac(input1,input2);
        String result = getResult(input1,input2,lastNCharacters);

        System.out.println(result);
    }
}
