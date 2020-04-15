package com.effectivejava.chapter02.test;

/**
 * @author zhangxuan
 * @date 2020/4/13
 */

public class SpellChecker {
    private SpellChecker(){}

    public static SpellChecker INSTANCE = new SpellChecker();

    public boolean isValid(){return false;}

}

class Test {
    public static void main(String[] args) {

        boolean valid = SpellChecker.INSTANCE.isValid();
        SpellChecker s = SpellChecker.INSTANCE;
    }
}