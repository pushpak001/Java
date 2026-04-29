import java.util.*;

public class hollowrec {
    public static int j;

    public static void main(String[] args) {
        int n = 8;
        int m = 12;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");

        }
    }
}
