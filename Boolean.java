import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String car=sc.nextLine();
    boolean boo=car=="Toyota"?false:true;
    if(boo==false){
        System.out.println("You entered wrong make");
    } else System.out.println("Congrats");
    }

}
