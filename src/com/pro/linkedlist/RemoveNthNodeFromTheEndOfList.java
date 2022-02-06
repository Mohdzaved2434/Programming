package com.pro.linkedlist;

public class RemoveNthNodeFromTheEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (n == 1 && head.next == null) {
            return head.next;
        }

        ListNode node = new ListNode(0, head);
        ListNode fast = node;
        ListNode slow = node;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return node.next;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode ln = (new RemoveNthNodeFromTheEndOfList()).removeNthFromEnd(node1, 3);
        while (ln != null) {
            System.out.println(ln.val);
            ln = ln.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}




