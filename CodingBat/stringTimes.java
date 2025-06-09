package CodingBat;

import java.util.Scanner;

public class stringTimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        System.out.print(stringN(str,n));
    }
    public static String stringN(String str,int n){
        String res="";
        for(int i=1;i<=n;i++){
            res=res+str;
        }
        return res;
    }
}
