public class Recursion {
    public static void main(String[] args) {

        System.out.println(fibonacci(6));

    }
    private static int fibonacci(int n){
        if(n<=1){
            return n;
        } return (fibonacci(n-1)+fibonacci(n-2));
    }

}
