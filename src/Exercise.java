public class Exercise {
    public static void main(String[] args) {

        calculateScore(false,5);
        calculateScore(true,5);
    }
    public static void calculateScore(boolean gameOver,int b){
        if(gameOver) {
            System.out.println(b+b);
        } else {
            System.out.println(b * b);
        }
    }
}
