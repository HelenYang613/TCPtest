import java.net.*;
import java.io.*;
public class TCPclient{

    public static void main(String args[]) throws IOException {
        Socket s = new Socket("localhost",4999);
        //send message to server
        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.println("hello from client");
        pr.flush();

        //read message from server

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf=new BufferedReader(in);
        String str = bf.readLine();
        System.out.println("server : " + str);
    }
}