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
        /*if(step>0) {
            for (int i = 0; i < n; i++) {
                int index=((i+step)%n)+n;
                arr[index]=arr[i];
                }
            for(int i=n;i<n+n;i++)
                System.out.print(arr[i]+" ");
            }*/
        if(step<0) {
            for (int i = 0; i < n; i++) {
                int index=(Math.abs(i+step))%n;
                System.out.println(i+" >> "+index);
                //arr[index]=arr[i];

            }
            for(int i=n;i<n+n;i++)
                System.out.print(arr[i]+" ");
        }
        }
    }
