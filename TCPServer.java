import java.io.*;
import java.net.*;
class TCPServer 
{
public static void main(String args[]) throws IOException 
{
String clientSentence ;
String capitalizedSentence;
ServerSocket ws = new ServerSocket(8080);
while(true)
{
Socket cs = ws.accept();
System.out.println("Connected to Client");
BufferedReader inFromClient = new BufferedReader(new InputStreamReader(cs.getInputStream()));
DataOutputStream outToClient=new DataOutputStream(cs.getOutputStream());
clientSentence = inFromClient.readLine();
capitalizedSentence = clientSentence.toUpperCase() + "\n";
outToClient.writeBytes (capitalizedSentence);
System.out.println("Msg sent");
}
}
}
