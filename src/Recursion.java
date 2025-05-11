import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(sumOfNumbers(num));

    }
    private static int sumOfNumbers(int n){
        if(n<1){
            return 0;
        }
        return n+sumOfNumbers(n-1);

    }

}
