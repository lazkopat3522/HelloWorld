package src;

import java.util.Scanner;

public class methodVoid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String newString=str;
        callMeBaby(newString);
    }
    public static void callMeBaby(String name){
        boolean boo=(name=="usa")?true:false;
        if(boo){
            System.out.println("Hi "+name);
        } else System.out.println("I dont know you to greet");

    }
}
