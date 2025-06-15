package CodingBat;

public class first3 {
    public static String stringFirstThree(String str,int n){
        if(n<1){
            return str.substring(3); // when you write without giving index it is automatically start from 0
        } else {
            return str.substring(3)+stringFirstThree(str,n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(stringFirstThree("Ikram",5));
    }
}
