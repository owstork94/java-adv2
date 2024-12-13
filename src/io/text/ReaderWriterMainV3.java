package io.text;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import static io.buffered.BufferedConst.FILE_NAME;

public class ReaderWriterMainV3 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        FileWriter fw2 = new FileWriter(FILE_NAME, StandardCharsets.UTF_8);
        fw2.write(writeString);
        fw2.close();

        FileReader fr2 = new FileReader(FILE_NAME,StandardCharsets.UTF_8);
        int ch;
        StringBuilder contents = new StringBuilder();
        while ((ch = fr2.read()) != -1){
            contents.append((char)ch);
        }
        System.out.println("File Read : " + contents);

    }
}
