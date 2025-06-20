package src;

public class removeDuplicates {
    public static void main(String[] args) {
        String str="arratatwdwdd";
        String strNew="";
        for(int i=0;i<str.length();i++){
            if(!strNew.contains(String.valueOf(str.charAt(i)))){
                strNew+=str.charAt(i);
            } else {
                System.out.println("Duplicate found: "+str.charAt(i));
            }
        }
        System.out.println(strNew);
    }
}
