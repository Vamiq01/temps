import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 9, 1 };
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[], int s, int l) {
        
        int tmp = arr[s];
        arr[s] = arr[l];
        arr[l] = tmp;
    }
}
