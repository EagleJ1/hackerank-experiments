package com.hackerrank.test.tutorial;

/**
 * Created by jackalhan on 2/3/17.
 */
public class _Linked_List {
    static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }

        /*
        // Append a new element to the end of the linked list.
        public void append(int data) {
            //pointer, start with the current node, head of the linkedlist
            Node current = this;

            // we are looping until the end of the linked list.
            // in order to understand the end of the linked list, look at the next element.
            // is next element is null or not
            while (current.next != null) {
                //if not null, keep moving.
                current = current.next;
            }
            // so when we come to the end of the linked list.
            // create this new node with the given data.
            current.next = new Node(data);
        }

        // if we want to change the head value of the linked list, it may cause some issue with this structure.
        // how does everybody else know that our head value changed?
        // Workaroung is, rather than giving everybody an access to the head pointer directly,
        // we can define a class linked list to wrap our head element.
        // therefore append method also will be in the same class.

        */
    }

    static class LinkedList {
        Node head;

        public void append(int data) {

            //if head is null, so we are creating a head element and return it.
            if (head == null) {
                head = new Node(data);
                return;
            }

            //pointer, start with the current node, head of the linkedlist
            Node current = head;

            // we are looping until the end of the linked list.
            // in order to understand the end of the linked list, look at the next element.
            // is next element is null or not
            while (current.next != null) {
                //if not null, keep moving.
                current = current.next;
            }
            // so when we come to the end of the linked list.
            // create this new node with the given data.
            current.next = new Node(data);
        }

        // with prepend method, we are going to create a new head to the existing list.
        // let us say that the current list is like following : 1 -> 5 -> 3 -> 7
        // with prepend, we want to add a new head to the begining such as following : 9 -> 1 -> 5 -> 3 -> 7
        public void prepend(int data) {
            Node newHead = new Node(data);
            newHead.next = head;
            head = newHead;
        }

        // with delete method, we are going to delete the first node that has a particular value.
        public void deleteWithValue(int data) {
            if (head == null) {
                return;
            }

            // in order to prevent to delete head element of the list
            // we need to have special case
            if (head.data == data) {
                head = head.next;
                return;
            }

            // so basically, what i am going to do is to remove my pointer's next data link on deleted element and
            // link it to the deleted element's next.

            Node current = head; // walk through the linked list
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }


        }

    }
}
