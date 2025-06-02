package src.Informatics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayShariki {

        public static Object[] removeBalls(Object[] arr) {
            if (arr == null || arr.length == 0) {
                return new Object[0]; // Or handle as an error, depending on requirements
            }

            Map<Object, Integer> frequencyMap = new HashMap<>();
            // Count frequencies of each element
            for (Object element : arr) {
                frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
            }

            List<Object> resultList = new ArrayList<>();
            // Add elements to resultList if their frequency is <= 3
            for (Object element : arr) {
                if (frequencyMap.get(element) <= 2) {
                    resultList.add(element);
                }
            }

            return resultList.toArray(new Object[0]); // Convert list to array
        }

        public static void main(String[] args) {
            // Example with Integers
            int c=0;
            Integer[] numbers = {1,3,3,3,4,4,5,5,5,5,4,1,1};
            int initialCount=numbers.length;
            System.out.println("First size was = "+initialCount);
            Object[] filteredNumbers = removeBalls(numbers);
            System.out.print("Filtered numbers: ");
            for (Object num : filteredNumbers) {
                c++;
                System.out.print(num + " "); // Output: 1 2 2 3 3 3
            }
            System.out.println("The number of deleted balls = "+(initialCount-c));
            System.out.println();
        }
    }

