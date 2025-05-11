import java.util.Scanner;

public class RecursionFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(factorial(num));

    }
    private static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);

    }

}
