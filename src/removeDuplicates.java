package src;

public class removeDuplicates {
    public static void main(String[] args) {
        String str="arratatwdwdd";
        String res="";
        for(int i=0;i<str.length();i++){
            if(!res.contains(String.valueOf(str.charAt(i)))){
                res+=str.charAt(i);
            } else {
                System.out.println("Duplicate found: "+str.charAt(i));
            }
        }
        System.out.println(res);
    }
}
