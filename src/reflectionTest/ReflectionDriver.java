package reflectionTest;

/**
 * Created by 0915183 on 2015-11-13.
 */
public class ReflectionDriver {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        //ReflectionDriver reflectionDriver = new ReflectionDriver();

        String str = "reflectionTest.ReflectionTest";

        Class cls = null;
        try {
            cls = Class.forName(str);
            ReflectionDriver reflectionDriver = (ReflectionDriver) cls.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
