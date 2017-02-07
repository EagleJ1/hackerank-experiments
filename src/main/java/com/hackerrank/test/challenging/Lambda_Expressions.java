package com.hackerrank.test.challenging;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jackalhan on 2/7/17.
 */
public class Lambda_Expressions {

    interface PerformOperation {
        boolean check(int a);
    }

    static class MyMath {
        public static boolean checker(PerformOperation p, int num) {
            return p.check(num);
        }

        PerformOperation is_odd() {
            return (num) -> num % 2 != 0;
        }

        PerformOperation is_prime() {
            return num -> {
                if (num == 1 || num == 2)
                    return true;
                if (num%2 == 0)
                    return false;
                return java.util.stream.IntStream.iterate(1, i -> i + 2).limit(num/2).noneMatch(i -> i%num==0);
            };
        }

        PerformOperation is_palindrome() {
            return num -> {
                char[] numC = String.valueOf(num).toCharArray();
                return java.util.stream.IntStream.range(0, numC.length/2).allMatch(i -> numC[i] == numC[numC.length-1-i]);
            };
        }
    }

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.is_odd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.is_prime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.is_palindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
