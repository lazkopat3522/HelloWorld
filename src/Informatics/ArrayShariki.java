package src.Informatics;

import java.util.*;

public class ArrayShariki {

        public static Object[] removeBalls(Object[] arr) {
            if (arr == null || arr.length == 0) {
                return new Object[0];
            }

            Map<Object, Integer> frequencyMap = new HashMap<>();
            for (Object element : arr) {
                frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
            }

            List<Object> resultList = new ArrayList<>();
            for (Object element : arr) {
                if (frequencyMap.get(element) <= 2) {
                    resultList.add(element);
                }
            }

            return resultList.toArray(new Object[0]); // Convert list to array
        }

        public static void main(String[] args) {
            int c=0;
            ArrayList<Integer> list = new ArrayList<>();

            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            int initialCount=numbers.length;
            Object[] filteredNumbers = removeBalls(numbers);
            for (Object num : filteredNumbers) {
                c++;
            }
            System.out.println(initialCount-c);

        }
    }

