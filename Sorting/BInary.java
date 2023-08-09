public class BInary {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7 };
        int k = 7;
        int ans = search(arr, k);
        System.out.println(ans);
    }

    public static int search(int arr[], int k) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
