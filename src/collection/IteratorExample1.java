package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by sungheelee on 2015. 12. 19..
 */
public class IteratorExample1 {
    private ArrayList<String> urlList = new ArrayList<String>();

    public static void main(String[] args) {
        IteratorExample1 example = new IteratorExample1();
        example.init();
        example.execute();
    }

    private void execute() {
        for (int i = 0; i < urlList.size(); i++) {
            System.out.println("URL : " + urlList.get(i));
        }
        System.out.println("-------------------------------");
        for (String url : urlList) {
            System.out.println("URL : " + url);
        }
        System.out.println("-------------------------------");

        Iterator<String> iter = urlList.iterator();
        while (iter.hasNext()) {
            System.out.println("URL : " + (String) iter.next());
        }
    }

    private void init() {
        urlList.add("http://www.daum.net");
        urlList.add("http://www.google.com");
        urlList.add("http://www.facebook.com");
    }
}
