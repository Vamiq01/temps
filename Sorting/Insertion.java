import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,0};
        ins(arr);
        // System.out.println(Arrays.toString(arr));
    }

    public static void ins(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // public static void ins(int arr[]) {
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // for (int j = i; j > 0; j--) {
    // if (arr[j - 1] > arr[j]) {
    // int tmp = arr[j - 1];
    // arr[j - 1] = arr[j];
    // arr[j] = tmp;
    // } else {
    // break;
    // }
    // }
    // }
    // System.out.println(Arrays.toString(arr));
    // }
}
