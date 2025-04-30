import java.util.Scanner;

public class FindEvenLeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=0,c=0,cEven=0;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            num=arr[i];
            while(num>0){
                num=num/10;
                c++;
            }
            if(c%2==0){
                cEven++;
            }
            c=0;
        }
        System.out.println(cEven);

    }
}
