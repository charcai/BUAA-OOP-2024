import java.lang.invoke.MutableCallSite;
import java.util.LinkedList;

public class MyDeque <T> {
    private final LinkedList<T> elements;

    public MyDeque() {
        this.elements = new LinkedList<>();
    }

    public void addFirst(T element) {
        elements.addFirst(element);
    }

    public void addLast(T element) {
        elements.addLast(element);
    }

    public T removeFirst() {
        return elements.removeFirst();
    }

    public T removeLast() {
        return elements.removeLast();
    }

}
