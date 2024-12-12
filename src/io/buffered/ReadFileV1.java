package io.buffered;

import javax.management.MBeanAttributeInfo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static io.buffered.BufferedConst.FILE_NAME;

public class ReadFileV1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long startTime =  System.currentTimeMillis();
        int data;
        int fileSize = 0;

        while ((data = fis.read()) != -1){
            fileSize++;
        }
        long endTime = System.currentTimeMillis();
        fis.close();
        System.out.println("FILE NAME : "+FILE_NAME);
        System.out.println("FILE SIZE : "+(fileSize / 1024 / 1024) + "mb");
        System.out.println("Time taken : "+ (endTime - startTime) + "ms");





    }

}
