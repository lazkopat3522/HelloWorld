import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String car="Honda";
    boolean boo = car == "Honda" ? false:true;
    if(boo==false){
        System.out.println("You entered wrong make");
    } else System.out.println("Congrats");
        System.out.println("The value that boo gets is >>> "+boo);
    }

}
