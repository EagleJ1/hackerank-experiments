package com.hackerrank.test;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

/**
 * Created by jackalhan on 1/17/17.
 */
public class Fair_Rations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for (int B_i = 0; B_i < N; B_i++) {
            B[B_i] = in.nextInt();
        }
        String msg = "";
        if (N < 2) {
            msg = "NO";
        } else if (N == 2) {
            if (countOdds(B) == 2)
                msg = "2";
            else
                msg = "NO";
        } else {

            int oddIndex = 0;
            int sum = 0;
            boolean loop = true;
            while ((oddIndex > -1) && (loop == true) ) {
                if (oddIndex == B.length - 1) {
                    msg = "NO";
                    loop = false;
                } else {
                    oddIndex = getOddIndex(B);
                    if ((oddIndex != -1) && (oddIndex != B.length - 1) ) {
                        addByOne(B, oddIndex);
                        sum = sum + 2;
                    }
                    else
                    {
                        msg = String.valueOf(sum);
                    }
                }
            }

        }

        System.out.print(msg);
        in.close();

    }

    public static int countOdds(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 != 0) {
                sum++;
            }
        }
        return sum;
    }

    public static int getOddIndex(int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
    }

    public static void addByOne(int[] list, int oddIndex) {

        try {
            list[oddIndex] = list[oddIndex] + 1;
            list[oddIndex + 1] = list[oddIndex + 1] + 1;
        }catch (Exception ex)
        {
            System.out.print(ex.getStackTrace());
        }

    }
}
