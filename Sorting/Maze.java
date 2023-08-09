import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        int arr[][] = { 
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 } ,
                { 0, 0, 0 },
                { 0, 0, 0 } 
            };
        ArrayList<String> ans = getPath(arr, 0, 0, 4, 2);
        System.out.println(ans);
    }

    public static ArrayList<String> getPath(int arr[][], int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> vp = new ArrayList<>();
        ArrayList<String> hp = new ArrayList<>();
        if (sr < dr ) {
            vp = getPath(arr, sr + 1, sc, dr, dc);
        }
        if (sc < dc ) {
            hp = getPath(arr, sr, sc + 1, dr, dc);
        }
        ArrayList<String> ans = new ArrayList<>();
        for (String i : vp)
            ans.add("v" + i);
        for (String i : hp)
            ans.add("h" + i);

        return ans;

    }

    // public static ArrayList<String> getPath2(int sr, int sc, int dr, int dc) {
    // if (sr == dr && sc == dc) {
    // ArrayList<String> base = new ArrayList<>();
    // base.add("");
    // return base;
    // }

    // if (sr > dr || sc > dc) {
    // ArrayList<String> base = new ArrayList<>();

    // return base;
    // }

    // ArrayList<String> vpath = getPath(sr + 1, sc, dr, dc);

    // ArrayList<String> hpath = getPath(sr, sc + 1, dr, dc);

    // ArrayList<String> ans = new ArrayList<>();

    // for (String i : vpath) {
    // ans.add("v" + i);
    // }

    // for (String i : hpath) {
    // ans.add("h" + i);
    // }

    // return ans;
    // }
    // public static ArrayList<String> path(int sr, int sc, int dr, int dc) {
    // if (sr == dr && sc == dc) {
    // ArrayList<String> base = new ArrayList<>();
    // base.add("");
    // return base;
    // }
    // ArrayList<String> vpath = new ArrayList<>();
    // ArrayList<String> hpath = new ArrayList<>();

    // if (sr < dr) {
    // vpath = path(sr + 1, sc, dr, dc);
    // }
    // if (sc < dc) {
    // vpath = path(sr, sc + 1, dr, dc);
    // }
    // ArrayList<String> ans = new ArrayList<>();
    // for (String i : vpath) {
    // ans.add("v" + i);
    // }
    // for (String i : hpath) {
    // ans.add("h" + i);
    // }
    // return ans;
    // }

    // public static ArrayList<String> getPath(int sr, int sc, int dr, int dc) {
    // if (sr == dr && sc == dc) {
    // ArrayList<String> base = new ArrayList<>();
    // base.add("");
    // return base;
    // }
    // ArrayList<String> hpath = new ArrayList<>();
    // ArrayList<String> vpath = new ArrayList<>();

    // if (sr < dr) {
    // vpath = getPath(sr + 1, sc, dr, dc);
    // }

    // if (sc < dc) {
    // hpath = getPath(sr, sc + 1, dr, dc);
    // }

    // ArrayList<String> ans = new ArrayList<>();

    // for (String i : vpath) {
    // ans.add("v" + i);
    // }

    // for (String i : hpath) {
    // ans.add("h" + i);
    // }

    // return ans;
    // }
}
