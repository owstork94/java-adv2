package network.tcp.v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static util.MyLogger.log;

public class ClientV1 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("클라이언트 시작");
        Socket socket = new Socket("localhost",PORT);

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        log("Socket 연결 : "+socket);

        //서버에게 저달
        String toSend = "HELLO";
        output.writeUTF(toSend);
        log("Client -> Server : "+toSend);

        //서버로부타 응답
        String received = input.readUTF();
//        input.readUTF();
        log("Client <- Server : "+received);

        //자원 종료
        input.close();
        output.close();
        socket.close();



    }
}
