package hw3;

import java.util.*;

/**
 * Created by Роза on 19.06.2017.
 */
public class MyArrayList<T> implements List<T> {
    private T[] elements;

    public MyArrayList() {
        this.elements = (T[])new Object[0];
    }

    @Override
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

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T element: c) {
            add(element);
        }
        return true;
    }

    @Override
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


    @Override
    public Iterator<T> iterator() {
        return new MyArrayIterator<T>(elements);
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
