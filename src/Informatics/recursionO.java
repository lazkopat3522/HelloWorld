package src.Informatics;

import java.util.Scanner;

public class recursionO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(primeCheck(n));
    }
    public static String primeCheck(int number){
        int c=0;
        for(int i=1;i<=number/2;i++) {
            if (number % i == 0) {
                c++;
            }
        }
            if(c==1){
                return "It is prime";
            } else return "It is NOT prime";
    }
}
