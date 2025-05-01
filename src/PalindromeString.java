import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String rev="";
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        for(int i=st.length()-1;i>=0;i--){
            rev=rev+st.charAt(i);
        }
        if(st.equals(rev)){
            System.out.println("Number is PALINDROME");
        } else System.out.println("Number is NOT PALINDROME");

    }

}
