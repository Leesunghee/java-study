package ch07.book.Exception;

/**
 * Created by sunghee on 2015. 5. 5..
 */
public class LoginTest2 {

    public static void main(String[] args) {
        LoginSevice2 loginService = new LoginSevice2();
        try {
            loginService.login("a", "123");
        } catch (LoginInternalException ex) {
            ex.printStackTrace();
        }
    }

}
