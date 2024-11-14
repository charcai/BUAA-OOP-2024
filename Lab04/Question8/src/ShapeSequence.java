public class ShapeSequence {
    private final Shape[] shapes;
    private int length = 0;
    ShapeSequence(int size) {
        if(size < 0) {
            size = 0;
        }
        shapes = new Shape[size];
    }
    public void add(Shape shape) {
        if(length != shapes.length) {
            shapes[length] = shape;
            length++;
        }
    }
    public String toString() {
        StringBuilder ss = new StringBuilder("[");
        for(int i = 0; i < length - 1; i++) {
            ss.append(shapes[i].type.getEnglish());
            ss.append(", ");
        }
        ss.append(shapes[length - 1].type.getEnglish()).append("]");
        return ss.toString();
    }
    public IteratorInterface iterator() {
        return new SequenceIterator();
    }

    private class SequenceIterator implements IteratorInterface {
        private int index = 0;
        public boolean isEnd() {
            return index == shapes.length;
        }
        public Shape current() {
            if(isEnd()) {
                throw new IndexOutOfBoundsException("已经到达末尾");
            }
            return shapes[index];
        }
        public void moveNext() {
            if(!isEnd()) {
                index++;
            }
        }
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            SequenceIterator that = (SequenceIterator) o;
            return index == that.index && ShapeSequence.this.equals(that.getOuterType());
        }

        private ShapeSequence getOuterType() {
            return ShapeSequence.this;
        }
    }
}