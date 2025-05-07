import java.util.Scanner;

public class ArrayN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp1=0,dp2=0;
        int[] arr=new int[n];
        boolean[] barr=new boolean[n]
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            barr[i]=true;
        }
        int step=sc.nextInt();
        if(step>0) {
            for (int i = 0; i < n; i++) {
                if(barr[i]==true){
                    int index=(i+step)%n;
                    int newIndex=(index+step)%n;
                    dp1=arr[index];
                    dp2=arr[newIndex];
                    arr[index]=arr[i];
                    arr[newIndex]=dp1;
                    barr[index]=false;
                    barr[newIndex]=false;
                }
                }

            }
        }
    }
}
