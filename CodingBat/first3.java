package CodingBat;

public class first3 {
    public static String stringFirstThree(String str,int n){
        String newstr="";
        for(int i=0;i<n;i++){
            newstr=newstr+str.substring(0,3);
        }
        return newstr;

    }
    public static void main(String[] args) {
        System.out.println(stringFirstThree("Chocolate",4));
    }
}
