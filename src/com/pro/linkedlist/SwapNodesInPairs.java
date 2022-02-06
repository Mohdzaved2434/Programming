package com.pro.linkedlist;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode tempList = dummy;

        while (tempList.next != null && tempList.next.next != null) {
            ListNode first = tempList.next;
            ListNode second = tempList.next.next;
            ListNode temp = second.next;

            second.next = first;
            tempList.next = second;
            first.next = temp;

            tempList = tempList.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode ln = (new SwapNodesInPairs()).swapPairs(node1);
        while (ln != null) {
            System.out.println(ln.val);
            ln = ln.next;
        }
    }
}

