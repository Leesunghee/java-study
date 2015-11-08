package ch07.book.Exception;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by sunghee on 2015. 5. 5..
 */
public class TempCloseableTest {

    public static void main(String[] args) {
        try (TempCloseable t = new TempCloseable("t")) {
            t.work(0);
        } catch (SQLException ex) {
            System.out.println("SQLException 발생:" + ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("IOException 발생:" + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
