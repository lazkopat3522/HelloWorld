import java.util.Scanner;

public class ArrM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] ar = new int[n];
        int cl=0;
        int dep = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = i + 1;
        }
        for (int i = a - 1; i < b - 2; i++) {
            cl++;
            dep = ar[i];
            ar[i] = ar[b-cl];
            ar[b-cl] = dep;
        }
        cl=0;
        for (int i = c - 1; i < d - 2; i++) {
            cl++;
            dep = ar[i];
            ar[i] = ar[d - cl];
            ar[d - cl] = dep;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");

        }
    }
}
