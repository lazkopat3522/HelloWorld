import java.util.Scanner;

public class ReversedIntLeet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int revNum=0,c=0,newNum=n;
        while(n>0) // Understanding how many digits the number has
        {
            n=n/10; // Dividing by 10 each time while it is greater than 0
            c++;
        }
        while(c>0)
        {
            newNum=newNum%10;
            revNum=revNum+(newNum*(int)Math.pow(10,c));
            c--;
        }
        System.out.print(revNum);
    }
}
