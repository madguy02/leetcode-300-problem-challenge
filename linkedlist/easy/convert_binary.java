// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

class Solution {
    public int getDecimalValue(ListNode head) {
        int val = head.val;
        while (head.next != null) {
            val = (val << 1) | head.next.val;
            head = head.next;
        }

        return val;
    }
}