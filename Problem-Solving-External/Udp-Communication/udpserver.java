package practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class udpserver {
	
	public void server() throws IOException 
	{
	DatagramSocket socket = new DatagramSocket(3334);
	DatagramPacket packet;
	System.out.println("Server Listening in "+3333);
	byte[] msgbuffer = new byte[1024];
	packet = new DatagramPacket(msgbuffer,msgbuffer.length);
	socket.receive(packet);
	String message = new String(msgbuffer,0,packet.getLength());
	System.out.println("Message recived = "+message);
    InetAddress address = packet.getAddress();
    int port = packet.getPort();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("type msg to send . press stop to terminate");
    do
    {
    	message = sc.next();
    	packet = new DatagramPacket(message.getBytes(),message.length(),address,port);
    	socket.send(packet);
    	
    }while(message.compareTo("stop")!=0);
	
	}
	public static void main(String args[]) throws IOException
	{
		udpserver s = new udpserver();
		s.server();
	}

}
