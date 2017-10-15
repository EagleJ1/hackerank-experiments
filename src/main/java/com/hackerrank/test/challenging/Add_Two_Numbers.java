package com.hackerrank.test.challenging;

/**
 * Created by jackalhan on 2/20/17.
 */
public class Add_Two_Numbers {
    /*
    *
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    * */
    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return String.valueOf(val) + " ";
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode tempListL1 = l1;
        ListNode tempListL2 = l2;
        ListNode resultList = null;
        int carry = 0;
        int firstDigit = 0;
        while (l1 != null || l2 != null) {
            ListNode cur = null;
            int sum = ((l1 == null) ? 0 : l1.val) +
                    ((l2 == null) ? 0 : l2.val) + carry;
            carry = sum / 10;
            firstDigit = sum % 10;
            cur = new ListNode(firstDigit);
            //resultList

            //int sum = tempListL1.val + tempListL2.val;
            int effectNumber = 0;
            if (sum >= 10) {
                sum = 0;
                effectNumber++;
            } else {
                if (effectNumber > 0) {
                    effectNumber--;
                    sum = sum + 1;
                }
            }
            if (resultList == null) {
                resultList = new ListNode(sum);
            } else {
                resultList.next = new ListNode(sum);
            }
            tempListL1 = tempListL1.next;
            tempListL2 = tempListL2.next;

        }
        return resultList;
    }

    public static void main(String[] args) {
        ListNode ln1_1 = new ListNode(2);
        ListNode ln1_2 = new ListNode(4);
        ListNode ln1_3 = new ListNode(3);
        ln1_2.next = ln1_3;
        ln1_1.next = ln1_2;

        ListNode ln2_1 = new ListNode(5);
        ListNode ln2_2 = new ListNode(6);
        ListNode ln2_3 = new ListNode(4);
        ln2_2.next = ln2_3;
        ln2_1.next = ln2_2;

        ListNode rLn = addTwoNumbers(ln1_1, ln2_1);
        System.out.println(rLn);


    }

}
