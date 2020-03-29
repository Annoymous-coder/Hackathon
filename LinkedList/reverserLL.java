tatic SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

            SinglyLinkedListNode cur = head;
            SinglyLinkedListNode prev = null;
            SinglyLinkedListNode next = null;

            while(cur!=null)
            {
                next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
                
            }
            head = prev;
            return head;

    }