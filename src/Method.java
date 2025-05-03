import java.util.Scanner;

public class Method {
        public static int square(int a) {
            return a*a;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

            System.out.println(square(a));
    }


}
