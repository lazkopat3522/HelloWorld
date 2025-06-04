package src.Informatics;

import java.util.Scanner;

public class milesToKm {
    public static double milesTokilometr(int miles){
        return miles*1.67;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.println(milesTokilometr(m));
    }

}
