package com.hackerrank.test.challenging;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Permission;

/**
 * Created by jackalhan on 2/7/17.
 */
public class Can_You_Access {
    public static void main(String[] args) throws Exception {
        DoNotTerminate.forbidExit();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o = new Inner().new Private(); // Must be used to hold the reference of the instance of the class Solution.Inner.Private
            System.out.println(num + " is " + ((Inner.Private) o).powerof2(num));
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        }//end of try

        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                /*

                The function returns boolean (true / false) and accepts one incoming parameter of type unsigned long (x, in this case). Let us for the sake of simplicity assume that someone has passed the value 4 and called the function like so:

                bool b = IsPowerOfTwo(4)
                Now we replace each occurrence of x with 4:

                return (4 != 0) && ((4 & (4-1)) == 0);
                Well we already know that 4 != 0 evals to true, so far so good. But what about:

                ((4 & (4-1)) == 0)
                This translates to this of course:

                ((4 & 3) == 0)
                But what exactly is 4&3?

                The binary representation of 4 is 100 and the binary representation of 3 is 011 (remember the & takes the binary representation of these numbers. So we have:

                100 = 4
                011 = 3
                Imagine these values being stacked up much like elementary addition. The & operator says that if both values are equal to 1 then the result is 1, otherwise it is 0. So 1 & 1 = 1, 1 & 0 = 0, 0 & 0 = 0, and 0 & 1 = 0. So we do the math:

                100
                011
                ----
                000
                The result is simply 0. So we go back and look at what our return statement now translates to:

                return (4 != 0) && ((4 & 3) == 0);
                Which translates now to:

                return true && (0 == 0);
                return true && true;
                We all know that true && true is simply true, and this shows that for our example, 4 is a power of 2.


                * */

                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }//end of Inner


    static class DoNotTerminate { //This class prevents exit(0)

        public static class ExitTrappedException extends SecurityException {

            private static final long serialVersionUID = 1L;
        }

        public static void forbidExit() {
            final SecurityManager securityManager = new SecurityManager() {
                @Override
                public void checkPermission(Permission permission) {
                    if (permission.getName().contains("exitVM")) {
                        throw new ExitTrappedException();
                    }
                }
            };
            System.setSecurityManager(securityManager);
        }
    }


}
