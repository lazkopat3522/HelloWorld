public class RecursionSum {
    public static void main(String[] args) {
        System.out.println(sumOfN(4));
    }
    public static int sumOfN(int n){
        if(n<1){
            return 0;
        } return n+(sumOfN(n-1));
    }
}
