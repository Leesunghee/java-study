package io;
import java.io.*;

/**
 * Created by 0915183 on 2015-11-20.
 */
public class JavaIoTest2 {

    public static void main(String[] args) {

        InputStream in = null;
        ByteArrayOutputStream out = null;

        try {
            byte[] data = null;
            int readBuffer = -1;
            in = new FileInputStream("testdate.dat");
            out = new ByteArrayOutputStream();
            while ((readBuffer = in.read()) != -1) {
                out.write(readBuffer);
            }

            data = out.toByteArray();

            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);

            }

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
