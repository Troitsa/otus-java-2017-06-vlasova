package ru.otus.hw3;

import java.util.*;

/**
 * Created by Роза on 19.06.2017.
 */
public class MyArrayList<T> implements List<T> {
    private T[] elements;

    public MyArrayList() {
        this.elements = (T[])new Object[0];
    }

    public void sort(Comparator<? super T> c) {
        Arrays.sort((T[]) elements, 0, elements.length, c);
    }

    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        dest.addAll(src);
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public boolean addAll(Collection<? extends T> c) {
        for (T element: c) {
            add(element);
        }
        return true;
    }


    public boolean add(T t) {
        try {
            T[] tmp = elements;
            elements = (T[]) new Object[tmp.length + 1];
            System.arraycopy(tmp, 0, elements, 0, tmp.length);
            elements[elements.length - 1] = t;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Iterator<T> iterator() {
        return new MyArrayIterator<T>(elements);
    }

    public int size() {
        return elements.length;
    }

    public T get(int index) {
        return elements[index];
    }

    public T set(int index, T element) {
        elements[index]=element;
        return null;
    }


    public boolean isEmpty() {
        return false;
    }


    public boolean contains(Object o) {
        return false;
    }


    public Object[] toArray() {
        return new Object[0];
    }


    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    public boolean remove(Object o) {
        return false;
    }


    public boolean containsAll(Collection<?> c) {
        return false;
    }


    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }


    public boolean removeAll(Collection<?> c) {
        return false;
    }


    public boolean retainAll(Collection<?> c) {
        return false;
    }


    public void clear() {

    }

    public void add(int index, T element) {

    }


    public T remove(int index) {
        return null;
    }


    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }


    public ListIterator<T> listIterator() {
        return null;
    }


    public ListIterator<T> listIterator(int index) {
        return null;
    }


    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}