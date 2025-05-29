package src.Informatics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayO {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        int c = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == arr.get(i + 1) && arr.get(i) == arr.get(i - 1)) {
                arr.remove(i);
                arr.remove(i + 1);
                arr.remove(i - 1);

            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " ");
        }

    }
    }

