import java.util.Scanner;

public class AddTwoNumbersLeet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=0,num2=0;
        int n1=sc.nextInt();
        int n2=sc.nextInt();//Vvodim kolichestvo elementov dlya pervogo lista
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        for(int i=0;i<n1;i++) {
            arr1[i]= sc.nextInt();
            num1=num1+(int)(arr1[i]*Math.pow(10,i));
        }
        //Vvodim kolichestvo elementov dlya vtorogo lista
        for(int i=0;i<n2;i++) {
            arr2[i] = sc.nextInt();
            num2=num2+(int)(arr2[i]*Math.pow(10,i));

        }
        System.out.print(num1+" "+num2);
    }
}
