/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode sp = temp;
        ListNode fp = temp;
        for(int i=0;i<n;i++)
        {
            fp = fp.next;    
        }
        while(fp!=null && fp.next!=null)
        {
            fp = fp.next;
            sp = sp.next;
        }
        sp.next = sp.next.next;
        return temp.next;
    }
    
}