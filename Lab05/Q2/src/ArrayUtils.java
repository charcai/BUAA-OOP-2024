import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayUtils {

    public static <T> void printArray(T array, String name) {
        if (array == null) {
            System.out.println("null");
            return;
        }
        if (!array.getClass().isArray()) {
            System.out.println(array.toString());
            return;
        }
        name = " " + name + " ";
        StringBuilder sb = new StringBuilder();
        sb.append(array.getClass().getSimpleName()).append(name).append(" = ");
        printArrayRecursive(array, sb, 0);
        System.out.println(sb.toString() + ";");
    }

    private static void printArrayRecursive(Object array, StringBuilder sb, int depth) {
        if (array == null) {
            sb.append("null");
            return;
        }
        if (!array.getClass().isArray()) {
            sb.append(array.toString());
            return;
        }
        sb.append("{");
        int length = Array.getLength(array);
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object element = Array.get(array, i);
            if (element != null && element.getClass().isArray()) {
                printArrayRecursive(element, sb, depth + 1);
            } else {
                sb.append(element);
            }
        }
        sb.append("}");
    }
    public static <T> void printArrayList(ArrayList<T> arrayList, String name) {
        if (arrayList == null) {
            System.out.println("null");
            return;
        }
        name = " " + name + " ";
        StringBuilder sb = new StringBuilder();
        sb.append("ArrayList").append(name).append(" = ");
        printArrayListRecursive(arrayList, sb, 0);
        System.out.println(sb.toString() + ";");
    }

    private static void printArrayListRecursive(ArrayList<?> arrayList, StringBuilder sb, int depth) {
        if (arrayList == null) {
            sb.append("null");
            return;
        }
        sb.append("{");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object element = arrayList.get(i);
            if (element instanceof ArrayList) {
                printArrayListRecursive((ArrayList<?>) element, sb, depth + 1);
            } else {
                sb.append(element);
            }
        }
        sb.append("}");
    }
}