package io.text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static io.buffered.BufferedConst.FILE_NAME;

public class ReaderWriterMainV1 {


    private static String  writeByteString = "ABC";

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        // 파일에 쓰기 , 인코딩 -> UTF 8
        byte[] writeByte = writeByteString.getBytes(StandardCharsets.UTF_8);
        fos.write(writeByte);
        fos.close();

        // 파일 읽기
        FileInputStream fis = new FileInputStream(FILE_NAME);
        byte[] readByte =  fis.readAllBytes();
        fis.close();
        //디코딩 -> UTF 8
        String readString = new String(readByte, StandardCharsets.UTF_8);

        System.out.println("read Byte : "+ Arrays.toString(writeByte));
        System.out.println("read String : "+readString);




    }
}
