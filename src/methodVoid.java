package src;

public class methodVoid {
    public static void main(String[] args) {
        callMeBaby();
    }
    public static void callMeBaby(){
        String name="Almaz";
        boolean boo=(name=="Ikram")?true:false;
        if(boo){
            System.out.println("Hi "+name);
        } else System.out.println("I dont know you to greet");

    }
}
