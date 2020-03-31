"""
Detect a cycle in a linked list. Note that the head pointer may be 'None' if the list is empty.


#USING FLOYD'S CYCLE FINDING ALGORITHM;

A Node is defined as: 
 
    class Node(object):
        def __init__(self, data = None, next_node = None):
            self.data = data
            self.next = next_node
"""


def has_cycle(head):
    fastptr = head
    slowptr = head
    cur = head
    while(cur is not None and cur.next is not None):
        slowptr = slowptr.next
        fastptr = fastptr.next.next
        if slowptr == fastptr:
            return True
        else:
            return False
        cur = cur.next