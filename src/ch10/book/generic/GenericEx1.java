package ch10.book.generic;

/**
 * Created by sunghee on 2015. 5. 12..
 */
public class GenericEx1<T> {

    T[] v;

    public void set(T[] n) {
        v = n;
    }

    public void print() {
        for (T s : v) {
            System.out.println(s);
        }
    }

}
