package ch10.book.generic;

import java.util.HashMap;

/**
 * Created by sunghee on 2015. 5. 12..
 */
public class GenericEx1Main {
    public static void main(String[] args) {
        GenericEx1<String> t = new GenericEx1<String>();

        String[] ss = {"애", "아", "서"};
        HashMap hm = null;
        t.set(ss);
        t.print();
    }
}
