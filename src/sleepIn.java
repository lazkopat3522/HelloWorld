package src;

public class sleepIn {
    public static void main(String[] args) {
        System.out.println(sleepOn(true,false));
    }
    public static boolean sleepOn(boolean weekday,boolean vacation ){
        if(!weekday || vacation){
            return true;
        } else return false;
    }
}
