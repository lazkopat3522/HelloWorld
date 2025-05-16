import java.util.Scanner;

public class findSting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        processString(str);
    }
    public void processString(String input) {
        // Your code here
        System.out.println(input.length());
        for(int i=0;i<input.length()-1;i++)
        {
            System.out.println(input.charAt(i));

        }
    }

}
