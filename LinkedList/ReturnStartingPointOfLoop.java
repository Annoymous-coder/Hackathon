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

	//fast.next and fast.next.next is used to check if there is actually a node before reaching there in below statements to make sure the path is clear.
	//if fast.next is null then fast.next.next is also null. So we have to use this as while condition to traverse through the nodes.
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

//LOGIC IS TO MAKE USE OF FLOYD'S CYCLE DETCTION ALGORITHM BY USING TWO POINTERS WITH DIFFERENT SPEED.
//FIND IF THERE EXISTS A LOOP.
//THEN MAKE ONE OF THOSE TWO POINTERS POINT TOWARDS HEAD AGAIN.
//THEN MOVE BOTH THE POINTERS AT SAME SPEED THEN THEY MEET AT THE STARTING POINT.
//RETURN ANY ONE OF THOSE TWO POINTERS SINCE BOTH ARE POINTING TOWARDS THE STARTING POINT.