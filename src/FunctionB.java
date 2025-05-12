import java.util.Scanner;

public class FunctionB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextInt();
        double b=sc.nextInt();
        System.out.println(powerOf(a,b));
    }
    private static double powerOf(double a,double b){
        return Math.pow(a,b);
    }
}
