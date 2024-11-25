package io.start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hellow.dat");
        fos.write(65);
        fos.write(66);
        fos.write(67);

        FileInputStream fis = new FileInputStream("temp/hellow.dat");
        int data;
        while ((data = fis.read()) != -1){
            System.out.println(data);
        }
        fis.close();
    }
}
