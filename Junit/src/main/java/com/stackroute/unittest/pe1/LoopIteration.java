package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class LoopIteration {
    public static String getSequence(int n)
    {
        String s="";
        for(int i=1;i<=n;i++)
        {
            int temp=i;
            int j=i;
            while(j>0)
            {
                s=s+temp;
                j--;
            }
        }
        return s;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str=getSequence(n);
        System.out.println(str);
    }
}
