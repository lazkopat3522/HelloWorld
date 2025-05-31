package src.Informatics;

public class Operator {
    public static void main(String[] args) {
        checkNumber(-12);
    }
    public static void checkNumber(int num){
        System.out.println((num>0)?"positive":((num<0)?"negative":"zero"));
    }
}
