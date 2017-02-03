package com.hackerrank.test.tutorial;

/**
 * Created by jackalhan on 2/3/17.
 */
public class _Linked_List_Cycles {

    // classical interview question.
    // Given a linked list, how to detect a cycle in the list

    // 5 -> 13 -> 4 -> 2 -> 7 -> 4
    // 7 is the place where it back loops to 4

    // We are going to use such a tecnique that imagine the linked list was like a
    // two cars driving around this racetrack, If the cars drive at different speeds,
    // if there is a loop, you know that they will eventally collide or pass in each other.
    // therefore we are going to use same technique.
    // we are going to have two pointers with different speeds (One pointer moves two nodes, the other one is one node)
    // they will eventually collide or be at the same node.
    // if there is no loop, they or one of them will reach the end of linked list.

    boolean hasCycle(Node head) {
        if (head == null) {
            return false; //NO CYCLE
        }

        //Two pointers
        Node fast = head.next; // in while loop there is a control whether they are on same element or not, therefore we moved it to one element further.
        Node slow = head;

        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next; //2 jumps -> fast.next would be null therefore, we are adding this case to the condition. fast.next != null
            slow = slow.next; // 1 jump
        }
        return false;
    }

}
