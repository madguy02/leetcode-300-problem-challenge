// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int N = countNodes(head);
        System.out.println(N);
        if (N <k) {
            return head;
        }

        if (k==N-k+1) {
            return head;
        }

        ListNode start = head;
        ListNode start_prev = null;

        for (int i=1;i<k;i++) {
            start_prev = start;
            start = start.next;
        }

        ListNode end = head;
        ListNode end_prev = null;

        for (int i=1;i<N-k+1;i++) {
            end_prev = end;
            end = end.next;
        }

        if (start_prev != null) {
            start_prev.next = end;
        }

        if (end_prev != null) {
            end_prev.next = start;
        }

        ListNode temp = start.next;
        start.next = end.next;
        end.next = temp;

        if (k==1) {
            head = end;
        }

        if (k==N) {
            head = start;
        }

        return head;
    }

    public int countNodes(ListNode head) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}