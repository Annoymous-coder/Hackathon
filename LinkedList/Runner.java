//package practice;

public class Runner {
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.insert(2);
		list.insert(5);
		list.insert(1);
		list.insertAtStart(101);
        list.insertAtPos(0, 6);
        list.deleteAt(1);
		
		list.show();
	}
}
