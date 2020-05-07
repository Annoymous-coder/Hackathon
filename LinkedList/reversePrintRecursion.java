static void reversePrint(SinglyLinkedListNode head) {
        
        if(head==null)
        {
           return;
        }
        else
        {
            reversePrint(head.next);
            System.out.println(head.data);
        }
    }
//THIS FUNCITON ONLY PRINTS IN REVERSE ORDER BUT DOES NOT ACTUALLY REVERSE IT.USES STACK FOR IMPLEMENTATION.
//1->2->3->4->5
//PUSH(HEAD.NEXT(1)) INTO STACK THEN 2 , 3 , 4 , 5
//SO THE STACK ACTUALLY CONTAINS IN ORDER 5 , 4 ,3 , 2 1
//TOP = 5 SO LIFO ORDER STACK DATA IS DE-POPULATED
