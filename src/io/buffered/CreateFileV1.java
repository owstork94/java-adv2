package io.buffered;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.FILE_NAME;
import static io.buffered.BufferedConst.FILE_SIZE;

public class CreateFileV1 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fops = new FileOutputStream(FILE_NAME);

        for (int i = 0; i < FILE_SIZE; i++){
            fops.write(1);
        }
        fops.close();

    }
}
