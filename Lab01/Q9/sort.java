public class sort {
    public static int[] qsort(int[] arr) {
        if(arr == null) {
            return null;
        }
        if(arr.length <= 1) {
            return arr;
        }
        int temp;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8};
        qsort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
