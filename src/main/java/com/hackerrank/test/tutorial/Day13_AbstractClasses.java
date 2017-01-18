package com.hackerrank.test.tutorial;

import java.util.Scanner;

/**
 * Created by jackalhan on 1/16/17.
 */
public class Day13_AbstractClasses {

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Book new_novel=new MyBook(title,author,price);
        new_novel.display();

    }

    static class MyBook extends Book {

        private int price;

        MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        void display() {

            System.out.format("Title: %s\n", this.title);
            System.out.format("Author: %s\n", this.author);
            System.out.format("Price: %s\n", this.price);
        }
    }

    static abstract class Book
    {
        String title;
        String author;
        Book(String t,String a){
            title=t;
            author=a;
        }
        abstract void display();


    }
}
