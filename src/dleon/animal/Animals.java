package dleon.animal;

import java.util.Iterator;

public interface Animals<T> {
    Iterator<T> createIterator();
    void prepare();
}
