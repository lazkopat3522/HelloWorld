import java.util.Arrays;
import java.util.Scanner;

public class TwoSumLeet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();}
        int t=sc.nextInt();
        boolean b=true;
        for(int i=0; i<n; i++) {
            int in = Arrays.binarySearch(ar, t - ar[i]); //searching index of 2nd element if its present in array
            if(in>=0 && in<n && t-ar[i]==ar[in] && b==true) //checking the breaking program by flag
            {
                System.out.println(i+" "+in);
                b=false;
            }

        }
    }
}
