import java.util.Scanner;

class Polindrome{
    public static void main(String[] args)
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();

        int i=0,c=0,j=1;
        while(i<str.length()/2)
        {
            if(str.charAt(i)==str.charAt(str.length()-j)){
                c++;
            }
            i++; j++;
        }


        if(c==str.length()/2){
            System.out.print("truee");

        } else  System.out.print("falsee");
    }
}

