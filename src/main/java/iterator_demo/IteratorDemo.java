package iterator_demo;

import koans.convention.ForLoopKt;

import java.util.Iterator;

/**
 * @author : Lex Yu
 * Compare with ForLoopKt
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Integer[] numbers = {10, 9, 8, 7, 6, 1, 2, 3, 4, 5};
        MyCollection<Integer> myCollection = new MyCollection<>(numbers);
        for (Integer element : myCollection) {
            System.out.println(element);
        }
    }
}

class MyCollection<T> implements Iterable<T> {
    private T[] elements;
    private int size;

    public MyCollection(T[] elements) {
        this.elements = elements;
        this.size = elements.length;
    }

    private class MyIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return elements[currentIndex++];
            } else {
                throw new java.util.NoSuchElementException();
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }
}