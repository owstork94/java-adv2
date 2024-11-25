package io.start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class StreamStartMain3 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.dat");
        byte[] input = {65,66,67};
        fos.write(input);
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.dat");
        byte[] buffer = new byte[10];
//        int redadCnt =  fis.read(buffer,0,10);
        int redadCnt2 =  fis.read(buffer);
//        System.out.println("readCnt : "+redadCnt);
        System.out.println("readCnt2 : "+redadCnt2);
        System.out.println(Arrays.toString(buffer));

    }
}
