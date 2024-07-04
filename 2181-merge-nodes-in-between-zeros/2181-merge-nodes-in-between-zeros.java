class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1); 
        ListNode current = dummy; 
        ListNode cur = head.next; 
        int sum = 0;

        while (cur != null) {
            if (cur.val != 0) {
                sum += cur.val;
            } else {
              
                current.next = new ListNode(sum);
                current = current.next;
                sum = 0; 
            }
            cur = cur.next;
        }

        return dummy.next; 
    }
}
