package com.hackerrank.test.water;

import java.util.Scanner;

/**
 * Created by jackalhan on 2/17/17.
 */
public class Palindrome {
    public static int digit(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                StringBuffer sb=new StringBuffer(s);
                if(!Palindrome(sb.deleteCharAt(i).toString()))
                    return n-i-1;
                else
                    return i;
            }
        }
        return -1;
    }
    public static boolean Palindrome(String s){
        StringBuffer sb=new StringBuffer(s);
        String r=sb.reverse().toString();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=r.charAt(i))
                count++;
        }
        if(count>0)
            return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            System.out.println(digit(s));
        }
    }
}
