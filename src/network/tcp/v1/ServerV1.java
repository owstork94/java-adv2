package network.tcp.v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

public class ServerV1 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);

        Socket socket = serverSocket.accept();
        log("Socket 열음");

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

       String receiveMsg =  input.readUTF();
       log("receiveMsg : "+receiveMsg);
       String send = receiveMsg +" Client";


       output.writeUTF(send);
        log("send Msg : "+send);
        input.close();
        output.close();
        socket.close();
        serverSocket.close();

    }
}
