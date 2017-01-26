package com.hackerrank.test.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jackalhan on 1/26/17.
 */
public class Day27_Testing {

    static class TestProfessorChallenge {

        List<Integer> ns = new ArrayList<>();
        int[] A = null;
        int t, n, k;

        public boolean isCancelled() {
            int studentsInAttendance = 0;

            for (int number : this.A) {
                if (number >= 0) {
                    studentsInAttendance++;
                }
            }

            return studentsInAttendance < k;
        }

        public void validate(int t, int n, int k, int... A) throws Exception {
            if ((t <= 5) == false) {
                throw new Exception(t + " is not less or equal to 5");
            }

            if ((n >= 1 && n <= 200) == false) {
                throw new Exception("n is not between 1 and 200");
            }

            if ((k >= 1 && k <= n) == false) {
                throw new Exception(k + " is not between 1 and " + n);
            }

            if (ns.contains(n)) {
                throw new Exception("The value of n must be distinct across all test cases");
            } else {
                ns.add(n);
            }

            boolean containsZero = false;
            boolean containsPositive = false;
            boolean containsNegative = false;
            for (int number : A) {
                if ((number >= -1000 && number <= 1000) == false) {
                    throw new Exception("An element of array is not between -1000 and 1000");
                }
                if (number == 0) {
                    containsZero = true;
                } else if (number > 0) {
                    containsPositive = true;
                } else if (number < 0) {
                    containsNegative = true;
                }
            }

            if ((containsZero && containsNegative && containsPositive) == false) {
                throw new Exception("The array A must have at least 1 zero, 1 positive integer and 1 negative integer");
            }
            this.A = A;
            this.t = t;
            this.k = k;
            this.n = k;
        }

        public TestProfessorChallenge() {

        }
    }
    static class ValidTestCase {

        int n, k;
        int[] A;
        public boolean cancelled;

        public ValidTestCase(int n, int k, boolean cancelled, int... A) {
            this.n = n;
            this.k = k;
            this.A = A;
            this.cancelled = cancelled;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String array = "";
            sb.append(this.n).append(" ").append(k);
            sb.append(System.lineSeparator());
            for (int number : A) {
                array += number + " ";
            }

            sb.append(array);
            return sb.toString();
        }

    }public static int generateRandom(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }

    public static void main(String args[]) throws Exception {

        List<ValidTestCase> vtc = new ArrayList<>();

        boolean toggleCancelled = false;

        //lectures
        int t = 5;
        TestProfessorChallenge test = new TestProfessorChallenge();
        System.out.println(t);
        int n;
        int k;
        int[] A;

        while (vtc.size() < 5) {

            //number of studants in class
            n = generateRandom(1, 20);

            //cancellation threashold
            k = generateRandom(1, n + 1);
            A = new int[n];

            for (int a = 1; a < n; a++) {
                A[a] = generateRandom(-1000, 1000);
            }

            try {
                test.validate(t, n, k, A);
                if (!toggleCancelled == test.isCancelled()) {
                    vtc.add(new ValidTestCase(n, k, test.isCancelled(), A));
                    toggleCancelled = !toggleCancelled;
                }

            } catch (Exception e) {

            }
        }

        for (ValidTestCase c : vtc) {
            System.out.println(c);
        }
    }
}
