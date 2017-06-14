package ru.otus.hw2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;

/**
 * VM options -Xmx512m -Xms512m
 *
 * Output:
 *
 =====Objects measurement=====
 Object: 8 byte
 Integer(0): 16 byte
 Long: 24 byte
 String: 40 byte
 Array[0]: 16 byte
 Array[100]: 416 byte
 ArrayList: 24 byte
 Hashset: 64 byte
 ==============================
 *
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MemoryMeasurer objectSizeMeasurer = new MemoryMeasurer();

        long objectSize;

        System.out.println("=====Objects measurement=====");

        Supplier<Object> obj = () -> new Object();
        objectSize = objectSizeMeasurer.measure(obj);
        System.out.println("Object: " + objectSize + " byte");

        Supplier<Object> integer = () -> new Integer(0);
        objectSize = objectSizeMeasurer.measure(integer);
        System.out.println("Integer(0): " + objectSize + " byte");

        Supplier<Object> l = () -> new Long(0);
        objectSize = objectSizeMeasurer.measure(l);
        System.out.println("Long: " + objectSize + " byte");

        Supplier<Object> String = () -> new String(new char[0]);
        objectSize = objectSizeMeasurer.measure(String);
        System.out.println("String: " + objectSize + " byte");

        Supplier<Object> emptyArray = () -> new int[0];
        objectSize = objectSizeMeasurer.measure(emptyArray);
        System.out.println("Array[0]: " + objectSize + " byte");

        Supplier<Object> array = () -> new int[100];
        objectSize = objectSizeMeasurer.measure(array);
        System.out.println("Array[100]: " + objectSize + " byte");

        Supplier<Object> arrayList = () -> new ArrayList<>();
        objectSize = objectSizeMeasurer.measure(arrayList);
        System.out.println("ArrayList: " + objectSize + " byte");

        Supplier<Object> hashset = () -> new HashSet<>();
        objectSize = objectSizeMeasurer.measure(hashset);
        System.out.println("Hashset: " + objectSize + " byte");


        System.out.println("==============================");

    }

}
