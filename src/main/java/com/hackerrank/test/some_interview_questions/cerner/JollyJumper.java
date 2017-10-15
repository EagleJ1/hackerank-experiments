package com.hackerrank.test.some_interview_questions.cerner;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by jackalhan on 10/14/17.
 */
public class JollyJumper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer tokenizer;
        while (scanner.hasNext()) {
            tokenizer = new StringTokenizer(scanner.nextLine());
            int[] numbers = new int[tokenizer.countTokens()];
            for (int i = 0; i < numbers.length; ++i) {
                numbers[i] = Integer.parseInt(tokenizer.nextToken());
            }

            isJolly(numbers);

            //            if(tokenizer.nextToken().matches("^[0-9]+$"))
            //            {
            //                numbers[]= Integer.parseInt(tokenizer.nextToken());
            //            }

        }
    }

    private static boolean isJolly(int[] numbers) {
        System.out.println(numbers.length);
        int main_result = numbers.length - 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            int sub_result = Math.abs(numbers[i] - numbers[i + 1]);
            main_result -= 1;
            if (sub_result == 0) {
                System.out.println(JollyJumperEnum.NOT_JOLY);
                return false;
            } else if (sub_result >= numbers.length) {
                System.out.println(JollyJumperEnum.NOT_JOLY);
                return false;
            } else if (sub_result != main_result) {
                System.out.println(JollyJumperEnum.NOT_JOLY);
                return false;
            }
        }
        System.out.println(JollyJumperEnum.JOLY);
        return true;

    }
}
