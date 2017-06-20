package com.origin.collection;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * treemap test
 * Created by panther on 17-6-20.
 */
public class MapTest {


    @Test
    public void testTreeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        treeMap.put(10, "10");
        treeMap.put(85, "85");
        treeMap.put(15, "15");
        treeMap.put(70, "70");
        treeMap.put(20, "20");
        treeMap.put(60, "60");
        treeMap.put(30, "30");
        treeMap.put(50, "50");


//        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
        System.out.println(16&15);
        System.out.println(17&15);
        System.out.println(3&15);
        System.out.println(4&15);
        System.out.println(5&15);
        System.out.println(6&15);
        System.out.println(7&15);
        System.out.println(8&15);
        System.out.println(9&15);
        System.out.println(10&15);
        System.out.println(12&15);
        System.out.println(12&15);
        System.out.println(13&15);
        System.out.println(14&15);
        System.out.println(15&15);
    }

}
