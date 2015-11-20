package io;
import java.io.*;
import java.net.URL;

/**
 * Created by 0915183 on 2015-11-20.
 */
public class JavaIoTest4 {

    public static void main(String[] args) {

        InputStream in = null;
        OutputStream out = null;

        try {

            URL url = new URL("http://docs.oracle.com/javase/7/docs/api/java/applet/package-summary.html");
            in = url.openStream();
            out = new FileOutputStream("overview.txt");
            int readCount = 1;
            byte[] buffer = new byte[1024];
            long startTime = System.nanoTime();
            while ((readCount = in.read(buffer)) != -1) {
                out.write(buffer, 0, readCount);
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
