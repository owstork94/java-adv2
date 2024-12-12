package io.buffered;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.*;

public class CreateFileV2 {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();
        int bufferIndex = 0;
        byte[] buffer = new byte[BUFFER_SIZE];
        for (int i = 0; i <= FILE_SIZE; i++){
            buffer[bufferIndex++] = 1;

            if (bufferIndex == BUFFER_SIZE){
                fos.write(buffer);
                System.out.println("bi : "+bufferIndex);
                bufferIndex = 0;
            }
        }
        System.out.println("bi : "+bufferIndex);
        if (bufferIndex > 0){
            fos.write(buffer,0,bufferIndex);
        }
        fos.close();
        long endTime = System.currentTimeMillis();

        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");



    }
}
