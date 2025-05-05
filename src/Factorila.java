public class Factorila {
    public static int factorial(int a){
        if(a==1){
            return 1;
        } else {
            return factorial(a-1)*a;
        }
    }

    public static void main(String[] args) {
        System.out.print(factorial(5));
    }
}
