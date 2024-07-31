public class ListNode{
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

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode hold_result = new ListNode(0);
        ListNode result = hold_result;
        int remainder = 0;
        int quotient = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                quotient = (l1.val + l2.val + remainder);
                ListNode temp = new ListNode(quotient % 10);
                result.next = temp;
                remainder = (int) Math.floor(quotient / 10);
            } else if (l1 != null && l2 == null) {
                quotient = (l1.val + remainder);
                ListNode temp = new ListNode(quotient % 10);
                result.next = temp;
                remainder = (int) Math.floor(quotient / 10);
            } else if (l1 == null && l2 != null) {
                quotient = (l2.val + remainder);
                ListNode temp = new ListNode(quotient % 10);
                result.next = temp;
                remainder = (int) Math.floor(quotient / 10);
            }
            if(l1!=null){l1 = l1.next;}
            if(l2!=null){l2 = l2.next;}
            result = result.next;
        }
        if (remainder > 0) {
            ListNode temp = new ListNode(remainder);
            result.next = temp;
            result = result.next;
        }
        return hold_result.next;

    }
}