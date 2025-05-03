import java.util.Scanner;

public class Method {
        public static int square(int a) {
            return a*a;
        }

    public static int sum(int a,int b) {
            return a+b;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("This is the sum of two numbers method => "+sum(a,b));
        System.out.println("This is the square of "+b+" -> "+square(b));
            System.out.println("This is the square of "+a+" -> "+square(a));
    }


}
