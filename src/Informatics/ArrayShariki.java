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
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Integer[] numbers=new Integer[n];
            for(int i=0;i<n;i++){
                    numbers[i]= sc.nextInt();
            }
            //Integer[] numbers = {};
            int initialCount=numbers.length;
            Object[] filteredNumbers = removeBalls(numbers);
            for (Object num : filteredNumbers) {
                c++;
            }
            System.out.println(initialCount-c);

        }
    }

