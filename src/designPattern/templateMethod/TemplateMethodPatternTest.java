package designPattern.templateMethod;

/**
 * Created by 0915183 on 2015-11-09.
 */
public class TemplateMethodPatternTest {
    public static void main(String[] args) {
        AbtractFactory abtractFactory = new BusFactory();
        abtractFactory.exec();

    }


}
