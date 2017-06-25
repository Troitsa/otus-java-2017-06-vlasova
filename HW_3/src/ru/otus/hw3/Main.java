package ru.otus.hw3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Роза on 19.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList<String> arrList = new MyArrayList<>();
        MyArrayList<String> arrListCopy = new MyArrayList<>();

        ArrayList<String> list = new ArrayList<>();
        list.add("Second");
        list.add("Third");
        list.add("First");

        System.out.println("=========addAll=========");
        System.out.println("before: " + arrList);
        Collections.addAll(arrList,"Second","First","Third");
        System.out.println("after: " + arrList);
        System.out.println();


        System.out.println("=========copy=========");
        System.out.println("before: " + arrListCopy);
        Collections.addAll(arrListCopy,"Fifth","Sixth","Seventh");
        System.out.println("before: " + arrListCopy);
        Collections.copy(arrListCopy,arrList);
        System.out.println("after: " + arrListCopy);
        System.out.println();

        System.out.println("=========sort=========");
        System.out.println("before: " + arrList);
        Collections.sort(arrList);
        System.out.println("after: " + arrList);
    }
}