package com.business4union.lang;

/**
 * @PROJECT_NAME: Throwable
 * @DESCRIPTION: java.lang.NumberFormatException
 * @USER: 18396
 * @DATE: 2023/5/5 22:56
 */
public class NumberFormatException {

    public static void main(String[] args) {
        String line = "123.123";
        int d = Integer.parseInt(line);
        System.out.println(d);
    }
}
