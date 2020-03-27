package practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class tcpclient {

	void client() throws UnknownHostException, IOException
	{
	
	Socket s = new Socket("localhost",3333);
	
	DataInputStream din = new DataInputStream(s.getInputStream());
	DataOutputStream dout = new DataOutputStream(s.getOutputStream());
	Scanner sc = new Scanner(System.in);
	String filename ;
	System.out.println("enter filename");
	filename = sc.next();
	dout.writeUTF(filename);
	String message;
	do
	{
	 message = din.readUTF();	
	 System.out.println("client msg"+message);
	}while(!message.equals("stop"));
	
	
	}
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		tcpclient t = new tcpclient();
		t.client();
	}
}
