import java.util.Scanner;

public class TwoSumLeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();}
        int t=sc.nextInt();
        int c=0;
        while(c<n)
        {
            for(int j=0;j<n;j++) //2,7,11,15 target 9
            {
                if(ar[c]+ar[j]==t) {
                    System.out.println(c + " " + j);
                    c=n-1;
                }
            }
            c++;
        }

    }
}
