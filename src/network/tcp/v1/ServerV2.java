package network.tcp.v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

public class ServerV2 {
    private static int PORT = 12345;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);

        Socket socket = serverSocket.accept();
        log("Server socket 연결 ");

        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        DataInputStream input = new DataInputStream(socket.getInputStream());

        while (true){
            String receiveMsg = input.readUTF();
            log("reveivex client MSG : "+receiveMsg);
          String toSend =   receiveMsg +" client";

          output.writeUTF(toSend);
            log("send Client MSG : "+toSend);
          if (receiveMsg.equals("exit")){
              log("Server Socket exit ");
              break;
          }

        }
        output.close();
        input.close();
        socket.close();
        serverSocket.close();

    }
}
