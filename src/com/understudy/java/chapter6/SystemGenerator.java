package com.understudy.java.chapter6;

/**
 * Created by sunghee on 2015. 11. 1..
 */
public class SystemGenerator implements GeneratorInterface {

    public static void main(String[] args) {
        SystemGenerator systemGenerator = new SystemGenerator();
        String uniqueId = systemGenerator.getUniqueValue();
        System.out.println("Senerate unique id : " + uniqueId);


    }


    @Override
    public String getUniqueValue() {
        String rt = SystemGenerator.ID_HEADER + System.nanoTime() +
                SystemGenerator.DELIMITER + System.identityHashCode(this);
        return rt;
    }
}
