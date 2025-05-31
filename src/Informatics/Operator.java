package src.Informatics;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        checkNumber(n);
    }
    public static void checkNumber(int num){
        System.out.println((num>0)?"positive":((num<0)?"negative":"zero"));
    }
}
