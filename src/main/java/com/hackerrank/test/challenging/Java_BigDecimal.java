package com.hackerrank.test.challenging;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by jackalhan on 2/8/17.
 */
public class Java_BigDecimal {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

   Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() {
       @Override
       public int compare(String s1, String s2) {
           BigDecimal bigDecimal1 = new BigDecimal(s1);
           BigDecimal bigDecimal2 = new BigDecimal(s2);
           return bigDecimal1.compareTo(bigDecimal2);
       }
   }));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
