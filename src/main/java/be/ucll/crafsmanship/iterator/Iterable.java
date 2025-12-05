package be.ucll.crafsmanship.iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public interface Iterable<T>
{
    Iterator<T> iterator();
    Spliterator<T> spliterator();
    void           forEach(Consumer<? super T> action);
}



