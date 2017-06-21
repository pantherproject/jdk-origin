package com.origin.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * hashmap thread test
 * hashMap的线程不安全性
 * Created by panther on 17-6-21.
 */
public class HashMapThread extends Thread {

    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();


    public void run() {
        while (atomicInteger.get() < 100000) {
            map.put(atomicInteger.get(), atomicInteger.get());
            System.out.println("-----");
            atomicInteger.incrementAndGet();
        }
    }


    public static void main(String[] args) {
        HashMapThread hashMapThread1 = new HashMapThread();
        HashMapThread hashMapThread2 = new HashMapThread();
        HashMapThread hashMapThread3 = new HashMapThread();
        HashMapThread hashMapThread4 = new HashMapThread();
        HashMapThread hashMapThread5 = new HashMapThread();



        hashMapThread1.start();
        hashMapThread2.start();
        hashMapThread3.start();
        hashMapThread4.start();
        hashMapThread5.start();
    }
}
