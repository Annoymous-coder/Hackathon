package practice;   //custom package
class LinkedList 
{
	
	Node head;                           //declare first node head of type NODE
	
	public void insert(int data)         //method to insert data(int) at the end of the list
	{
		Node node = new Node();      //object creation.Here 'node' is the node to be inserted.
		node.data = data;
		node.next = null;            //not neccessary since the default value is null.
		
		
		if(head==null)		     //check if there is no node yet i.e list is empty.        
		{
			head = node;	     //so the new node is the head node.
		}
		else
		{
			Node n = head;       //n is the temporary node created for traversal purposes.
		  while(n.next!=null){	     //go to the last node.
			n=n.next;	
		  }
		n.next = node;		     //link the last node to the new node.
		}
	}
	 void insertAtStart(int data)        //add node at start
	 {
		 Node node = new Node();
		 node.data=data;
		 node.next=null;
		 node.next=head;             //make node to point existing head
		 head=node;		     //make node as head
	 }
	  
	 void insertAt(int index, int data)	//add node at given index
	 {
		 Node node = new Node();
		 node.data=data;
		 node.next=null;
		 
		 Node temp = head;
		 if(index==0)			//if index=0 and without for loop the node is inserted at the head+1 pos.
		 {
			 insertAtStart(data);
		 }
		 for(int i=0;i<index-1;i++)
		 {
			 temp=temp.next;                 
		 }                                    
		 node.next=temp.next;		//make the node point to existing temp.next .
		 temp.next=node;		//make the temp point to new node.
	 }
	 void deleteAt(int index)
	 {
		if(index == 0)
		{
			head = head.next;
		}
		else
		{
			Node temp = head;
			Node deleteNode = null;
			for(int i=0; i<index-1; i++)
			{
				temp = temp.next;
			}
			deleteNode = temp.next;
			temp.next = deleteNode.next;
			System.out.println("The deleted node is "+deleteNode.data);
			deleteNode = null;
		}
	 }

	public void show()		     //method to display the data in the list.
	{			
		Node n = head;		     //n is the temporary node and intialized to head. Since head is the first node.		
		while(n.next!=null){	     //goes to the last node. But last node has n.next==null so it stops for last 2nd node.	
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);   //for above problem print the contents of last node manually.	
	}
	
}
