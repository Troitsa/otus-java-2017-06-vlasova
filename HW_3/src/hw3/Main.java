package hw3;

import java.util.ArrayList;

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
        arrList.addAll(list);
        System.out.println("after: " + arrList);
        System.out.println();


        System.out.println("=========copy=========");
        System.out.println("before: " + arrListCopy);
        MyArrayList.copy(arrListCopy,arrList);
        System.out.println("after: " + arrListCopy);
        System.out.println();

        System.out.println("=========sort=========");
        System.out.println("before: " + arrList);
        arrList.sort(String::compareTo);
        System.out.println("after: " + arrList);
    }
}
