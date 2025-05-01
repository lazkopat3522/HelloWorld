import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String rev="";
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        for(int i=st.length()-1;i>=0;i--){
            rev=rev+st.charAt(i);
        }
        System.out.println(st+"<->"+rev);
    }

}
