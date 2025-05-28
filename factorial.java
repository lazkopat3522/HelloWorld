import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));

    }
    public static int factorial(int a){
        if(a<=1){
            return 1;
        } else return a*factorial(a-1);
    }

}
