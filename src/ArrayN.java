import java.util.Scanner;

public class ArrayN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int step=sc.nextInt();
        if(step>0) {
            for (int i = 0; i < n; i++) {
                int index=((i+step)%n)+n;//finding the new index and plus n  is to place in new index after n+
                arr[index]=arr[i];
                }
            for(int i=n;i<n+n;i++) //same array but starting from n+1 element where i have sorted with n amount of steps
                System.out.print(arr[i]+" ");
            } else {
            for (int i = 0; i < n; i++) {
                int index=(n-(Math.abs((i-Math.abs(step)))%n))+n;//finding the new index and plus n  is to place in new index after n+
                arr[index]=arr[i];
            }
            for(int i=n;i<n+n;i++) //same array but starting from n+1 element where i have sorted with n amount of steps
                System.out.print(arr[i]+" ");
        }
        }
    }
