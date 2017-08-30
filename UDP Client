import java.io.*;
import java.net.*;

class UdpClient
{
public static void main(String args[])throws IOException
{
 BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
 byte[]SendData = new byte[1024];
 byte[]ReceiveData = new byte[1024];
 DatagramSocket ClientSocket = new DatagramSocket();
 String Sentence = inFromUser.readLine();
 SendData = Sentence.getBytes();
 InetAddress IPAddress = InetAddress.getByName("LocalHost");
 DatagramPacket sendPacket = new DatagramPacket(SendData, SendData.length, IPAddress, 9870);
 ClientSocket.send(sendPacket);
 DatagramPacket receivePacket = new DatagramPacket(ReceiveData,ReceiveData.length);
 ClientSocket.receive(receivePacket);
 String modifiedSentence = new String(receivePacket.getData());
 System.out.println("From Server" + modifiedSentence);
 ClientSocket.close();
}
}
