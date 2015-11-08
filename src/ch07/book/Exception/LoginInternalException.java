package ch07.book.Exception;

/**
 * Created by sunghee on 2015. 5. 5..
 */
public class LoginInternalException extends Exception {
    public LoginInternalException(String msg, Exception cause) {
        super(msg, cause);
    }
}
