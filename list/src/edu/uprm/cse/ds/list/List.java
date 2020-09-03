package edu.uprm.cse.ds.list;

import java.io.PrintStream;

public interface List<E> extends Iterable<E> {

    public int size();
    public boolean isEmpty();
    public boolean isMember(E e);

}
