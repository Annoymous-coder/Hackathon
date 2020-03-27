package practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class udpclient {

	void client() throws IOException
	{
		DatagramSocket socket = new DatagramSocket();
		DatagramPacket packet;
		String message = "sTART";
		packet = new DatagramPacket(message.getBytes(),message.length(),InetAddress.getByName("localhost"),3334);
		socket.send(packet);
		System.out.println("client send server "+message);
		byte[] msgbuffer = new byte[1024];
		packet = new DatagramPacket(msgbuffer,msgbuffer.length);
		do
		{
			socket.receive(packet);
			message = new String(msgbuffer,0,packet.getLength());
			System.out.println(message);
		}while(!message.equals("stop"));
		
		
	}
	public static void main(String args[]) throws IOException
	{
		udpclient u = new udpclient();
		u.client();
	}
}
