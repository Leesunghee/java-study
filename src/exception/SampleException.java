package exception;

/**
 * Created by sungheelee on 2015. 12. 19..
 */
public class SampleException {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("Usage : java SampleException [Number]");
            return;
        }

        SampleException tester = new SampleException();

        String rt = tester.parseBianry(args[0]);
    }

    private String parseBianry(String str) {
        String binary = null;
        try {
            int decimal = Integer.parseInt(str);
            binary = Integer.toBinaryString(decimal);

        } catch (NumberFormatException e) {
            System.out.println("Wrong number format string.");
            e.printStackTrace();
        }
        return binary;
    }

}
