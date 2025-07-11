import java.util.Arrays;

public class sorting {

    public static void merge(int[] arr, int left, int mid, int right) {
        int sz1 = mid - left + 1;
        int sz2 = right - mid;
        int[] leftArr = new int[sz1];
        int[] rightArr = new int[sz2];
        for (int i = 0; i < sz1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < sz2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int ptr1 = 0;
        int ptr2 = 0;
        while (ptr1 < sz1 && ptr2 < sz2) {
            if (leftArr[ptr1] <= rightArr[ptr2]) {
                arr[left++] = leftArr[ptr1++];
            } else {
                arr[left++] = rightArr[ptr2++];
            }
        }
        while (ptr1 < sz1) {
            arr[left++] = leftArr[ptr1++];
        }
        while (ptr2 < sz2) {
            arr[left++] = rightArr[ptr2++];
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 3, 7, 4, 6 };
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
