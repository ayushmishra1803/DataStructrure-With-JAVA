
public class Sort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] ary, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(ary, start, mid);
        mergeSort(ary, mid, end);
        merge(ary, start, mid, end);
    }

    public static void merge(int[] ary, int start, int mid, int end) {

        if (ary[mid - 1] <= ary[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = ary[i] <= ary[j] ? ary[i++] : ary[j++];
        }

        System.arraycopy(ary, i, ary, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, ary, start, tempIndex);

    }

}
