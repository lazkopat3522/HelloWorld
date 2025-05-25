package src;

import java.util.Scanner;

public class minFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();

        System.out.println(min(a,b,c,d));
    }
    public static int min(int a,int b,int c,int d){
        if(a<b && a<c && a<d){
            return a;
        } else if (b<a && b<c && b<d) {
          return b;
        } else if (c<a && c<b && c<d) {
            return c;
        } else return d;
    }
}
