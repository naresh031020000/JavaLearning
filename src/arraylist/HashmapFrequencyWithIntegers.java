package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashmapFrequencyWithIntegers {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        
        System.out.println(numbers);

        // Create a map to store the frequency of each integer
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        System.out.println((frequencyMap));

        // Iterate through the list and update the frequency map
        for (Integer number : numbers) {
            // If the number is already in the map, increment its frequency by 1
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                // If the number is not in the map, add it with a frequency of 1
                frequencyMap.put(number, 1);
            }
        }

        // Display the frequency of each integer
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}

