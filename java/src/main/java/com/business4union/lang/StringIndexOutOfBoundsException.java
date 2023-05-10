package com.business4union.lang;

/**
 * @PROJECT_NAME: Throwable
 * @DESCRIPTION: java.lang.StringIndexOutOfBoundsException
 * @USER: 18396
 * @DATE: 2023/5/5 22:56
 */
public class StringIndexOutOfBoundsException {

    public static void main(String[] args) {
        String str = "thingking in java";
        char c = str.charAt(20);
        System.out.println(c);
    }
}
