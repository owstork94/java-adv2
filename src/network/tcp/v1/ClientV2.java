package network.tcp.v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static util.MyLogger.log;

public class ClientV2 {
    public static final int PORT = 12345;
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost",PORT);
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream ouput = new DataOutputStream(socket.getOutputStream());

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("전송 할 문자 : ");
            String toSend = scanner.nextLine();

            //서버에게 문자 보내기
            ouput.writeUTF(toSend);

            if (toSend.equals("exit")){
                break;
            }

            String received = input.readUTF();
            log("client <- server : "+received);

        }

        log("연결 종료");
        input.close();
        ouput.close();
        socket.close();


    }
}
