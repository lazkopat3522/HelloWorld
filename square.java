import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            int n=(int)Math.sqrt(i);
            if(n*n==i && i!=1 && i!=0)
                System.out.println(i);
        }
    }
}
