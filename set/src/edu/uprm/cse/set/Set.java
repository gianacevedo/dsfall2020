package edu.uprm.cse.set;

import java.io.PrintStream;

public interface Set<E> {

    public int size();
    public boolean isEmpty();
    public boolean isMember(E obj);
    public boolean add(E obj);
    public boolean remove(E obj);
    public void clear();
    public Set<E> union(Set<E> S2);
    public Set<E> difference(Set<E> S2);
    public Set<E> intersection(Set<E> S2);
    public boolean isSubset(Set<E> S2);
    public Object[] toArray();
    public void print(PrintStream out);

}
