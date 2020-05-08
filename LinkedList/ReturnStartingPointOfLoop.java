/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode ans = null;
        boolean isCycle = false;
        int noOfNodes = 1;
        if(head == null)
        {
            return null;
        }
        else if(head.next == null || head.next.next == null)
        {
            return null;
        }
        while(fast.next!=null && fast.next.next!=null)
        {   
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            {   
                isCycle = true;
                System.out.println("slow.data" + slow.val + "fast.data" + fast.val);
                break;
            }
        }
        if(isCycle == false) 
        {
            return null;
        }
        
        fast = head;
        while(slow!=fast)
        {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}