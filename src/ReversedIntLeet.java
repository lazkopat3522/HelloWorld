import java.util.Scanner;

public class ReversedIntLeet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int revNum=0,c=0,newNum=n,dig=0;
        while(n>0) // Understanding how many digits the number has
        {
            n=n/10; // Dividing by 10 each time while it is greater than 0
            c++;
        }
        while(c>0)
        {
            dig=newNum%10; // Substracting last digit
            newNum=newNum/10;
            revNum=revNum+(dig*(int)Math.pow(10,c-1)); // Multiplying digit by 10 to the power of number of digits -1
            c--;
        }
        System.out.print(revNum);
    }
}
