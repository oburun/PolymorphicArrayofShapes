package shapes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ShapeIterator<E> implements Iterator<E> {
    private List<E> list;
    int index=0;

    public ShapeIterator(){
        this.list = new ArrayList<>(100);
        this.index = 0;
    }
    public ShapeIterator(List<E> list){
        this.list = list;
        this.index=0;
    }


    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public E next() {
        return list.get(index++);
    }
}
