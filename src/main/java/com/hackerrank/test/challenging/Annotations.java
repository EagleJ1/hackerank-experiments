package com.hackerrank.test.challenging;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by jackalhan on 2/7/17.
 */
public class Annotations {

    @Target(ElementType.METHOD)   // @Target, we can specify where our annotation can be used. For example, the  annotation can only be used with the method in a clas
    @Retention(RetentionPolicy.RUNTIME)   // @Retention defines whether the annotation is available at runtime.
    @interface FamilyBudget {
        String userRole() default "GUEST";
        int budgetLimit() default 0;
    }

    static class FamilyMember {
        @FamilyBudget(userRole = "SENIOR", budgetLimit = 100)
        public void seniorMember(int budget, int moneySpend) {
            System.out.println("Senior Member");
            System.out.println("Spend: " + moneySpend);
            System.out.println("Budget Left: " + (budget - moneySpend));
        }
        @FamilyBudget(userRole = "JUNIOR", budgetLimit = 50)
        public void juniorUser(int budget, int moneySpend) {
            System.out.println("Junior Member");
            System.out.println("Spend: " + moneySpend);
            System.out.println("Budget Left: " + (budget - moneySpend));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String role = in.next();
            int spend = in.nextInt();
            try {
                Class annotatedClass = FamilyMember.class;
                Method[] methods = annotatedClass.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(FamilyBudget.class)) {
                        FamilyBudget family = method
                                .getAnnotation(FamilyBudget.class);
                        String userRole = family.userRole();
                        int budgetLimit = family.budgetLimit();
                        if (userRole.equals(role)) {
                            if(budgetLimit>= spend){
                                method.invoke(FamilyMember.class.newInstance(),
                                        budgetLimit, spend);
                            }else{
                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            testCases--;
        }
    }

}
