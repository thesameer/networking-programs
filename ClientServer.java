import java.io.*;
import java.net.*;

class ClientServer 
{
public static void main(String args[]) throws IOException 
{
String sentence;
String modifiedSentence;
BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
Socket cs = new Socket("localhost",8080);
DataOutputStream outToServer = new DataOutputStream(cs.getOutputStream());
BufferedReader inFromServer = new BufferedReader(new InputStreamReader(cs.getInputStream()));
sentence = inFromUser.readLine();
outToServer.writeBytes(sentence + '\n');
modifiedSentence = inFromServer.readLine();
System.out.println("SERVER OP " + modifiedSentence);
cs.close();
	}
}
