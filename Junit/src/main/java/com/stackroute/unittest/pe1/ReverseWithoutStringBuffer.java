package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ReverseWithoutStringBuffer{

    public static String getReverse(String str)
    {
        char [] temp=str.toCharArray();
        String rev="";

        for(int i=temp.length-1;i>=0;i--)
        {
            rev=rev+temp[i];
        }
       return rev;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str=sc.next();

        String rev=getReverse(str);

        System.out.println(rev);
    }
}