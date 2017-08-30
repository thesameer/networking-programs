import java.io.*;
import java.net.*;
class UDPServer
{
 public static void main(String args[])throws IOException
 {
  byte[] sendData = new byte[1024];
  byte[] receiveData=new byte[1024];
  DatagramSocket serversocket = new DatagramSocket(9870);
  while(true)
  {
   DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
   serversocket.receive(receivePacket);
   String clientsentence = new String(receivePacket.getData(),0,receivePacket.getLength());
   InetAddress IPaddress = receivePacket.getAddress();
   int Port = receivePacket.getPort();
   System.out.println("from client "+clientsentence);
   String capitalizedsentence = clientsentence.toUpperCase();
   sendData =  capitalizedsentence.getBytes();
   DatagramPacket sendPacket = new DatagramPacket(sendData,sendData.length,IPaddress,Port);
   serversocket.send(sendPacket);
   System.out.println("msg sent");
  }
 }
}
