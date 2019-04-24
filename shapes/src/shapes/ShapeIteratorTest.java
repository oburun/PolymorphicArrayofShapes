package shapes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ShapeIteratorTest {

    @Test
    void hasNext() {
        List<Integer> list = new ArrayList<>(100);
        list.add(1);
        list.add(2);
        ShapeIterator test = new ShapeIterator<>(list);
        assertTrue(test.hasNext());
    }

    @Test
    void next() {
        List<Integer> list = new ArrayList<>(100);
        list.add(1);
        list.add(2);
        ShapeIterator test = new ShapeIterator<>(list);
        int expectedValue = 1;
        assertEquals(1, test.next());
    }
}