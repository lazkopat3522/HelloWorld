package src;

public class sleepIn {
    public static void main(String[] args) {
        if(sleepOn(false,false)==true){
            System.out.println("You can sleep till to 1 pm");
        } else System.out.println("It is time to work");
    }
    public static boolean sleepOn(boolean weekday,boolean vacation ){
        if(!weekday || vacation){
            return true;
        } else return false;
    }
}
