public class Recursion {
    public static void main(String[] args) {

        sayHi();


    }
    private static void sayHi(){
        System.out.println("Hi");
        sayHi();
    }

}
