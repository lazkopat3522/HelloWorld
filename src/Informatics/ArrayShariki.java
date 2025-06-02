package src.Informatics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayShariki {

        public static Object[] removeElementsOccurringMoreThanThrice(Object[] arr) {
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
                if (frequencyMap.get(element) <= 3) {
                    resultList.add(element);
                }
            }

            return resultList.toArray(new Object[0]); // Convert list to array
        }

        public static void main(String[] args) {
            // Example with Integers
            Integer[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 3 ,5, 5, 5, 5, 5};
            Object[] filteredNumbers = removeElementsOccurringMoreThanThrice(numbers);
            System.out.print("Filtered numbers: ");
            for (Object num : filteredNumbers) {
                System.out.print(num + " "); // Output: 1 2 2 3 3 3
            }
            System.out.println();

            // Example with Strings
            String[] words = {"apple", "banana", "apple", "orange", "banana", "apple", "grape", "apple", "banana", "banana"};
            Object[] filteredWords = removeElementsOccurringMoreThanThrice(words);
            System.out.print("Filtered words: ");
            for (Object word : filteredWords) {
                System.out.print(word + " "); // Output: orange grape
            }
            System.out.println();
        }
    }

