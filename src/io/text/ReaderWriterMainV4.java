package io.text;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static io.buffered.BufferedConst.BUFFER_SIZE;
import static io.buffered.BufferedConst.FILE_NAME;

public class ReaderWriterMainV4 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC\n가나다";
        System.out.println("===write String===");
        System.out.println(writeString);

        FileWriter fw= new FileWriter(FILE_NAME, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(fw,BUFFER_SIZE);

        bw.write(writeString);
        bw.close();

        // file read
        FileReader fr = new FileReader(FILE_NAME,StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(fr,BUFFER_SIZE);

//        System.out.println(br.readLine());

        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null){
            sb.append(line).append("\n");
        }
        br.close();
        System.out.println("=== Read String ===");
        System.out.println(sb);

        String hostname = null;
        Process process = null;
        Runtime process2 = null;

        process = Runtime.getRuntime().exec("hostname");
        process2 = Runtime.getRuntime();
        System.out.println(process2);
        System.out.println(process);
        br = new BufferedReader((new InputStreamReader(process.getInputStream())));
        System.out.println(br);


    }
}
