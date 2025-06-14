package CodingBat;

public class first3 {
    public static String stringFirstThree(String str,int n){
        if(n<=1){
            return str.substring(0,3);
        } else {
            return str.substring(0,3)+stringFirstThree(str,n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(stringFirstThree("Chocolate",4));
    }
}
