public class pat {
    public static void main(String[] args) {
        int n = 7;

        // for (int i = 1; i <= n; i++) {
        // int diff = n;
        // int st = i;
        // for (int j = 1; j <= i; j++) {
        // System.out.print(st + " ");
        // diff--;
        // st += diff;
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= n; i++) {
            int diff = n;
            int st = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(st + " ");
                diff--;
                st += diff;
            }
            System.out.println();
        }
    }
}
