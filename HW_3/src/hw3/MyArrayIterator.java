package hw3;

import java.util.Iterator;

/**
 * Created by Роза on 20.06.2017.
 */
public class MyArrayIterator<E> implements Iterator {
    private int index = 0;
    E[] values;

    public MyArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public Object next() {
        return values[index++];
    }
}
