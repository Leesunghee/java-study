package com.understudy.java.chapter6;

/**
 * Created by sunghee on 2015. 11. 1..
 */
public interface GeneratorInterface {

    public static final String ID_HEADER = "UNIQUE";
    public static final String DELIMITER = "_";

    public abstract String getUniqueValue();
}
