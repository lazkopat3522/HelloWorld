package src;

import java.util.Scanner;

public class methodVoid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int p=sc.nextInt();
        System.out.println(callMeBaby(str)+" you got "+calculateExamScore(p)+" on exam");
    }
    public static String callMeBaby(String name){
        boolean boo=(name.equalsIgnoreCase("ikram"))?true:false;
        if(boo){
            return "Hi "+name;
        } else return "I dont know you to greet";

    }
    public static int calculateExamScore(int point){
        if(point>=80){
            return 5;
        } else if(point<80 && point>=60){
            return 4;

        } else if (point<60 && point>=40) {
            return 3;
        } else return 2;
    }
}
