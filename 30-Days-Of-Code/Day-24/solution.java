void removeDuplicates(Node head)
	{
		if(head==null)
		{
			System.out.println("no head");
		}
		else if(head.next==null)
		{
			System.out.println("only head");
		}
		else
		{
			Node back = head;  
			Node front = head.next;  //front is not neccessary .
			while(back.next!=null)
			{	
				if(back.data == front.data)
				{
					back.next = front.next;   //also back.next = back.next.next;
					removeDuplicates(head);	  //recursive call
				}
				back = back.next;
				front = back.next;
			}
		}
	}

     void removeDuplicateNaive(Node head) {
      //Write your code here
      //Without use of recursive	 
        
        if(head == null)
        {
            System.out.println("Empty");
        }
        else if(head.next == null)
        {
            System.out.println("Only head");
        }
        else
        {
            Node temp = head;
            System.out.println("head value "+head.data+" "+head.next);
        while(temp.next!=null)
        {  
            if(temp.data == temp.next.data)
            {	
            	System.out.println("right now in (if)  "+temp.data+" "+temp.next);
                temp.next = temp.next.next;
            }
            else
            {
            	System.out.println("right now in (else)"+temp.data+" "+temp.next);
            	temp = temp.next;
            }
            System.out.println("temp val---------->"+temp.data+" "+temp.next+"\n");
            
          }
       }

    }
