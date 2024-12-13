package io.text;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static io.buffered.BufferedConst.FILE_NAME;

public class ReaderWriterMainV2 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("sriteString : "+writeString);

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

        osw.write(writeString);
        osw.close();

        FileInputStream fis = new FileInputStream(FILE_NAME);
        InputStreamReader isr = new InputStreamReader(fis,StandardCharsets.UTF_8);


        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = isr.read()) != -1){
            sb.append((char)ch);
        }
        isr.close();

        System.out.println("read String : "+sb);
    }
}
