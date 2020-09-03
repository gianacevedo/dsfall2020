package edu.uprm.cse.set;

import java.io.PrintStream;

public class ArraySet<E> implements Set<E> {

    private E[] elements;
    private int currentSize;

    private static final int DEFAULT_SIZE = 10;

    public ArraySet(int initialSize){
        if(initialSize < 1){
            throw new IllegalArgumentException("Set size must be t leat 1.");
        }
        this.currentSize = 0;
        this.elements = (E[]) new Object[initialSize];

    }

    public ArraySet(){
        this(DEFAULT_SIZE);
    }

    @Override
    public int size() {
        return this.currentSize;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isMember(E obj) {
        return false;
    }

    @Override
    public boolean add(E obj) {
        return false;
    }

    @Override
    public boolean remove(E obj) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Set<E> union(Set<E> S2) {
        return null;
    }

    @Override
    public Set<E> difference(Set<E> S2) {
        return null;
    }

    @Override
    public Set<E> intersection(Set<E> S2) {
        return null;
    }

    @Override
    public boolean isSubset(Set<E> S2) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void print(PrintStream out) {

    }
}
