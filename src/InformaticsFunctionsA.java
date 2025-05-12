import java.util.Scanner;

public class InformaticsFunctionsA {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        System.out.println(minOfNumbers(a,b,c,d));

    }

    private static int minOfNumbers(int a,int b,int c,int d){
        int min=0;
        if(a<b && a<c && a<d){
            min=a;
        } else if(b<a && b<c && b<d){
            min=b;
        } else if(c<a && c<b && c<d){
            min=c;
        } else if(d<a && d<b && d<c) {
            min=d;
        }
        return min;
    }

}
