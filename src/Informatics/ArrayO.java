package src.Informatics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayO {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i)+" ");
        }
    }
}
