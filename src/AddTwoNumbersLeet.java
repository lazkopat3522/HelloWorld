import java.util.Scanner;

public class AddTwoNumbersLeet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=0,num2=0,res=0;
        int n1=sc.nextInt();
        int n2=sc.nextInt();//Vvodim kolichestvo elementov dlya pervogo lista
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        for(int i=0;i<n1;i++) {
            arr1[i]= sc.nextInt();
            num1=num1+(int)(arr1[i]*Math.pow(10,i));//1,2,3,4=4321 we multiply by 10 to the power of i because it is reversed
        }

        for(int i=0;i<n2;i++) {
            arr2[i] = sc.nextInt();
            num2=num2+(int)(arr2[i]*Math.pow(10,i));//turning digits to numbers and adding them to each other

        }
        res=num1+num2; //sum of 1st and 2nd array
        while (res>0) //cutting digits
        {
            System.out.print(res%10+" ");//substracting last digit by modulo 10
            res=res/10; // taking all digits except last by dividing 10
        }
    }
}
