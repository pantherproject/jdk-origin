package com.origin.basic;

/**
 * Created by panther on 17-6-21.
 */
public class Son extends Father {

    public void voice() {
        System.out.println("派生类的声音");
    }


    public static void main(String[] args) {
        Son son = new Son();
        son.test();
    }
}
