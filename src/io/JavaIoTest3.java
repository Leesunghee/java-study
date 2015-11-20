package io;
import java.io.*;
import java.net.URL;

/**
 * Created by 0915183 on 2015-11-20.
 */
public class JavaIoTest3 {

    public static void main(String[] args) {

        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream("overview.txt");
            out = new FileOutputStream("testdate3.dat");
            int readCount = 1;
            byte[] buffer = new byte[1024];
            long startTime = System.nanoTime();
            while ((readCount = in.read(buffer)) != -1) {
                out.write(buffer, 0, readCount);
            }

            long endTime = System.nanoTime();

            System.out.println("Elapsed time is :" + (endTime - startTime));

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
