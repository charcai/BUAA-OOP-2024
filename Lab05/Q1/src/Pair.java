public class Pair<T1, T2> {
    public T1 first;
    public T2 second;

    Pair(T1 first, T2 second) {
        setter(first, second);
    }

    public void setter(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public Pair<T1, T2> getter() {
        return this;
    }

    @SuppressWarnings("unchecked")
    void swap() {
        if(first.getClass().equals(second.getClass()) ||
                first.getClass().isAssignableFrom(second.getClass()) ||
                second.getClass().isAssignableFrom(first.getClass())) {
            T1 temp = first;
            first = (T1) second;
            second = (T2) temp;
        }
    }
}
