import java.util.Scanner;

public class ReversedIntLeet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=0,c=0;
        while(n>0) // Understanding how many digits the number has
        {
            n=n/10; // Dividing by 10 each time while it is greater than 0
            c++;
        }
        System.out.print("Number of digits = "+c);
    }
}
