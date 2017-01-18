package com.hackerrank.test.challenging;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jackalhan on 1/14/17.
 */
public class Masking {

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner (System.in);


        List<String> l = new ArrayList<String>();

        while (sc.hasNextLine() == true ) {
            l.add(sc.nextLine());
        }

        for(int j = 0 ; j < l.size();j++)
        {
            if (l.get(j).contains("E:")) {
                System.out.println("E:" + maskedEmail(l.get(j)));
            }
            else if ((l.get(j).contains("P:"))) {
                System.out.println("P:" + maskedNumber(l.get(j)));
            }

        }
    }

    public static String putStars(int number)
    {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<number;i++)
        {
            sb.append("*");
        }
        return sb.toString();
    }
    public static String maskedNumber(String number)
    {
        //+1 (333) 444-5678

        char[] actNumber = number.replace("P:","").replace("(","").replace(")","").replace("-","").replace("+","").replace(" ","").trim().toCharArray();
        int countryCode = actNumber.length - 10;

        StringBuilder stringBuilder = new StringBuilder();

        if (countryCode >0)
        {
            stringBuilder.append("+");
            for (int i = 0; i< countryCode ;i++)
            {
                stringBuilder.append("*");
            }
            stringBuilder.append("-");

        }
        int counter = 0;
            for (int i = 0; i<= actNumber.length - countryCode - 4 ;i++)
            {

                if (counter == 3 || counter == 7 ) {
                    stringBuilder.append("-");
                }
                else
                {
                    stringBuilder.append("*");
                }
                counter++;
            }
            stringBuilder.append("-");
            for (int i = countryCode + 6; i< actNumber.length ;i++)
            {

                stringBuilder.append(actNumber[i]);

            }

        return stringBuilder.toString();
    }

    public static String maskedEmail(String email) {

        String firstPart = email.replace("E:","").split("@")[0];
        StringBuilder sb = new StringBuilder(firstPart.length());
        sb.append(firstPart.substring(0,1));
        //for(int i = 0; i < firstPart.length(); i++)
        //{
            for(int j = 0 ; j < 5 ; j++) {
                sb.append("*");
            }
        //}
        sb.append(firstPart.substring(firstPart.length()-1,firstPart.length()));
        return sb.toString() + "@" +email.split("@")[1];
    }

}
