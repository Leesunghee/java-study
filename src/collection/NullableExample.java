package collection;

import java.util.ArrayList;

/**
 * Created by sungheelee on 2015. 12. 19..
 */
public class NullableExample {
    public static void main(String[] args) {
        NullableExample example = new NullableExample();

        ArrayList<String> strList = example.init();

        //null 처리 방법1.
        if (strList == null || strList.size() <= 0) return; // 아래에 실행할 구문이 있다면 처리 방법2

        //null 처리 방법2.
        if (strList != null && strList.size() > 0) { //if문 추가로 가독성이 떨어짐
            for (int i = 0; i < strList.size(); i++) {
                System.out.println("value = " + strList.get(i));
            }
        }

        //null 처리 방법3.
        for (int i = 0; strList != null && i < strList.size(); i++) {
            System.out.println("value = " + strList.get(i));
        }


    }

    private ArrayList<String> init() {
        return null;
    }
}
