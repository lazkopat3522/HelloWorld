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
                int index=((i+step)%n)+n;
                arr[index]=arr[i];
                }
            for(int i=n;i<n+n;i++)
                System.out.print(arr[i]+" ");
            }
        if(step<0) {
            for (int i = 0; i < n; i++) {
                int index=n-((Math.abs(i+step))%n);
                if(index%n==0){
                    arr[index]=arr[i];
                }else {
                    arr[(index+n)%(n+n)]=arr[i];
                }


            }
            for(int i=n;i<n+n;i++)
                System.out.print(arr[i]+" ");
        }
        }
    }
