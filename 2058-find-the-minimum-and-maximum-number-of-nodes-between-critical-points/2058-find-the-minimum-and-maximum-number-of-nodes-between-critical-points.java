/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int ans[] = {-1, -1};
        
        if (head == null || head.next == null || head.next.next == null) {
            return ans;
        }
        
        ListNode mid = head.next;
        ListNode prev = head;
        
        int count = 1;
        
        int ansMin = Integer.MAX_VALUE;
        int ansMax = Integer.MIN_VALUE;
        int first = Integer.MAX_VALUE;
        int last = Integer.MIN_VALUE;
        
        boolean firstCrit = false;
        
        while (mid.next != null) {
            int midValue = mid.val;
            int nextValue = mid.next.val;
            int prevValue = prev.val;
            
            if ((midValue > nextValue && midValue > prevValue) || (midValue < nextValue && midValue < prevValue)) {
                if (firstCrit == false) {
                    firstCrit = true;  
                    last = count;
                    first = count;
                } else {
                    int curMin = count - last;
                    int curMax = count - first;
                    ansMin = Math.min(ansMin, curMin);
                    ansMax = Math.max(ansMax, curMax);
                    last = count;
                }
            }
            prev = mid;
            mid = mid.next;
            count++;
        }
        
        if (ansMin != Integer.MAX_VALUE) {
            ans[0] = ansMin;
            ans[1] = ansMax;
        }
        
        return ans;
    }
}
