package com.hackerrank.test.challenging;

import java.io.IOException;
import java.security.Permission;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by jackalhan on 2/7/17.
 */
public class Calculating_Volume {

    static class Calculate {

        Scanner scanner = new Scanner(System.in);
        Display output;
        static final double pi = 3.14159265;
        public Calculate() throws IOException {
            scanner = new Scanner(System.in);
            output = new Display();
        }

        public static DoCalc do_calc() {
            return new DoCalc();
        }

        public final static class Display {
            public static void display(double volume) {
                System.out.println(String.format("%.3f", volume));
            }
        }

        public int get_int_val() {
            int num = Integer.valueOf(scanner.next());
            if (num <= 0) {
                throw new NumberFormatException("All the values must be positive");
            }
            return num;
        }

        public double get_double_val() {
            double num = Double.valueOf(scanner.next());
            if (num <= 0) {
                throw new NumberFormatException("All the values must be positive");
            }
            return num;
        }

        public final static class DoCalc {

            // ch = 1
            public int get_volume(int var) {
                return (int) Math.pow(var, 3);
            }

            // ch = 2
            public int get_volume(int l, int b, int h) {
                return l * b * h;
            }

            // ch = 3
            public double get_volume(double volume) {
                return pi * Math.pow(volume, 3) * 2 / 3;
            }

            // ch = 4
            public double get_volume(double r, double h) {
                return pi * Math.pow(r, 2) * h;
            }

        }



    }

    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T =
                    cal.get_int_val();
            while (T-- > 0) {
                double volume = 0.0;
                int ch = cal.get_int_val();
                if (ch == 1) {
                    int a = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(a);
                } else if (ch == 2) {
                    int l = cal.get_int_val();
                    int b = cal.get_int_val();
                    int h = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(l, b, h);

                } else if (ch == 3) {
                    double r = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r);

                } else if (ch == 4) {
                    double r = cal.get_double_val();
                    double h = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r, h);

                }
                cal.output.display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }


    } //end of main


    static class DoNotTerminate {

        public static class ExitTrappedException extends SecurityException {
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
    } //end of Do_Not_Terminate

}
