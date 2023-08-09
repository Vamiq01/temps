import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 2, 3, 4, 5,9,9,9,9,9 };
        int k = 9;
        int st = 0;
        int end = arr.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == k) {
                end = mid - 1;
            } else if (arr[mid] < k) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(st);
        // print(arr, 5);
        // int merged[] = mergeSort(arr, 0, arr.length - 1);
        // System.out.println(Arrays.toString(merged));

    }

    public static void print(int arr[], int n) {
        if (n < 1) {
            return;
        }
        int tmp[] = new int[n];
        // int temp[n-1];
        for (int i = 0; i < n - 1; i++) {
            tmp[i] = arr[i] + arr[i + 1];
        }
        print(tmp, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(tmp[i] + " ");
        }
        System.out.println();

    }

    public static int[] mergeSort(int arr[], int st, int end) {
        if (st >= end) {
            int base[] = new int[1];
            base[0] = arr[st];
            return base;
        }
        int mid = (st + end) / 2;
        int fh[] = mergeSort(arr, st, mid);
        int sh[] = mergeSort(arr, mid + 1, end);
        // System.out.print(fh[0]+" ");
        // System.out.print(sh[0]+" ");
        // System.out.println();

        int res[] = mergeArray(fh, sh);
        return res;
    }

    public static int[] mergeArray(int arr1[], int arr2[]) {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int res[] = new int[arr1.length + arr2.length];
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) {
                res[p3] = arr1[p1];
                p1++;
                p3++;
            } else {
                res[p3] = arr2[p2];
                p3++;
                p2++;
            }
        }

        for (; p1 < arr1.length; p1++) {
            res[p3++] = arr1[p1];
        }
        for (; p2 < arr1.length; p2++) {
            res[p3++] = arr2[p2];
        }
        return res;
    }
}
