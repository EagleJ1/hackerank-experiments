package com.hackerrank.test.tutorial;

/**
 * Created by jackalhan on 2/16/17.
 */
public class _LinkedList_by_DerekBananas {

    public static class Link {
        public String bookName;
        public int millionsSold;

        public Link next;

        public Link(String bookName, int millionsSold) {
            this.bookName = bookName;
            this.millionsSold = millionsSold;
        }

        public void display() {
            System.out.println(bookName + ": " + millionsSold + ",000,000");
        }

        public String toString() {
            return bookName;
        }
    }

    public static class LinkedList {
        Link firstLink;

        public LinkedList() {
            // Here to show the first Link always starts as null
            firstLink = null;
        }

        public boolean isEmpty() {
            return (firstLink == null);
        }

        public void insertFirst(String bookName, int millionsSold) {
            Link newLink = new Link(bookName, millionsSold);
            // you now know the address for the guy who moved to town previous me
            // firstlink was a firstlink before me. After me, it is going to be the second item.
            // Therefore, my next item will be the old firstlink.

            newLink.next = firstLink;

            // I will be the new first link.
            firstLink = newLink; // firstlink is the last guy move in the town
        }

        public Link removeFirst() {
            Link linkReference = firstLink;
            if (!isEmpty()) {
                firstLink = firstLink.next;
            } else {
                System.out.println("Empty LinkedList");
            }
            return linkReference;
        }

        public void displayAll() {
            Link theLink = firstLink;
            while (theLink != null) {
                theLink.display();
                System.out.println("Next Link: " + theLink.next);
                theLink = theLink.next;
            }
        }

        public Link searchLink(String bookName) {
            Link theLink = firstLink;
            while (theLink != null) {
                if (theLink.bookName == bookName) {
                    theLink.display();
                    return theLink;
                } else {
                    theLink = theLink.next;
                }
            }
            return theLink;

            /*
            if (!isEmpty()){
                while (theLink.bookName != bookName){
                    if (theLink.next == null){
                        return null;
                    }
                    else
                    {
                        theLink = theLink.next;
                    }
                }
            } else
            {
                System.out.println("Empty LinkedList");
            }
            * */
        }

        public Link removeAnyLink(String bookName) {
            Link currentLink = firstLink;
            Link previousLink = firstLink;
            // Keep searching as long as a match isn't made
            while (currentLink.bookName != bookName) {

                // Check if at the last Link in the LinkedList
                if (currentLink.next == null) {
                    // bookName not found so leave the method
                    return null;
                } else {
                    previousLink = currentLink;
                    currentLink = currentLink.next;
                }

            }

            if (currentLink == firstLink) {
                // If you are here that means there was a match
                // in the reference stored in firstLink in the
                // LinkedList so just assign next to firstLink
                firstLink = firstLink.next;
            } else {
                // If you are here there was a match in a Link other
                // than the firstLink. Assign the value of next for
                // the Link you want to delete to the Link that's
                // next previously pointed to the reference to remove

                System.out.println("FOUND A MATCH");
                System.out.println("currentLink: " + currentLink);
                System.out.println("firstLink: " + firstLink);

                previousLink.next = currentLink.next;
            }
            return currentLink;
        }
    }

    public static void main(String[] args) {
        LinkedList theLinkedList = new LinkedList();
        theLinkedList.insertFirst("ooo", 500);
        theLinkedList.insertFirst("aaa", 500);
        theLinkedList.insertFirst("bbb", 500);
        theLinkedList.insertFirst("ccc", 500);
        theLinkedList.insertFirst("ddd", 500);
        theLinkedList.insertFirst("eee", 500);
        //reverse order
        theLinkedList.displayAll();
        System.out.println("******************************************");
        System.out.println("Remove First Item");
        theLinkedList.removeFirst();
        theLinkedList.displayAll();

        System.out.println("******************************************");
        System.out.println("Search for the ccc");
        System.out.println(theLinkedList.searchLink("ccc") + " was found");

        System.out.println("******************************************");
        System.out.println("Remove the ooo");
        theLinkedList.removeAnyLink("ooo");

        System.out.println("******************************************");
        System.out.println("Display all items");
        theLinkedList.displayAll();
    }


}
