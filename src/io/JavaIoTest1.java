package io;
import java.io.*;

/**
 * Created by 0915183 on 2015-11-20.
 */
public class JavaIoTest1 {

    public static void main(String[] args) {

        InputStream in = null;
        OutputStream out = null;

        try {
            //byte[] data = new byte[] {1, 2, 3};
            int readBuffer = -1;
            in = new FileInputStream("overview.txt");
            out = new FileOutputStream("testdate2.dat");
            long startTime = System.nanoTime();
            while ((readBuffer = in.read()) != -1) {
                out.write(readBuffer);
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
